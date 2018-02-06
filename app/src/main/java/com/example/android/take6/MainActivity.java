package com.example.android.take6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends CustomToast {

    int scorePlayerOne = 0;
    int scorePlayerTwo = 0;
    int unDoOne = 0;
    int unDoTwo = 0;
    boolean aob = true;
    String message = "";

    // Saves the scores of both players in case of changing activity
    static final String STATE_SCORE_ONE = "playerOneScore";
    static final String STATE_SCORE_TWO = "playerTwoScore";
    static final String STATE_RESULTS = "results";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2players);
    }

    // Save the user's current game state
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_SCORE_ONE, scorePlayerOne);
        savedInstanceState.putInt(STATE_SCORE_TWO, scorePlayerTwo);
        savedInstanceState.putString(STATE_RESULTS, message);
        super.onSaveInstanceState(savedInstanceState);
    }

    // Always call the superclass so it can restore the view hierarchy
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        scorePlayerOne = savedInstanceState.getInt(STATE_SCORE_ONE);
        scorePlayerTwo = savedInstanceState.getInt(STATE_SCORE_TWO);
        message = savedInstanceState.getString(STATE_RESULTS);
        displayForPlayerOne(scorePlayerOne);
        displayForPlayerTwo(scorePlayerTwo);
    }

    /**
     * Displays the given score for player one.
     */
    public void displayForPlayerOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when player one button -1 point is clicked.
     */
    public void minusOnePointForPlayerOne(View View) {
        aob = true;
        unDoOne = scorePlayerOne;
        scorePlayerOne = scorePlayerOne - 1;
        displayForPlayerOne(scorePlayerOne);
    }

    /**
     * This method is called when player one button -2 points is clicked.
     */
    public void minusTwoPointsForPlayerOne(View View) {
        aob = true;
        unDoOne = scorePlayerOne;
        scorePlayerOne = scorePlayerOne - 2;
        displayForPlayerOne(scorePlayerOne);
    }

    /**
     * This method is called when player one button -3 points is clicked.
     */
    public void minusThreePointsForPlayerOne(View View) {
        aob = true;
        unDoOne = scorePlayerOne;
        scorePlayerOne = scorePlayerOne - 3;
        displayForPlayerOne(scorePlayerOne);
    }

    /**
     * This method is called when player one button -5 points is clicked.
     */
    public void minusFivePointsForPlayerOne(View View) {
        aob = true;
        unDoOne = scorePlayerOne;
        scorePlayerOne = scorePlayerOne - 5;
        displayForPlayerOne(scorePlayerOne);
    }

    /**
     * This method is called when player one button -7 points is clicked.
     */
    public void minusSevenPointsForPlayerOne(View View) {
        aob = true;
        unDoOne = scorePlayerOne;
        scorePlayerOne = scorePlayerOne - 7;
        displayForPlayerOne(scorePlayerOne);
    }

    /**
     * Displays the given score for player two.
     */
    public void displayForPlayerTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when player one button -1 point is clicked.
     */
    public void minusOnePointForPlayerTwo(View View) {
        aob = false;
        unDoTwo = scorePlayerTwo;
        scorePlayerTwo = scorePlayerTwo - 1;
        displayForPlayerTwo(scorePlayerTwo);
    }

    /**
     * This method is called when player one button -2 points is clicked.
     */
    public void minusTwoPointsForPlayerTwo(View View) {
        aob = false;
        unDoTwo = scorePlayerTwo;
        scorePlayerTwo = scorePlayerTwo - 2;
        displayForPlayerTwo(scorePlayerTwo);
    }

    /**
     * This method is called when player one button -3 points is clicked.
     */
    public void minusThreePointsForPlayerTwo(View View) {
        aob = false;
        unDoTwo = scorePlayerTwo;
        scorePlayerTwo = scorePlayerTwo - 3;
        displayForPlayerTwo(scorePlayerTwo);
    }

    /**
     * This method is called when player one button -5 points is clicked.
     */
    public void minusFivePointsForPlayerTwo(View View) {
        aob = false;
        unDoTwo = scorePlayerTwo;
        scorePlayerTwo = scorePlayerTwo - 5;
        displayForPlayerTwo(scorePlayerTwo);
    }

    /**
     * This method is called when player one button -7 points is clicked.
     */
    public void minusSevenPointsForPlayerTwo(View View) {
        aob = false;
        unDoTwo = scorePlayerTwo;
        scorePlayerTwo = scorePlayerTwo - 7;
        displayForPlayerTwo(scorePlayerTwo);
    }

    /**
     * This method is called when Reset button is clicked, it resets both team scores to zero.
     */
    public void resetScore(View View) {
        unDoOne = 0;
        unDoTwo = 0;
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        EditText playerOne = (EditText) findViewById(R.id.player_1_name);
        playerOne.setText(R.string.playerOne);
        EditText playerTwo = (EditText) findViewById(R.id.player_2_name);
        playerTwo.setText(R.string.playerTwo);
        displayForPlayerOne(scorePlayerOne);
        displayForPlayerTwo(scorePlayerTwo);
        aob = true;
    }

    /**
     * This method is called when Undo button is clicked, it cancels the last operation (can be used only to cancel one last operation).
     */
    public void unDo(View View) {

        if (aob) {
            scorePlayerOne = unDoOne;
        }
        if (!aob) {
            scorePlayerTwo = unDoTwo;
        }
        displayForPlayerOne(scorePlayerOne);
        displayForPlayerTwo(scorePlayerTwo);
    }

    /**
     * This method is called when game ends (-66 or < scores for one or both players), it shows the text with the winners name or declare draw.
     */
    public void gameEnd(View View) {
        if (scorePlayerOne <= -66 && scorePlayerOne<scorePlayerTwo) {
            EditText playerTwo = (EditText) findViewById(R.id.player_2_name);
            Editable nameTwo = playerTwo.getText();
            message = nameTwo + "\n wins!";
           toast(message);
        }
        if (scorePlayerTwo <= -66 && scorePlayerTwo<scorePlayerOne) {
            EditText playerOne = (EditText) findViewById(R.id.player_1_name);
            Editable nameOne = playerOne.getText();
            message = nameOne + "\n wins!";
            toast(message);
        }
        if (scorePlayerTwo <= -66 && scorePlayerOne <=-66 && scorePlayerOne==scorePlayerTwo){
            message = "It's a \nDraw!";
            toast(message);
        }

    }
}
