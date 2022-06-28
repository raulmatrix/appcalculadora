package com.example.calculadoraaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText pantalla;
    double operando1,operando2,respuesta;
    int operacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla = (EditText) findViewById(R.id.etresultado);
    }

    //para los botones
    public void boton1(View v){
        String captura = pantalla.getText().toString();
        captura = captura+"1";
        pantalla.setText(captura);
    }
    public void boton2(View v){
        String captura = pantalla.getText().toString();
        captura = captura+"2";
        pantalla.setText(captura);
    }
    public void boton3(View v){
        String captura = pantalla.getText().toString();
        captura = captura+"3";
        pantalla.setText(captura);
    }
    public void boton4(View v){
        String captura = pantalla.getText().toString();
        captura = captura+"4";
        pantalla.setText(captura);
    }

    /*******operaciones********/

    public void suma(View v){
        String aux = pantalla.getText().toString();
        operando1 = Double.parseDouble(aux);
        pantalla.setText("");
        operacion=1;//valor 1 significa sumar
    }



    /**********operacion completa con los 2 operandos************/

    public void igual(View v){
        String aux2 = pantalla.getText().toString();
        operando2 = Double.parseDouble(aux2);
        pantalla.setText("");

        if (operacion==1){
            respuesta = operando1+operando2; //sumar los operandos
        }

        pantalla.setText(respuesta+"");
        operando1 = respuesta; //forma repetitiva para cada accion de operacion
    }

}
