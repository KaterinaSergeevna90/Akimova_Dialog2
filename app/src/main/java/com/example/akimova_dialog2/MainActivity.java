package com.example.akimova_dialog2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //переменные
    Button bgButton;
    ConstraintLayout constraintLayoutt;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgButton = (Button)findViewById(R.id.idbtn);
        constraintLayoutt = (ConstraintLayout) findViewById(R.id.idconstl);
        context = MainActivity.this;

        bgButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        final CharSequence[] items = {getText(R.string.red), getText(R.string.yellow), getText(R.string.green) };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);

        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                switch (item){
                    case 0:
                        constraintLayoutt.setBackgroundResource(R.color.redColor);
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();

                        break;
                    case 1:
                        constraintLayoutt.setBackgroundResource(R.color.yellowColor);
                        Toast.makeText(context, R.string.yellow, Toast.LENGTH_LONG).show();

                        break;
                    case 2:
                        constraintLayoutt.setBackgroundResource(R.color.greenColor);
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();

                        break;
                }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    }
