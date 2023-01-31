package com.example.calculadora11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText pantalla;
    TextView pantallafunciones, pantallaresultados;
    int n1, n2,rtotal, valor1, contador = 0;
    int resultado;
    int mmpp=1;
    String operacion, vasia = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = findViewById(R.id.textpantalla);
        pantallaresultados = findViewById(R.id.texresultado); // comunicando java con XML
        pantallafunciones = findViewById(R.id.textfuntion);
    }
    public void setnumero8(View view) {pantalla.setText(pantalla.getText() + "8");}
    public void setnumero7(View view) {
        pantalla.setText(pantalla.getText() + "7");
    }
    public void setnumero4(View view) {
        pantalla.setText(pantalla.getText() + "4");
    }
    public void setnumero5(View view) {pantalla.setText(pantalla.getText() + "5");}
    public void setnumero6(View view) {pantalla.setText(pantalla.getText() + "6");} //funciones para establecer botones en la pantalla
    public void setnumero1(View view) {pantalla.setText(pantalla.getText() + "1");}
    public void setnumero2(View view) {pantalla.setText(pantalla.getText() + "2");}
    public void setnumero3(View view) {pantalla.setText(pantalla.getText() + "3");}
    public void setnumero0(View view) {
        pantalla.setText(pantalla.getText() + "0");
    }
    public void setnumero9(View view) {
        pantalla.setText(pantalla.getText() + "9");
    }

    public void limpiar(View view) { n1 = 0; n2 = 0; resultado = 0; valor1= 0; mmpp=0; //funcion limpiar pantalla
        pantalla.setText(""); pantallafunciones.setText("");pantallaresultados.setText("");
    }

    public void suma (View view){ //suma funcion
        try{
            pantallafunciones.setText("+"); //operacion suma para la funcion igual
            n1 = Integer.parseInt(pantalla.getText().toString());//obtengo numero
            pantalla.setText("");  ///reset pantalla
            pantallaresultados.setText(Integer.toString(n1)); //guardo en la otra pantalla rsultados
            resultado += n1;      //realizo la operacion r = 0+ lo que tengo en la pantalla
            pantallaresultados.setText(Integer.toString(resultado)); // lo muestro en la pantalla
            valor1 = n1; // para usar en la funcion igual
            n1 =0;
        }catch (Exception e){pantalla.setText("Error");}}


    public  void  resta(View i){ //resta fucion
        try {pantallafunciones.setText("-"); //operacion suma para la funcion igual
            n1 = Integer.parseInt(pantalla.getText().toString());
            pantalla.setText("");
        }catch (Exception e){}}

    public void multiplicacion (View view) { // funcion multiplicaccion
        try {pantallafunciones.setText("*");
            n1 = Integer.parseInt(pantalla.getText().toString());
            pantalla.setText("");
            mmpp = mmpp * n1;

           pantallaresultados.setText(Integer.toString(mmpp));
            valor1 = n1;
        }catch (Exception e){
            pantalla.setText("");
        }
    }
    public void divicion (View view) { // funcion divicion
        try {
            pantallafunciones.setText("/");
            n1 = Integer.parseInt(pantalla.getText().toString());
            pantalla.setText("");
        }catch (Exception e){
            pantalla.setText("");
        }
    }

    public  void resuladooperacion (View i){ //funcion igual, del boton igual
        try {
            if (pantallafunciones.getText() == "+"){ //idenficador de la funcion suma
                pantallafunciones.setText("");    //limpio la pantalla de las funciones
                n1 = Integer.parseInt(pantallaresultados.getText().toString()); //guardo valor de la pantalla rsultados
                n2 =Integer.parseInt(pantalla.getText().toString()); //guardo el valor de la pantalla principal
                valor1 = n1 + n2;  //realizo la suma
                pantallaresultados.setText(Integer.toString(valor1)); //muestro la salida de la suma

            }else  if (pantallafunciones.getText() == "-"){

                n2 = Integer.parseInt(pantalla.getText().toString());
                resultado = n1 - n2;
                String str;
                pantallaresultados.setText(Integer.toString(resultado));
                pantalla.setText("");

            }else if (pantallafunciones.getText() == "/"){ //divicion
                try {
                    n2 = Integer.parseInt(pantalla.getText().toString());
                    resultado = n1 / n2;
                    String str;
                    pantalla.setText(str = Integer.toString(resultado));
                } catch (Exception e) {
                    pantalla.setText("no valido");
                }
            }

            else if (pantallafunciones.getText() == "*"){ // multiplicacion
                try {

                    n2 = Integer.parseInt(pantalla.getText().toString());
                    resultado = valor1 * n2;
                    String str;
                    pantallaresultados.setText(str = Integer.toString(resultado));
                } catch (Exception e) {
                    pantalla.setText("no valido");
                }
            }

        }catch (Exception e){}
    }
}