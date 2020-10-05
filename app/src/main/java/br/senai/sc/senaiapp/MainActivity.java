package br.senai.sc.senaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editText1 = findViewById(R.id.et_Nome);
        this.editText2 = findViewById(R.id.et_Sobrenome);
    }

    @Override
    protected void onStart() {super.onStart();}

    public void onClickBtnMostrar(View v) {
        Toast.makeText(MainActivity.this, editText1.getText() + " " + editText2.getText(), Toast.LENGTH_LONG).show();
    }

    public void onClickBtnLimpar(View v) {
        editText1.setText(" ");
        editText2.setText(" ");
    }

}