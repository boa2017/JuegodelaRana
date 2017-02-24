package com.example.android.juegodelarana;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int numOfShotsTeamA = 0;
    int numOfShotsTeamB = 0;
    int maxNumShotsTeamA = 10;
    int maxNumShotsTeamB = 10;

    private MediaPlayer mp;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View view) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.rana);
                mp.start();

         resetScore();

            }
        });
      }

    /**
     * Increase the score for Team A by 50 points.
     */
    public void addFiftyPointsForTeamA(View v) {
        if (numOfShotsTeamA<maxNumShotsTeamA) {
            scoreTeamA = scoreTeamA + 50;
            displayTeamA(scoreTeamA);
            numOfShotsTeamA++;
        }
        if (numOfShotsTeamA == 10) {
            // show toast
            Toast.makeText(getApplicationContext(), "Well done Team A", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Increase the score for Team A by 25 points.
     */
    public void addTwentyFivePointsForTeamA(View v) {
        if (numOfShotsTeamA<maxNumShotsTeamA) {

            scoreTeamA = scoreTeamA + 25;
            displayTeamA(scoreTeamA);
            numOfShotsTeamA++;
        }
        if (numOfShotsTeamA == 10) {
            // show toast
            Toast.makeText(getApplicationContext(), "Well done Team A\"", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Increase the score for Team A by 10 points.
     */
    public void addTenPointsForTeamA(View v) {
        if (numOfShotsTeamA<maxNumShotsTeamA) {
            scoreTeamA = scoreTeamA + 10;
            displayTeamA(scoreTeamA);
            numOfShotsTeamA++;
        }
        if (numOfShotsTeamA == 10) {
            // show toast
            Toast.makeText(getApplicationContext(), "Well done Team A\"", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Increase the score for Team A by 5 points.
     */
    public void addFivePointsForTeamA(View v) {
        if (numOfShotsTeamA<maxNumShotsTeamA) {
            scoreTeamA = scoreTeamA + 5;
            displayTeamA(scoreTeamA);
            numOfShotsTeamA++;
        }
        if (numOfShotsTeamA == 10) {
            // show toast
            Toast.makeText(getApplicationContext(), "Well done Team A\"", Toast.LENGTH_LONG).show();
        }
    }

        /**
         * Increase the score for Team B by 50 points.
         */
    public void addFiftyPointsForTeamB(View v) {
        if (numOfShotsTeamB<maxNumShotsTeamB) {
            scoreTeamB = scoreTeamB + 50;
            displayTeamB(scoreTeamB);
            numOfShotsTeamB++;
        }
        if (numOfShotsTeamB == 10) {
            // show toast
            Toast.makeText(getApplicationContext(), "Well done Team B", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Increase the score for Team B by 25 points.
     */
    public void addTwentyFivePointsForTeamB(View v) {
        if (numOfShotsTeamB<maxNumShotsTeamB) {
            scoreTeamB = scoreTeamB + 25;
            displayTeamB(scoreTeamB);
            numOfShotsTeamB++;
        }
        if (numOfShotsTeamB == 10) {
            // show toast
            Toast.makeText(getApplicationContext(), "Well done Team B\"", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Increase the score for Team B by 10 points.
     */
    public void addTenPointsForTeamB(View v) {
        if (numOfShotsTeamB<maxNumShotsTeamB) {
            scoreTeamB = scoreTeamB + 10;
            displayTeamB(scoreTeamB);
            numOfShotsTeamB++;
        }
        if (numOfShotsTeamB == 10) {
            // show toast
            Toast.makeText(getApplicationContext(), "Well done Team B\"", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Increase the score for Team B by 5 points.
     */
    public void addFivePointsForTeamB(View v) {
        if (numOfShotsTeamB<maxNumShotsTeamB) {
            scoreTeamB = scoreTeamB + 5;
            displayTeamB(scoreTeamB);
            numOfShotsTeamB++;
        }
        if (numOfShotsTeamB == 10) {
            // show toast
            Toast.makeText(getApplicationContext(), "Well done Team B\"", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore() {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }
}
