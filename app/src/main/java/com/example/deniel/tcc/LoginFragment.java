package com.example.deniel.tcc;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginFragment extends android.support.v4.app.Fragment implements View.OnClickListener{

    EditText editLogin;
    EditText editSenha;
    FragmentManager fragmentManager = getFragmentManager();
    String login = "user";
    String senha = "pass";
    int erro = R.string.erro;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_login, container, false);  //gerado pelo Studio
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        editLogin = (EditText) view.findViewById(R.id.login);
        editSenha = (EditText) view.findViewById(R.id.senha);
        Button entrar = (Button) view.findViewById(R.id.entrar);
        entrar.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        String login = editLogin.getText().toString();
        String senha = editSenha.getText().toString();

        if(login.equals(this.login) && senha.equals(this.senha)) {
            //chamar busca
            fragmentManager.beginTransaction()
                    .replace(R.id.container, new BuscaFragment())
                    .addToBackStack("BuscaFragment").commit();
        } else {
            Toast.makeText(getActivity().getApplicationContext(), erro, Toast.LENGTH_SHORT).show();
        }
    }
}