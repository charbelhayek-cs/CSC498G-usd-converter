package com.assignment1.csc498g_currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText USD;// declaring the 2 variables so that i can retrieve them
   EditText LBP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initializing USD and LBP
        USD= (EditText) findViewById(R.id.USD);
        LBP=(EditText) findViewById(R.id.LBP);
    }
    public void login(View v){
        String input_USD=USD.getText().toString();
        String input_LBP=LBP.getText().toString();
        //converting a String into a double
    //    Double inp_USD=Double.valueOf(input_USD); // i commented out those two lines because of the nullpointer exception i could've handeled it by a try catch block but it will stay a logical error although it will work and everything
       // Double inp_LBP=Double.valueOf(input_LBP);
        if(input_USD.equals("") && input_LBP.equals("")){
            String message="Please put a number in one of the cases you did not put any!";
            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
        }
         if(!input_USD.equals("") && !input_LBP.equals(""))
        {
            String message="Please put a number in one of the cases so we can connvert";
            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
        }
        else if(!input_USD.equals("") && input_LBP.equals(""))
        {
                Double inp_USD = Double.parseDouble(input_USD);
                double result = inp_USD * 22000;
                Toast.makeText(getApplicationContext(), "the result is: " + result + " LBP", Toast.LENGTH_LONG).show();

        }
        else{
            Double inp_LBP=Double.parseDouble(input_LBP);
            double result=inp_LBP/22000;
            Toast.makeText(getApplicationContext(),"the result is: "+result+" USD",Toast.LENGTH_LONG).show();
        }

    }
}