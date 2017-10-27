package com.example.tads.trabalhofragments;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class EsqFragment extends Fragment implements View.OnClickListener{


    private View btnPreto;
    private View btnAzul;
    private View btnVerde;
    private View btnVermelho;
    private View btnAmarelo;

    private cor cor1;



    public EsqFragment() {

    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(!(context instanceof cor)){
            throw new RuntimeException("errou!");
        }
        cor1 = (cor)context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_esq, container, false);

        btnPreto = v.findViewById(R.id.btnPreto);
        btnAzul = v.findViewById(R.id.btnAzul);
        btnVerde = v.findViewById(R.id.btnVerde);
        btnVermelho = v.findViewById(R.id.btnVermelho);
        btnAmarelo = v.findViewById(R.id.btnAmarelo);

        btnPreto.setOnClickListener(this);
        btnAzul.setOnClickListener(this);
        btnVerde.setOnClickListener(this);
        btnVermelho.setOnClickListener(this);
        btnAmarelo.setOnClickListener(this);

        return v;
    }


    @Override
    public void onClick(View view) {
        String teste;

            if(view.getId() == R.id.btnPreto){
                teste = "preto";
                cor1.cores(teste);
            }
            else if(view.getId() == R.id.btnAzul){
                teste = "azul";
                cor1.cores(teste);
            }
            else if(view.getId() == R.id.btnVerde){
                teste = "verde";
                cor1.cores(teste);
            }
            else if(view.getId() == R.id.btnVermelho){
                teste = "vermelho";
                cor1.cores(teste);
            }
            else if(view.getId() == R.id.btnAmarelo){
                teste = "amarelo";
                cor1.cores(teste);
            }
    }

    public interface cor{
        public void cores(String cor);
    }
}
