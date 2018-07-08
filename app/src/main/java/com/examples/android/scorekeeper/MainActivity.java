package com.examples.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pointsA(View view)
    {
        scoreTeamA=scoreTeamA+6;
        displayForTeamA(scoreTeamA);
    }
    public void points3A(View view)
    {
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void points2A(View view)
    {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void foulA(View view)
    {
        scoreTeamA=scoreTeamA-1;
        displayForTeamA(scoreTeamA);
    }
    public void pointsB(View view)
    {
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void points2B(View view)
    {
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void points3B(View view)
    {
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void foulB(View view)
    {
        scoreTeamB=scoreTeamB-1;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View view)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        result();
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
        result();
    }
    public void result()
    {
        if(scoreTeamA>scoreTeamB)
        {
            Toast.makeText (getApplicationContext (),"Team A won the match",Toast.LENGTH_SHORT).show ();

        }
        else
        {
            Toast.makeText (getApplicationContext (),"Team B won the match",Toast.LENGTH_SHORT).show ();
        }
    }
}
