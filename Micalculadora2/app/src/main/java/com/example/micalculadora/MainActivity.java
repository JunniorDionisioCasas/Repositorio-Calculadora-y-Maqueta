package com.example.micalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtResultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);

    }

    public void Escribir7(View view) {
        float numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f){
            txtResultado.setText("7");
        }else{
            txtResultado.setText(txtResultado.getText() + "7");
        }
        }

    public void Escribirocho(View view) {
        float numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f){
            txtResultado.setText("8");
        }else{
            txtResultado.setText(txtResultado.getText() + "8");
        }
    }

    public void LimpiarResultadoAC(View view) {
        txtResultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }

    public void OperacionDividir(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        operacion= "/";
        txtResultado.setText("0");
    }

    public void MostrarResultado(View view) {
        numero2 = Float.parseFloat(txtResultado.getText().toString());
        if (operacion.equals("/")){
            if (numero2 == 0.0f){
                txtResultado.setText("0");
                Toast.makeText(this,"OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
            }else{
                float result = numero1 / numero2;
                txtResultado.setText(result + "");
            }
        }else if(operacion.equals("x")){
            float result = numero1 * numero2;
            txtResultado.setText(result + "");
        }else if(operacion.equals("+")){
            float result = numero1 + numero2;
            txtResultado.setText(result + "");
        }else if(operacion.equals("-")){
            float result = numero1 - numero2;
            txtResultado.setText(result + "");
        }
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }
    public void Escribirnueve(View view) {
        float  numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f){
            txtResultado.setText("9");
        }else{
            txtResultado.setText(txtResultado.getText() + "9");
        }
    }


    public void Escribircuatro(View view) {
        float numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f){
            txtResultado.setText("4");
        }else{
            txtResultado.setText(txtResultado.getText() + "4");
        }
    }

    public void Escribircinco5(View view) {
        float  numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f){
            txtResultado.setText("5");
        }else{
            txtResultado.setText(txtResultado.getText() + "5");
        }
    }

    public void Escribirseis(View view) {
        float  numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f){
            txtResultado.setText("6");
        }else{
            txtResultado.setText(txtResultado.getText() + "6");
        }
    }

    public void Escribiruno(View view) {
        float  numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f){
            txtResultado.setText("1");
        }else{
            txtResultado.setText(txtResultado.getText() + "1");
        }
    }

    public void Escribirdos(View view) {
        float  numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f){
            txtResultado.setText("2");
        }else{
            txtResultado.setText(txtResultado.getText() + "2");
        }
    }

    public void Escribirtres(View view) {
        float  numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f){
            txtResultado.setText("3");
        }else{
            txtResultado.setText(txtResultado.getText() + "3");
        }
    }

    public void Escribircero(View view) {
        float numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f){
            txtResultado.setText("0");
        }else{
            txtResultado.setText(txtResultado.getText() + "0");
        }
    }

    public void OperacionMultiplicacion(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        operacion= "x";
        txtResultado.setText("0");
    }

    public void OperacionResta(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        operacion= "-";
        txtResultado.setText("0");
    }

    public void Operacionsuma(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        operacion= "+";
        txtResultado.setText("0");
    }

    public void Escribircoma(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f){
            txtResultado.setText(",");
        }else{
            txtResultado.setText(txtResultado.getText() + ",");
        }
    }
    }










