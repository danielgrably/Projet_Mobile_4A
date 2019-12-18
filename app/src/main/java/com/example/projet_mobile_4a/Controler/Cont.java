package com.example.projet_mobile_4a.Controler;


import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.example.projet_mobile_4a.Model.Calendar;
import com.example.projet_mobile_4a.Model.RestCalendarResponse;
import com.example.projet_mobile_4a.View.CalendrierFragment;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Cont {

    private static final String PREFS = "PREFS";
    private static final String LIST_KEY = "list";


    private List<Calendar> calendarList;
    private CalendrierFragment view;
    private SharedPreferences sharedPreferences;


    public Cont(CalendrierFragment view) {
        this.view = view;
    }

    public void onCreate() {

        //Créer objet Gson
        final Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        //Créer objet retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.hebcal.com/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        sharedPreferences = Objects.requireNonNull(view.getContext()).getSharedPreferences(PREFS, Context.MODE_PRIVATE);

        if (sharedPreferences.contains(LIST_KEY)) {
            String listJson = sharedPreferences.getString(LIST_KEY, null);
            Type listType = new TypeToken<List<Calendar>>() {
            }.getType();
            List<Calendar> list = gson.fromJson(listJson, listType);
            view.showList(list);
        } else {
            RestCalendarAPI restCalendarAPI = retrofit.create(RestCalendarAPI.class);
            Call<RestCalendarResponse> call = restCalendarAPI.getListCalendar();
            call.enqueue(new Callback<RestCalendarResponse>() {
                @Override
                public void onResponse(Call<RestCalendarResponse> call, Response<RestCalendarResponse> response) {
                    RestCalendarResponse restCalendarResponse = response.body();
                    calendarList = restCalendarResponse.getItems();
                    view.showList(calendarList);

                    sharedPreferences
                            .edit()
                            .putString(LIST_KEY, gson.toJson(calendarList))
                            .apply();
                }

                @Override
                public void onFailure(Call<RestCalendarResponse> call, Throwable t) {
                    Log.d("ERROR", "Api Error");
                }
            });
        }
    }
}

