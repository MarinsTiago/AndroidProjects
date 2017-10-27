package com.example.tads.trabalhofragments;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DirFragment extends Fragment {


    private TextView cores;

    public DirFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dir, container, false);
        cores = view.findViewById(R.id.cores);


        return view;
    }

    public void colorir(String teste){
        if(teste == "preto"){
            cores.setBackgroundColor(Color.BLACK);
        }
        else if(teste == "azul"){
            cores.setBackgroundColor(Color.BLUE);
        }
        else if(teste == "verde"){
            cores.setBackgroundColor(Color.GREEN);
        }
        else if(teste == "vermelho"){
            cores.setBackgroundColor(Color.RED);
        }
        else if(teste == "amarelo"){
            cores.setBackgroundColor(Color.YELLOW);
        }
    }

}
