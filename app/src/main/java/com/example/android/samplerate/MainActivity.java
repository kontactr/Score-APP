package com.example.android.samplerate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForTeamA = 0;
    int scoreForTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(View score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreForTeamA += 3;
        scoreView.setText(String.valueOf(scoreForTeamA));
    }

    public void displayForTeamB_3(View score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreForTeamB += 3;
        scoreView.setText(String.valueOf(scoreForTeamB));
    }

    public void displayForTeamB_2(View score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreForTeamB += 2;
        scoreView.setText(String.valueOf(scoreForTeamB));
    }

    public void displayForTeamB_1(View score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreForTeamB += 1;
        scoreView.setText(String.valueOf(scoreForTeamB));
    }

    public void displayForTeamB(View score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreForTeamA += 2;
        scoreView.setText(String.valueOf(scoreForTeamA));
    }

    public void displayForTeamC(View score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(++scoreForTeamA));
    }

    public void reset(View score)
    {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreForTeamA));
        scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreForTeamB));
    }
}
