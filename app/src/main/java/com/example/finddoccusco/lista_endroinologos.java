package com.example.finddoccusco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class lista_endroinologos extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("Endocrinologos en el Cusco");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_endroinologos);
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

    public void yaracely(View view) {
        Intent intent = new Intent(lista_endroinologos.this,endocrinonologo1.class);
        startActivity(intent);
    }

    public void segundo(View view) {
        Intent intent = new Intent(lista_endroinologos.this,endocrinonologo2.class);
        startActivity(intent);
    }

    public void tercero(View view) {
        Intent intent = new Intent(lista_endroinologos.this,endocrinonologo3.class);
        startActivity(intent);
    }
    public void cuarto(View view) {
        Intent intent = new Intent(lista_endroinologos.this,endocrinonologo4.class);
        startActivity(intent);
    }
    public void quinto(View view) {
        Intent intent = new Intent(lista_endroinologos.this,endocrinonologo5.class);
        startActivity(intent);
    }


}