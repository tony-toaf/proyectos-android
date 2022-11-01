package com.example.calculadora11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText pantalla;
    TextView pantallafunciones, pantallaresultados;
    int n1, n2,p1, p2, resultado;
    String operacion;
    Editable obtenidopantalla;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla = (EditText) findViewById(R.id.textpantalla);
        pantallaresultados = (TextView) findViewById(R.id.texresultado);
        pantallafunciones = (TextView) findViewById(R.id.textfuntion);
    }


    public void setnumero8(View view) {

        pantalla.setText(pantalla.getText() + "8");
    }

    public void setnumero9(View view) {

        pantalla.setText(pantalla.getText() + "9");
    }
    public void setnumero7(View view) {

        pantalla.setText(pantalla.getText() + "7");
    }


    public void setnumero4(View view) {

        pantalla.setText(pantalla.getText() + "4");
    }

    public void setnumero5(View view) {

        pantalla.setText(pantalla.getText() + "5");
    }
    public void setnumero6(View view) {

        pantalla.setText(pantalla.getText() + "6");
    }
    public void setnumero1(View view) {

        pantalla.setText(pantalla.getText() + "1");
    }
    public void setnumero2(View view) {

        pantalla.setText(pantalla.getText() + "2");
    }
    public void setnumero3(View view) {

        pantalla.setText(pantalla.getText() + "3");
    }

    public void limpiar(View view) {
        pantalla.setText("");
        pantallafunciones.setText("");
        pantallaresultados.setText("");
    }
    public void setnumero0(View view) {

        pantalla.setText(pantalla.getText() + "0");
    }

   public  void  suma(View vista) {
       operacion = "suma";
       pantallafunciones.setText("+");
       n1 = Integer.parseInt(pantalla.getText().toString());
       p1 = Integer.parseInt(pantalla.getText().toString());
       pantalla.setText("");


   }
    public void resta(View view) { // funcion resta
        try {
            operacion = "resta";
            n1 = Integer.parseInt(pantalla.getText().toString());
            pantalla.setText("");
        }catch (Exception e){
            pantalla.setText("");
        }
    }
    public void multiplicacion (View view) { // funcion multiplicaccion
        try {
            operacion = "multiplicacion";
            n1 = Integer.parseInt(pantalla.getText().toString());
            pantalla.setText("");
        }catch (Exception e){
            pantalla.setText("");
        }
    }
    public void divicion (View view) { // funcion divicion
        try {
            operacion = "divicion";
            n1 = Integer.parseInt(pantalla.getText().toString());
            pantalla.setText("");
        }catch (Exception e){
            pantalla.setText("");
        }
    }




    public void resuladooperacion(View view) { // funcion resultado
        if (operacion == "suma") { //suma

            try {

                n2 = Integer.parseInt(pantalla.getText().toString());
                resultado = n1+n2;
                String str;
                pantallaresultados.setText(str = Integer.toString(resultado));

            } catch (Exception e) {
                pantalla.setText("rrr");
            }
        }
        else if (operacion == "resta"){  //resta
            try {
                n2 = Integer.parseInt(pantalla.getText().toString());
                resultado = n1 - n2;
                String str;
                pantalla.setText(str = Integer.toString(resultado));
            } catch (Exception e) {
                pantalla.setText("no valido");
            }
        }

        else if (operacion == "divicion"){ //divicion
            try {
                n2 = Integer.parseInt(pantalla.getText().toString());
                resultado = n1 / n2;
                String str;
                pantalla.setText(str = Integer.toString(resultado));
            } catch (Exception e) {
                pantalla.setText("no valido");
            }
        }

        else if (operacion == "multiplicacion"){ // multiplicacion
            try {
                n2 = Integer.parseInt(pantalla.getText().toString());
                resultado = n1 * n2;
                String str;
                pantalla.setText(str = Integer.toString(resultado));
            } catch (Exception e) {
                pantalla.setText("no valido");
            }
        }
    }


}