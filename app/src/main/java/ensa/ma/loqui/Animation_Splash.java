package ensa.ma.loqui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import ensa.ma.loqui.Activities.PhoneNumberActivity;

public class Animation_Splash extends AppCompatActivity {

    private static int Splash_timeOut = 3000;
    TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_animation);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        text  =findViewById(R.id.Nebulus_view);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Animation_Splash.this, PhoneNumberActivity.class));
                finish();
            }
        }, Splash_timeOut);

        //L'APPLI NE MARCHE PAS QUAND CETTE PARTIE EST EXECUTEE
        //Animation myAnim = AnimationUtils.loadAnimation(Animation_Splash.this, R.anim.animation_text);
        //text.startAnimation(myAnim);

    }
}
