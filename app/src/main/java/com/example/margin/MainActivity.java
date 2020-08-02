package com.example.margin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);
        final Spinner spinnerCol = findViewById(R.id.spinner2);
        Button okCol = findViewById(R.id.button2);
        okCol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (spinnerCol.getSelectedItemPosition()) {
                    case (0):
                        Utils.changeToTheme(MainActivity.this, Utils.THEME_GREEN);
                        break;
                    case (1):
                        Utils.changeToTheme(MainActivity.this, Utils.THEME_BLACK);
                        break;
                    case (2):
                        Utils.changeToTheme(MainActivity.this, Utils.THEME_BLUE);
                        break;
                }

            }
        });

        final Spinner spinnerLoc = findViewById(R.id.spinner);
        Button okLoc = findViewById(R.id.button);
        final Locale localeRu = new Locale("ru");
        final Locale localeEn = new Locale("en");
        final Locale localeFr = new Locale("fr");
        final Configuration config = new Configuration();
        okLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (spinnerLoc.getSelectedItemPosition()) {
                    case (0):
                        config.setLocale(localeRu);
                        break;
                    case (1):
                        config.setLocale(localeEn);
                        break;
                    case (2):
                        config.setLocale(localeFr);
                        break;
                }
                getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                recreate();

            }
        });
    }
}
