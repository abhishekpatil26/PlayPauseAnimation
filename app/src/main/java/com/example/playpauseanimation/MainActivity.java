package com.example.playpauseanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int[] STATE_SET_PLAY =
            {R.attr.state_play, -R.attr.state_pause};
    private static final int[] STATE_SET_PAUSE =
            {-R.attr.state_play, R.attr.state_pause};

    private ImageView iconView;
    private View playButton;
    private View pauseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iconView = findViewById(R.id.icon);
        playButton = findViewById(R.id.play);
        pauseButton = findViewById(R.id.pause);

        playButton.setOnClickListener(this);
        pauseButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.play){
            playButton.setEnabled(false);
            pauseButton.setEnabled(true);
            iconView.setImageState(STATE_SET_PLAY, true);
        }
        if(v.getId() == R.id.pause){
            playButton.setEnabled(true);
            pauseButton.setEnabled(false);
            iconView.setImageState(STATE_SET_PAUSE, true);
        }
    }
}