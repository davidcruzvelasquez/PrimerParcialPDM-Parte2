package com.example.primerparcialpdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtCompra, edtPorcentaje;
    TextView lblTotalPagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCompra = (EditText)findViewById(R.id.txbCompra);
        edtPorcentaje = (EditText)findViewById(R.id.txbPorcentaje);
        lblTotalPagar = (TextView)findViewById(R.id.txvTotalPagar);
    }

    public void calcularTotal(View view){
        if (view.getId()==R.id.btnCalcular){
            double varCompra = Double.parseDouble(edtCompra.getText().toString());
            double varPorcentaje = Double.parseDouble((edtPorcentaje.getText().toString()));
            double varDescuento = varCompra * (varPorcentaje/100);
            double varTotalPagar = varCompra - varDescuento;

            lblTotalPagar.setText("Total a Pagar: $" + varTotalPagar);

        }
    }
}