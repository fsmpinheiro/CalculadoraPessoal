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
    Button resultado, oper01, oper02, oper03, oper04, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        editText_Input1 = (EditText)findViewById(R.id.editText_Entrada1);
        editText_Input2 = (EditText)findViewById(R.id.editText_Entrada2);
        editText_Output = (EditText)findViewById(R.id.editText_Resultado);
        resultado = (Button)findViewById(R.id.button_Resultado);

        oper01 = (Button)findViewById(R.id.kpadSoma);
        oper02 = (Button)findViewById(R.id.kpadSubt);
        oper03 = (Button)findViewById(R.id.kpadMultip);
        oper04 = (Button)findViewById(R.id.kpadDivs);
        num0 = (Button)findViewById(R.id.kpad0);
        num1 = (Button)findViewById(R.id.kpad1);
        num2 = (Button)findViewById(R.id.kpad2);
        num3 = (Button)findViewById(R.id.kpad3);
        num4 = (Button)findViewById(R.id.kpad4);
        num5 = (Button)findViewById(R.id.kpad5);
        num6 = (Button)findViewById(R.id.kpad6);
        num7 = (Button)findViewById(R.id.kpad7);
        num8 = (Button)findViewById(R.id.kpad8);
        num9 = (Button)findViewById(R.id.kpad9);


        //atribuição de valores do teclado
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        //operação de soma
        oper01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float val1;
                Float val2;
                Float result;

                val1 = Float.parseFloat( editText_Input1.getText().toString() );
                val2 = Float.parseFloat( editText_Input2.getText().toString() );
                result = val1 + val2;

                editText_Output.setText( result.toString() );
            }
        });
        //Operação de subtração
        oper02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float val1;
                Float val2;
                Float result;

                val1 = Float.parseFloat( editText_Input1.getText().toString() );
                val2 = Float.parseFloat( editText_Input2.getText().toString() );
                result = (val1 - val2);

                editText_Output.setText( result.toString());
            }
        });
        //operação de multiplicação
        oper03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float val1;
                Float val2;
                Float result;

                val1 = Float.parseFloat( editText_Input1.getText().toString() );
                val2 = Float.parseFloat( editText_Input2.getText().toString() );
                result = (val1 * val2);

                editText_Output.setText( result.toString());
            }
        });
        //operação de divisão
        oper04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float val1;
                Float val2;
                Float result;

                val1 = Float.parseFloat( editText_Input1.getText().toString() );
                val2 = Float.parseFloat( editText_Input2.getText().toString() );

                if (val2 == 0){
                    editText_Output.setText("erro, non div by 0");
                }else{
                    result = (val1 / val2);
                    editText_Output.setText(result.toString());
                }

            }
        });

        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float val1;
                Float val2;
                Float result;

                //val1 = Double.parseDouble( editText_Input1.getText().toString() );
                //val2 = Double.parseDouble( editText_Input2.getText().toString() );
                //result = val1 + val2;
                    //Envia o resultado para a tela
                //editText_Output.setText( result.toString() );




            }
        });
    }
}
