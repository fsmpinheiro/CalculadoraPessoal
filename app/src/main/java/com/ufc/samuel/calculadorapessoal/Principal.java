package com.ufc.samuel.calculadorapessoal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    EditText editText_Input1;
    EditText editText_Input2;
    EditText editText_Output;
    Button resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        editText_Input1 = (EditText)findViewById(R.id.editText_Entrada1);
        editText_Input2 = (EditText)findViewById(R.id.editText_Entrada2);
        editText_Output = (EditText)findViewById(R.id.editText_Resultado);
        resultado = (Button)findViewById(R.id.button_Resultado);


        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double val1;
                Double val2;
                Double result;

                val1 = Double.parseDouble( editText_Input1.getText().toString() );
                val2 = Double.parseDouble( editText_Input2.getText().toString() );

                result = val1 + val2;

                editText_Output.setText( result.toString() );




            }
        });
    }
}
