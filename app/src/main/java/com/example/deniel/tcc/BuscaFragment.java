package com.example.deniel.tcc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BuscaFragment extends android.support.v4.app.Fragment implements Runnable {

    public BuscaFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_busca, container, false);
        View view = inflater.inflate(R.layout.fragment_busca, container, false);
        Button procurar = (Button) view.findViewById(R.id.procurar);

        return view;
    }

    @Override
    public void run() {

    }
}
