package com.example.mobilprogramlamaproje;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity2 extends AppCompatActivity
{
    BottomNavigationView bottomNavi;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bottomNavi=findViewById(R.id.bottomnavi);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentler,new Exercises()).commit();

        bottomNavi.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch (item.getItemId())
                {
                    case R.id.exercises:
                    {
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,new Exercises()).commit();
                        break;
                    }
                    case R.id.calculation:
                    {
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,new Calculation()).commit();
                        break;
                    }
                    case R.id.profile:
                    {
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,new ProfilFrag()).commit();
                        break;
                    }
                }
                return true;
            }
        });
    }
}