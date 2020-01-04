package com.king.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toast;
import java.util.Random;

@SuppressWarnings("unused")
public class MainActivity extends AppCompatActivity {
    Button opb1;
    Button opb2;
    Button opb3;
    Button opb4;

    String op1;
    String op2;
    String op3;
    String op4;
    String btn;

    TextView pro;
    TextView tvchecked ;
    int aa;
    int ans;
    int Btn ;

    @SuppressLint("SetTextI18n")
    @SuppressWarnings("unused")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();

        pro = findViewById(R.id.pro);
        tvchecked = findViewById(R.id.tvchecked);
        opb1 = (Button) findViewById(R.id.op1);
        opb2 = (Button) findViewById(R.id.op2);
        opb3 = (Button) findViewById(R.id.op3);
        opb4 = (Button) findViewById(R.id.op4);
        int a = rand.nextInt(10) + 1;
        int b = rand.nextInt(10) + 1;

        String s = a + " + " + b;
        Log.i("values", "    =" + a + "    =" + b);
        pro.setText(s);
        ans = a + b;
        aa = rand.nextInt(3 + 1);

        op1 = String.valueOf(rand.nextInt(20) + 1);
        op2 = String.valueOf(rand.nextInt(20) + 1);
        op3 = String.valueOf(rand.nextInt(20) + 1);
        op4 = String.valueOf(rand.nextInt(20) + 1);

//        opb1.setText("55");
        if (aa == 1) {
            op1 = String.valueOf(ans);
            opb1.setText(op1);
            opb2.setText(op2);
            opb3.setText(op3);
            opb4.setText(op4);
        } else if (aa == 2) {
            op2 = String.valueOf(ans);

            opb1.setText(op1);
            opb2.setText(op2);
            opb3.setText(op3);
            opb4.setText(op4);

        } else if (aa == 3) {
            op3 = String.valueOf(ans);
            opb1.setText(op1);
            opb2.setText(op2);
            opb3.setText(op3);
            opb4.setText(op4);
        } else if (aa == 4) {
            op4 = String.valueOf(ans);
            opb1.setText(op1);
            opb2.setText(op2);
            opb3.setText(op3);
            opb4.setText(op4);
        }


        Log.i("ops", String.valueOf(op1) + "   ;" + String.valueOf(op2) + "   ;" + String.valueOf(op3) + "   ;" + String.valueOf(op4));

    }






    public void ch1(View view){
        if(ans ==Integer.parseInt(op1)){
            tvchecked.setText("true !! correct 1 ");
            Toast.makeText(MainActivity.this,"true !! correct 1 ",Toast.LENGTH_SHORT).show();

        }
    }
    public void ch2(View view){
        if( ans ==Integer.parseInt(op2)){
            tvchecked.setText("true !! correct 2 ");
            Toast.makeText(MainActivity.this,"true !! correct 2 ",Toast.LENGTH_SHORT).show();

        }
    }
    public void ch3(View view){
        if(ans ==Integer.parseInt(op3)){
            tvchecked.setText("true !! correct 3 ");
            Toast.makeText(MainActivity.this,"true !! correct 3 ",Toast.LENGTH_SHORT).show();

        }
    }
    public void ch4(View view){
        if(ans ==Integer.parseInt(op4)){
            tvchecked.setText("true !! correct 4 ");
            Toast.makeText(MainActivity.this,"true !! correct 4 ",Toast.LENGTH_SHORT).show();

        }
    }}




