package com.example.tads.trabalhofragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements EsqFragment.cor{

    private DirFragment dirFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager();
        EsqFragment esqFragment = new EsqFragment();
        dirFragment = new DirFragment();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.dir,dirFragment);
        ft.add(R.id.esq, esqFragment);
        ft.commit();

    }

    @Override
    public void cores(String cor) {
        dirFragment.colorir(cor);
    }
}
