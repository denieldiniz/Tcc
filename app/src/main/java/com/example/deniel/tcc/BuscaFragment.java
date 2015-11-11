package com.example.deniel.tcc;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class BuscaFragment extends android.support.v4.app.Fragment implements Runnable, View.OnClickListener {

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
        procurar.setOnClickListener(this);

        return view;
    }

    @Override
    public void run() {

    }

    @Override
    public void onClick(View v) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    JsonParser parser = new JsonParser();
                    JSONObject obct = parser.getJSONFromUrl("http://api.geonames.org/citiesJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&lang=de&username=demo");
                    JSONArray array = obct.getJSONArray("geonames");
                    ArrayList<JSONObject> list = new ArrayList<JSONObject>();
                    for (int i = 0; i < array.length(); i++) {
                        list.add(array.getJSONObject(i));
                    }
                    Log.v("tamanho", "tamanho:" + array.length());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}
