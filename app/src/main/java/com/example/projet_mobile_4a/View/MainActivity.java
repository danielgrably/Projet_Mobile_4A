package com.example.projet_mobile_4a.View;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabItem;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.projet_mobile_4a.Controler.PageAdapter;
import com.example.projet_mobile_4a.R;





public class MainActivity extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("Tab 1"));
        tabs.addTab(tabs.newTab().setText("Tab 2"));
        tabs.addTab(tabs.newTab().setText("Tab 3"));
*/
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));

        TabLayout tabLayout = findViewById(R.id.tablayout);
        TabItem tabMenu = findViewById(R.id.tabMenu);
        TabItem tabHoraires = findViewById(R.id.tabHoraires);
        TabItem tabChabbat = findViewById(R.id.tabChabbat);

        ViewPager viewPager = findViewById(R.id.viewPager);
        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        setSupportActionBar(toolbar);
        TextView mTitle = toolbar.findViewById(R.id.toolbar_title);

        setSupportActionBar(toolbar);
        mTitle.setText(toolbar.getTitle());

        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }


    public void calendrier(View view){
        //Create an Intent to start the second activity
        Intent randomIntent = new Intent(this, SecondActivity.class);

        //Start the new activity
        startActivity(randomIntent);
        Animatoo.animateDiagonal(this);
    }


    @SuppressLint("SetTextI18n")
    public void chabbat(View view){
        //Create an Intent to start the second activity
        Intent randomIntent = new Intent(this, ThirdActivity.class);

        //Start the new activity
        startActivity(randomIntent);
        Animatoo.animateDiagonal(this);
    }


    public void createur(View view){
        Toast mon_nom = Toast.makeText(this, "Daniel Elgrably",Toast.LENGTH_SHORT);
        mon_nom.show();
    }
}
