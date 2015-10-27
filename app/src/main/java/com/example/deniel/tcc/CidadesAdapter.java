package com.example.deniel.tcc;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class CidadesAdapter extends ArrayAdapter <Cidade> {

    public CidadesAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
