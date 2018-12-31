package com.example.douglasx.frame_coordinator_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout flayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*flayout = findViewById(R.id.frameCarregando);
        *//*flayout.setVisibility(View.GONE);*/
    }

    /*public void abrir (View view) {
        flayout.setVisibility(View.VISIBLE);
    }*/
}
