package com.example.projet_mobile_4a.View;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.projet_mobile_4a.R;


public class MenuFragment extends Fragment {


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        Button button = view.findViewById(R.id.createur_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Toast mon_nom = Toast.makeText(getActivity(), "Daniel Elgrably",Toast.LENGTH_SHORT);
                    mon_nom.show();
            }
        });
        return view;
    }

}
