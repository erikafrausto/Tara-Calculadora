package com.calculadora.erikafrausto.calculoerika;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    EditText txtNumA, txtNumB,lblResult;
    float NumA, NumB, Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumA = (EditText) findViewById(R.id.NumA);
        txtNumB = (EditText) findViewById(R.id.NumB);
        lblResult = (EditText) findViewById(R.id.Resul);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_sum) {
            if (String.valueOf(txtNumA.getText()).equals("")
                    ||String.valueOf(txtNumB.getText()).equals("")) {

                lblResult.setText("Error: " + "Pon Un Número");


            }else{
                NumA = Float.parseFloat(String.valueOf(txtNumA.getText()));
                NumB = Float.parseFloat(String.valueOf(txtNumB.getText()));
                Result = NumA + NumB;
                lblResult.setText("Res: " + Result);
            }
        }else if (id == R.id.action_res) {

            if (String.valueOf(txtNumA.getText()).equals("")
                    ||String.valueOf(txtNumB.getText()).equals("")) {

                lblResult.setText("Error: " + "Pon Un Número");


            }else{
                NumA = Float.parseFloat(String.valueOf(txtNumA.getText()));
                NumB = Float.parseFloat(String.valueOf(txtNumB.getText()));
                Result = NumA - NumB;
                lblResult.setText("Res: " + Result);
            }

        }else if (id == R.id.action_mul) {

            if (String.valueOf(txtNumA.getText()).equals("")
                    ||String.valueOf(txtNumB.getText()).equals("")) {

                lblResult.setText("Error: " + "Pon Un Número");


            }else{
                NumA = Float.parseFloat(String.valueOf(txtNumA.getText()));
                NumB = Float.parseFloat(String.valueOf(txtNumB.getText()));
                Result = NumA * NumB;
                lblResult.setText("Res: " + Result);
            }

        }else if (id == R.id.action_div) {

            if (String.valueOf(txtNumA.getText()).equals("")
                    ||String.valueOf(txtNumB.getText()).equals("")) {

                lblResult.setText("Error: " + "Pon Un Número");


            }else if (String.valueOf(txtNumB.getText()).equals("0")) {

                lblResult.setText("Error: " + "Div Entre 0");

            }else{

                NumA = Float.parseFloat(String.valueOf(txtNumA.getText()));
                NumB = Float.parseFloat(String.valueOf(txtNumB.getText()));
                Result = NumA / NumB;
                lblResult.setText("Res: " + Result);
            }

        } else if (id == R.id.action_limp) {
            txtNumA.setText("");
            txtNumB.setText("");
            lblResult.setText("Res: ");
        }

        return super.onOptionsItemSelected(item);
    }
}
