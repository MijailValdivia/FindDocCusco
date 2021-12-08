package com.example.finddoccusco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class lista_cardiologos extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("Cardialogos en el Cusco");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cardiologos);
        mp = MediaPlayer.create(this, R.raw.musica2);
        mp.start();
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

    public void primero(View view) {
        Intent intent = new Intent(lista_cardiologos.this,cardiologo1.class);
        startActivity(intent);
    }

    public void segundo(View view) {
        Intent intent = new Intent(lista_cardiologos.this,cardiologo2.class);
        startActivity(intent);
    }

    public void tercero(View view) {
        Intent intent = new Intent(lista_cardiologos.this,cardiologo3.class);
        startActivity(intent);
    }
    public void cuarto(View view) {
        Intent intent = new Intent(lista_cardiologos.this,cardiologo4.class);
        startActivity(intent);
    }
    public void quinto(View view) {
        Intent intent = new Intent(lista_cardiologos.this,cardiologo5.class);
        startActivity(intent);
    }


}