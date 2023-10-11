package com.example.calculadora_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    String expresion="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView res;

        Button num1;
        Button num2;
        Button num3;
        Button num4;
        Button num5;
        Button num6;
        Button num7;
        Button num8;
        Button num9;
        Button num0;
        Button resultado;
        Button Borrar_resultado;
        Button sumar;
        Button restar;
        Button dividir;
        Button multiplicar;

        res=findViewById(R.id.Resultado);
        res.setText(expresion);

        sumar=findViewById(R.id.Signo_Sumar);
        restar=findViewById(R.id.Signo_Restar);
        dividir=findViewById(R.id.Signo_Dividir);
        multiplicar=findViewById(R.id.Signo_Multiplicar);

        Borrar_resultado=findViewById(R.id.Borrar);
        resultado=findViewById(R.id.Igual);

        num1=findViewById(R.id.Numero1);
        num2=findViewById(R.id.Numero2);
        num3=findViewById(R.id.Numero3);
        num4=findViewById(R.id.Numero4);
        num5=findViewById(R.id.Numero5);
        num6=findViewById(R.id.Numero6);
        num7=findViewById(R.id.Numero7);
        num8=findViewById(R.id.Numero8);
        num9=findViewById(R.id.Numero9);
        num0=findViewById(R.id.Numero0);

        Borrar_resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expresion="0";
                res.setText(expresion);
            }
        });

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion!="" && expresion!="0") {
                    expresion = expresion + "+";
                    res.setText(expresion);
                }
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion!="" && expresion!="0") {
                    expresion = expresion + "-";
                    res.setText(expresion);
                }
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion!="" && expresion!="0") {
                    expresion = expresion + "/";
                    res.setText(expresion);
                }
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion!="" && expresion!="0"){
                    expresion=expresion+"x";
                    res.setText(expresion);
                }
            }
        });



        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion=="0")
                    expresion="";
                expresion=expresion+"1";
                res.setText(expresion);
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion=="0")
                    expresion="";
                expresion=expresion+"2";
                res.setText(expresion);
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion=="0")
                    expresion="";
                expresion=expresion+"3";
                res.setText(expresion);
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion=="0")
                    expresion="";
                expresion=expresion+"4";
                res.setText(expresion);
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion=="0")
                    expresion="";
                expresion=expresion+"5";
                res.setText(expresion);
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion=="0")
                    expresion="";
                expresion=expresion+"6";
                res.setText(expresion);
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion=="0")
                    expresion="";
                expresion=expresion+"7";
                res.setText(expresion);
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion=="0")
                    expresion="";
                expresion=expresion+"8";
                res.setText(expresion);
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion=="0")
                    expresion="";
                expresion=expresion+"9";
                res.setText(expresion);
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(expresion=="0")
                    expresion="";
                expresion=expresion+"0";
                res.setText(expresion);
            }
        });

        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, expresion, Toast.LENGTH_SHORT).show();
                res.setText(expresion);

            }
        });
    }

    @Override
    public void onClick(View view) {
        
    }
}