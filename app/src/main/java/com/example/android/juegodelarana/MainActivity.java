/*
 *
 *  * PROJECT LICENSE
 *  *
 *  * This project was submitted by Beatriz Ovejero as part of the Android Developer
 *  * Nanodegree at Udacity.
 *  *
 *  * As part of Udacity Honor code, your submissions must be your own work, hence
 *  * submitting this project as yours will cause you to break the Udacity Honor Code
 *  * and the suspension of your account.
 *  *
 *  * As author of the project, I allow you to check it as a reference, but if you submit it
 *  * as your own project, it's your own responsibility if you get expelled.
 *  *
 *  * Copyright (c) 2018 Beatriz Ovejero
 *  *
 *  * Besides the above notice, the following license applies and this license notice must be
 *  * included in all works derived from this project.
 *  *
 *  * MIT License
 *  *
 *  * Permission is hereby granted, free of charge, to any person obtaining a copy
 *  * of this software and associated documentation files (the "Software"), to deal
 *  * in the Software without restriction, including without limitation the rights
 *  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  * copies of the Software, and to permit persons to whom the Software is
 *  * furnished to do so, subject to the following conditions:
 *  *
 *  * The above copyright notice and this permission notice shall be included in all
 *  * copies or substantial portions of the Software.
 *  *
 *  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  * SOFTWARE.
 *
 */

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
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("sta", scoreTeamA);
        outState.putInt("stb", scoreTeamB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**Loads old LivePoints*/
        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt("sta");
            scoreTeamB = savedInstanceState.getInt("stb");
        }

        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);

        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.rana);
                mp.start();

                resetScore();

            }
        });
    }


    /**
     * Increase the score for Team A by 50 points.
     */
    public void addFiftyPointsForTeamA(View v) {
        if (numOfShotsTeamA < maxNumShotsTeamA) {
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
        if (numOfShotsTeamA < maxNumShotsTeamA) {

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
        if (numOfShotsTeamA < maxNumShotsTeamA) {
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
        if (numOfShotsTeamA < maxNumShotsTeamA) {
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
        if (numOfShotsTeamB < maxNumShotsTeamB) {
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
        if (numOfShotsTeamB < maxNumShotsTeamB) {
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
        if (numOfShotsTeamB < maxNumShotsTeamB) {
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
        if (numOfShotsTeamB < maxNumShotsTeamB) {
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
