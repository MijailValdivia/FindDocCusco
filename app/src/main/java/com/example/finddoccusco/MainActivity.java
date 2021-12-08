package com.example.finddoccusco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final long SPLASH_SCREEN_DELAY = 3000;
    //variables
    Animation topAnim, bottomanim;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /////////////////////////////////
        this.setTitle(" ");
        ////////////////////////////////
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Animacion
        topAnim = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        bottomanim = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);
        //Lògica y diseño
        image = findViewById(R.id.imageView3);
        image.setAnimation(bottomanim);

    }

    public void entrar(View view) {
        Intent intent = new Intent(MainActivity.this,login.class);
        startActivity(intent);
    }
}