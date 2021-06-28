package com.example.toastsample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.displayToast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button is clicked - https://the-internet.herokuapp.com/",Toast.LENGTH_LONG).show();
            }
        });*/

        setContentView(R.layout.content_main);

        Button defaultBtn = findViewById(R.id.defaultBtn);
        defaultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar defaultSB = Snackbar
                        .make(view, "www.journaldev.com", Snackbar.LENGTH_LONG);
                defaultSB.show();

            }
        });

        Button actionCalltBtn = findViewById(R.id.actionCalltBtn);
        actionCalltBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**Message displayed on button click - normal scenario**/
                /*Snackbar snackbar = Snackbar
                        .make(v, "Message is deleted", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(view, "Message is restored!", Snackbar.LENGTH_LONG);
                                snackbar1.show();
                            }
                        });
                snackbar.show();*/

                /**Multiple elements on snackbar - message is displayed on TextView click**/
                final Snackbar snackbar = Snackbar.make(v, "UNDO MARKED AS READ", Snackbar.LENGTH_LONG);
                snackbar.setAction("DISMISS", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (snackbar != null)
                            snackbar.dismiss();
                    }
                });
                View snackbarView = snackbar.getView();
                int snackbarTextId = com.google.android.material.R.id.snackbar_text;
                TextView textView = (TextView) snackbarView.findViewById(snackbarTextId);
                textView.setTextColor(Color.GREEN);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (snackbar != null){
                            Snackbar snackbar1 = Snackbar.make(v, "TextView has been clicked!", Snackbar.LENGTH_SHORT);
                            snackbar1.show();
                            //snackbar.dismiss();
                        }

                    }
                });
                snackbar.show();
            }
        });

        Button customViewBtn = findViewById(R.id.customViewBtn);
        customViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar = Snackbar
                        .make(view, "Try again!", Snackbar.LENGTH_LONG)
                        .setAction("RETRY", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                            }
                        });
                snackbar.setActionTextColor(Color.RED);
                snackbar.show();
            }
        });

    }
}
