package com.example.finddoccusco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuintoMedicogeneral extends AppCompatActivity {
    MediaPlayer mp;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("Dr. Eva Luna Bautizta");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinto_medicogeneral);
        mp = MediaPlayer.create(this, R.raw.musica1);
        mp.start();
        btn = findViewById(R.id.btnwsp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PackageManager pm = getPackageManager();
                boolean isInstalled = isPackageInstalled("com.whatsapp", pm);


                startActivity(
                        new Intent(Intent.ACTION_VIEW,
                                Uri.parse(
                                        String.format("https://api.whatsapp.com/send?phone=%s&text=%s", "+51984217647", "Hola!, tengo un consulta... ")
                                )
                        )
                );

            }
        });
    }

    private boolean isPackageInstalled(String packageName, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
    private boolean isAppInstalled(String s) {
        PackageManager packageManager = getPackageManager();
        boolean is_installed;
        try {
            packageManager.getPackageInfo(s, PackageManager.GET_ACTIVITIES);
            is_installed = true;
        } catch (PackageManager.NameNotFoundException e) {
            is_installed = false;
            e.printStackTrace();
        }
        return is_installed;
    }


    @Override
    protected void onResume()
    {
        super.onResume();
        mp.start();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        mp.pause();


    }

    public void uwilson(View view) {
        Intent intent = new Intent(QuintoMedicogeneral.this,medicoquinto.class);
        startActivity(intent);
    }
}

