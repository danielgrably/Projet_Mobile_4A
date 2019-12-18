package com.example.projet_mobile_4a.View;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projet_mobile_4a.Controler.Cont_bis;
import com.example.projet_mobile_4a.Controler.MyAdapter_bis;
import com.example.projet_mobile_4a.Model.Calendar;
import com.example.projet_mobile_4a.R;

import java.util.ArrayList;
import java.util.List;

public class ChabbatFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private Cont_bis controlller;
    private List<Calendar> calendarList = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_chabbat, container, false);
        recyclerView = view.findViewById(R.id.horaires_recycler_view);

        controlller = new Cont_bis(this);
        controlller.onCreate();
        return view;
    }

    public void showList(List<Calendar> list) {
        recyclerView.setHasFixedSize(true);
        calendarList = list;
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new MyAdapter_bis(list);
        recyclerView.setAdapter(mAdapter);
        attachSwipeListener();
    }

    private void attachSwipeListener() {
        ItemTouchHelper.SimpleCallback simpleItemTouchCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder
                    target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
                calendarList.remove(viewHolder.getAdapterPosition());
                mAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            }
        };

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleItemTouchCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }

}
