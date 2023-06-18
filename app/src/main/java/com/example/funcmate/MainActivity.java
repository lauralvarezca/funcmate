package com.example.funcmate;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //variables
    EditText N1, N2;
    Button btSumar, btnRestar, btnMultiplicar, btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inicializamos las variables
        N1 = (EditText) findViewById(R.id.txtnum1);
        N2 = (EditText) findViewById(R.id.txtnum2);

        btSumar = (Button) findViewById(R.id.btnsuma);
        btnRestar = (Button) findViewById(R.id.btnresta);
        btnMultiplicar = (Button) findViewById(R.id.btnmultiplicacion);
        btnDividir = (Button) findViewById(R.id.btndivision);

        btSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2, resultado;
                n1 = Double.valueOf(N1.getText().toString()) ;
                n2 = Double.valueOf(N2.getText().toString()) ;
                resultado = n1 + n2;


                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);
                intent.putExtra("resultado","Resultado de la suma: "+resultado);
                startActivity(intent);

            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2, resultado;

                n1 = Double.valueOf(N1.getText().toString()) ;
                n2 = Double.valueOf(N2.getText().toString()) ;
                resultado = n1 - n2;

                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);
                intent.putExtra("resultado","Resultado de la resta: "+resultado);
                startActivity(intent);

            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2, resultado;
                n1 = Double.valueOf(N1.getText().toString()) ;
                n2 = Double.valueOf(N2.getText().toString()) ;
                resultado = n1 * n2;

                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);
                intent.putExtra("resultado","Resultado de la multiplicación: "+resultado);//se crea una variable global con el nombre de resultado
                startActivity(intent);

            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2, resultado;
                n1 = Double.valueOf(N1.getText().toString()) ;
                n2 = Double.valueOf(N2.getText().toString()) ;
                resultado = n1 / n2;

                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);
                intent.putExtra("resultado","Resultado de la division: "+resultado);
                startActivity(intent);

            }
        });


    }
}