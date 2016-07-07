package com.example.leo.relojcalculadora;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends Activity {

    private int base = 0; //0->hexadecimal 1->decimal 2->octal 3->binario
    private int operacion = 0;
    private int num1 = 0;
    private int num2 = 0;
    private TextView tv_hex, tv_dec,  tv_oct, tv_bin;
    private EditText et_hex, et_dec, et_oct, et_bin;
    private Button b_0, b_1, b_2, b_3, b_4, b_5, b_6, b_7, b_8, b_9, b_a, b_b, b_c, b_d, b_e, b_f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                //mTextView = (TextView) stub.findViewById(R.id.text);
                tv_hex = (TextView) findViewById(R.id.tv_hex);
                et_hex = (EditText) findViewById(R.id.et_hex);
                tv_dec = (TextView) findViewById(R.id.tv_dec);
                et_dec = (EditText) findViewById(R.id.et_dec);
                tv_oct = (TextView) findViewById(R.id.tv_oct);
                et_oct = (EditText) findViewById(R.id.et_oct);
                tv_bin = (TextView) findViewById(R.id.tv_bin);
                et_bin = (EditText)  findViewById(R.id.et_bin);
                //botones
                b_0 = (Button) findViewById(R.id.b_0);
                b_1 = (Button) findViewById(R.id.b_1);
                b_2 = (Button) findViewById(R.id.b_2);
                b_3 = (Button) findViewById(R.id.b_3);
                b_4 = (Button) findViewById(R.id.b_4);
                b_5 = (Button) findViewById(R.id.b_5);
                b_6 = (Button) findViewById(R.id.b_6);
                b_7 = (Button) findViewById(R.id.b_7);
                b_8 = (Button) findViewById(R.id.b_8);
                b_9 = (Button) findViewById(R.id.b_9);
                b_a = (Button) findViewById(R.id.b_a);
                b_b = (Button) findViewById(R.id.b_b);
                b_c = (Button) findViewById(R.id.b_c);
                b_d = (Button) findViewById(R.id.b_d);
                b_e = (Button) findViewById(R.id.b_e);
                b_f = (Button) findViewById(R.id.b_f);
            }
        });

    }
    public void clickTextView(View v){
        clear();
        switch(v.getId()) {
            case R.id.tv_hex:
                base = 0;
                //activamos hexadecimal
                tv_hex.setTextSize(12);
                tv_hex.setTextColor(getResources().getColor(R.color.verde));
                et_hex.setBackgroundResource(R.color.blanco);
                //desactivamos decimal
                tv_dec.setTextSize(10);
                tv_dec.setTextColor(getResources().getColor(R.color.blanco));
                et_dec.setBackgroundResource(R.color.gris);
                //desactivamos octal
                tv_oct.setTextSize(10);
                tv_oct.setTextColor(getResources().getColor(R.color.blanco));
                et_oct.setBackgroundResource(R.color.gris);
                //desactivamos binario
                tv_bin.setTextSize(10);
                tv_bin.setTextColor(getResources().getColor(R.color.blanco));
                et_bin.setBackgroundResource(R.color.gris);

                //activar todos los botones
                b_2.setEnabled(true);
                b_3.setEnabled(true);
                b_4.setEnabled(true);
                b_5.setEnabled(true);
                b_6.setEnabled(true);
                b_7.setEnabled(true);
                b_8.setEnabled(true);
                b_9.setEnabled(true);

                b_a.setEnabled(true);
                b_b.setEnabled(true);
                b_c.setEnabled(true);
                b_d.setEnabled(true);
                b_e.setEnabled(true);
                b_f.setEnabled(true);

                break;
            //decimal
            case R.id.tv_dec:
                base = 1;
                //activamos decimal
                //tv_dec.setBackgroundResource(R.color.verde);
                tv_dec.setTextSize(12);
                tv_dec.setTextColor(getResources().getColor(R.color.verde));
                et_dec.setBackgroundResource(R.color.blanco);
                //desactivamos hexadecimal
                tv_hex.setTextSize(10);
                tv_hex.setTextColor(getResources().getColor(R.color.blanco));
                et_hex.setBackgroundResource(R.color.gris);
                //desactivamos octal
                tv_oct.setTextSize(10);
                tv_oct.setTextColor(getResources().getColor(R.color.blanco));
                et_oct.setBackgroundResource(R.color.gris);
                //desactivamos binario
                tv_bin.setTextSize(10);
                tv_bin.setTextColor(getResources().getColor(R.color.blanco));
                et_bin.setBackgroundResource(R.color.gris);

                b_2.setEnabled(true);
                b_3.setEnabled(true);
                b_4.setEnabled(true);
                b_5.setEnabled(true);
                b_6.setEnabled(true);
                b_7.setEnabled(true);
                b_8.setEnabled(true);
                b_9.setEnabled(true);

                b_a.setEnabled(false);
                b_b.setEnabled(false);
                b_c.setEnabled(false);
                b_d.setEnabled(false);
                b_e.setEnabled(false);
                b_f.setEnabled(false);

                break;

            //octal
            case R.id.tv_oct:
                base = 2;
                //desactivamos decimal
                tv_dec.setTextSize(10);
                tv_dec.setTextColor(getResources().getColor(R.color.blanco));
                et_dec.setBackgroundResource(R.color.gris);
                //activamos hexadecimal
                tv_hex.setTextSize(10);
                tv_hex.setTextColor(getResources().getColor(R.color.blanco));
                et_hex.setBackgroundResource(R.color.gris);
                //activamos octal
                tv_oct.setTextSize(12);
                tv_oct.setTextColor(getResources().getColor(R.color.verde));
                et_oct.setBackgroundResource(R.color.blanco);
                //desactivamos binario
                tv_bin.setTextSize(10);
                tv_bin.setTextColor(getResources().getColor(R.color.blanco));
                et_bin.setBackgroundResource(R.color.gris);

                b_2.setEnabled(true);
                b_3.setEnabled(true);
                b_4.setEnabled(true);
                b_5.setEnabled(true);
                b_6.setEnabled(true);
                b_7.setEnabled(true);
                b_8.setEnabled(false);
                b_9.setEnabled(false);

                b_a.setEnabled(false);
                b_b.setEnabled(false);
                b_c.setEnabled(false);
                b_d.setEnabled(false);
                b_e.setEnabled(false);
                b_f.setEnabled(false);

                break;

            case R.id.tv_bin:
                base = 3;
                //desactivamos decimal
                tv_dec.setTextSize(10);
                tv_dec.setTextColor(getResources().getColor(R.color.blanco));
                et_dec.setBackgroundResource(R.color.gris);
                //desactivamos hexadecimal
                tv_hex.setTextSize(10);
                tv_hex.setTextColor(getResources().getColor(R.color.blanco));
                et_hex.setBackgroundResource(R.color.gris);
                //desactivamos octal
                tv_oct.setTextSize(10);
                tv_oct.setTextColor(getResources().getColor(R.color.blanco));
                et_oct.setBackgroundResource(R.color.gris);
                //activamos binario
                tv_bin.setTextSize(12);
                tv_bin.setTextColor(getResources().getColor(R.color.verde));
                et_bin.setBackgroundResource(R.color.blanco);


                b_2.setEnabled(false);
                b_3.setEnabled(false);
                b_4.setEnabled(false);
                b_5.setEnabled(false);
                b_6.setEnabled(false);
                b_7.setEnabled(false);
                b_8.setEnabled(false);
                b_9.setEnabled(false);

                b_a.setEnabled(false);
                b_b.setEnabled(false);
                b_c.setEnabled(false);
                b_d.setEnabled(false);
                b_e.setEnabled(false);
                b_f.setEnabled(false);

                break;
        }
    }
    public void clickButton(View v) {
        Button b = (Button) v;
        String buttonText = b.getText().toString(); //almacena el texto del boton pulsado
        String valor_actual = "";

        switch(v.getId()) {
            case R.id.b_sum:
                operacion = 1;
                num1 = Integer.parseInt(et_dec.getText().toString());
                decTo("0");
                break;
            case R.id.b_res:
                operacion = 2;
                num1 = Integer.parseInt(et_dec.getText().toString());
                decTo("0");
                break;
            case R.id.b_mul:
                operacion = 3;
                num1 = Integer.parseInt(et_dec.getText().toString());
                decTo("0");
                break;
            case R.id.b_div:
                operacion = 4;
                num1 = Integer.parseInt(et_dec.getText().toString());
                decTo("0");
                break;
            case R.id.b_igual:
                //suma
                int resul=0;
                if(operacion==1){
                    num2 = Integer.parseInt(et_dec.getText().toString());
                    resul = num1 + num2;
                    decTo(String.valueOf(resul));
                    num2 = 0;
                    operacion = 0;
                }
                //resta
                else if(operacion==2){
                    num2 = Integer.parseInt(et_dec.getText().toString());
                    resul = num1 - num2;
                    decTo(String.valueOf(resul));
                    num2=0;
                    operacion = 0;
                }
                //multiplicación
                else if(operacion==3){
                    num2 = Integer.parseInt(et_dec.getText().toString());
                    resul = num1 * num2;
                    decTo(String.valueOf(resul));
                    num2=0;
                    operacion = 0;
                }
                //división
                else if(operacion==4){
                    num2 = Integer.parseInt(et_dec.getText().toString());
                    resul = num1 / num2;
                    decTo(String.valueOf(resul));
                    num2=0;
                    operacion = 0;
                }
                break;
            case R.id.b_clear:
                clear();
                break;
            case R.id.b_ce:
                String cadena,cadenaNueva;
                if (base==0) {
                    cadena = et_hex.getText().toString();
                    cadenaNueva = cadena.substring(0, cadena.length() - 1);

                    if (cadenaNueva.length() != 0)
                        hexTo(cadenaNueva);
                    else
                        clear();
                }
                else if(base==1){
                    cadena = et_dec.getText().toString();
                    cadenaNueva = cadena.substring(0, cadena.length() - 1);

                    if (cadenaNueva.length() != 0)
                        decTo(cadenaNueva);
                    else
                        clear();
                }
                else if(base==2){
                    cadena = et_oct.getText().toString();
                    cadenaNueva = cadena.substring(0, cadena.length() - 1);

                    if (cadenaNueva.length() != 0)
                        octTo(cadenaNueva);
                    else
                        clear();
                }
                else if(base==3){
                    cadena = et_bin.getText().toString();
                    cadenaNueva = cadena.substring(0, cadena.length() - 1);

                    if (cadenaNueva.length() != 0)
                        binTo(cadenaNueva);
                    else
                        clear();
                }
                break;
            default:
                // hexadecimal
                if (base==0) {
                    valor_actual = et_hex.getText().toString();
                    if (!valor_actual.equals("0"))
                        valor_actual += buttonText;
                    else
                        valor_actual = buttonText;

                    hexTo(valor_actual);

                }
                // decimal
                else if (base == 1) {
                    valor_actual = et_dec.getText().toString();
                    if (!valor_actual.equals("0"))
                        valor_actual += buttonText;
                    else
                        valor_actual = buttonText;

                    decTo(valor_actual);
                }
                // octal
                else if(base==2){
                    valor_actual = et_oct.getText().toString();
                    if (!valor_actual.equals("0"))
                        valor_actual += buttonText;
                    else
                        valor_actual = buttonText;

                    octTo(valor_actual);
                }
                // binario
                else if(base==3){
                    valor_actual = et_bin.getText().toString();
                    if (!valor_actual.equals("0"))
                        valor_actual += buttonText;
                    else
                        valor_actual = buttonText;

                    binTo(valor_actual);
                }

                break;

        }

    }
    public void hexTo(String valor_actual) {
        String octal,decimal,binario;
        BigInteger bigInt = new BigInteger(valor_actual, 16); //crea un big integer pasandole un string en hexadecimal
        octal = bigInt.toString(8);
        decimal = bigInt.toString(10);
        binario = bigInt.toString(2);

        et_hex.setText(valor_actual);
        et_dec.setText(decimal);
        et_oct.setText(octal);
        et_bin.setText(binario);
    }
    public void decTo(String valor_actual) {
        String octal,hexadecimal,binario;
        BigInteger bigInt = new BigInteger(valor_actual, 10); //crea un big integer pasandole un string en decimal
        octal = bigInt.toString(8);
        hexadecimal = bigInt.toString(16).toUpperCase();
        binario = bigInt.toString(2);
        et_hex.setText(hexadecimal);
        et_dec.setText(valor_actual);
        et_oct.setText(octal);
        et_bin.setText(binario);
    }
    public void octTo(String valor_actual) {
        String decimal,hexadecimal,binario;
        BigInteger bigInt = new BigInteger(valor_actual, 8); //crea un big integer pasandole un string en octal
        decimal = bigInt.toString(10);
        hexadecimal = bigInt.toString(16).toUpperCase();
        binario = bigInt.toString(2);
        et_hex.setText(hexadecimal);
        et_dec.setText(decimal);
        et_oct.setText(valor_actual);
        et_bin.setText(binario);
    }
    public void binTo(String valor_actual) {
        String decimal,hexadecimal,octal;
        BigInteger bigInt = new BigInteger(valor_actual, 2); //crea un big integer pasandole un string en binario
        decimal = bigInt.toString(10);
        hexadecimal = bigInt.toString(16).toUpperCase();
        octal = bigInt.toString(8);
        et_hex.setText(hexadecimal);
        et_dec.setText(decimal);
        et_oct.setText(octal);
        et_bin.setText(valor_actual);
    }
    public void clear() {
        et_hex.setText("0");
        et_dec.setText("0");
        et_oct.setText("0");
        et_bin.setText("0");
    }
}
