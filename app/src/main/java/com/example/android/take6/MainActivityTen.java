package com.example.android.take6;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Greta on 2018-02-05.
 */

public class MainActivityTen extends CustomToast {

    // Saves the scores of both players in case of changing activity
    static final String STATE_SCORE_ONE = "playerOneScore";
    static final String STATE_SCORE_TWO = "playerTwoScore";
    static final String STATE_SCORE_THREE = "playerThreeScore";
    static final String STATE_SCORE_FOUR = "playerFourScore";
    static final String STATE_SCORE_FIVE = "playerFiveScore";
    static final String STATE_SCORE_SIX = "playerSixScore";
    static final String STATE_SCORE_SEVEN = "playerSevenScore";
    static final String STATE_SCORE_EIGHT = "playerEightScore";
    static final String STATE_SCORE_NINE = "playerNineScore";
    static final String STATE_SCORE_TEN = "playerTenScore";
    static final String STATE_RESULTS = "results";
    int scorePlayerOne, scorePlayerTwo, scorePlayerThree, scorePlayerFour, scorePlayerFive, scorePlayerSix, scorePlayerSeven, scorePlayerEight, scorePlayerNine, scorePlayerTen = 0;
    int unDoOne, unDoTwo, unDoThree, unDoFour, unDoFive, unDoSix, unDoSeven, unDoEight, unDoNine, unDoTen = 0;
    String message, messageLose, messageWins = " ";
    TextView scoreView, scoreView2, scoreView3, scoreView4, scoreView5, scoreView6, scoreView7, scoreView8, scoreView9, scoreView10;
    LinearLayout linearLayout1, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10;
    EditText playerOne, playerTwo, playerThree, playerFour, playerFive, playerSix, playerSeven, playerEight, playerNine, playerTen;
    String nameOne, nameTwo, nameThree, nameFour, nameFive, nameSix, nameSeven, nameEight, nameNine, nameTen;
    boolean clicked1 = false;
    boolean clicked2 = false;
    boolean clicked3 = false;
    boolean clicked4 = false;
    boolean clicked5 = false;
    boolean clicked6 = false;
    boolean clicked7 = false;
    boolean clicked8 = false;
    boolean clicked9 = false;
    boolean clicked10 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10players);

        scoreView = findViewById(R.id.player_1_score);
        scoreView2 = findViewById(R.id.player_2_score);
        scoreView3 = findViewById(R.id.player_3_score);
        scoreView4 = findViewById(R.id.player_4_score);
        scoreView5 = findViewById(R.id.player_5_score);
        scoreView6 = findViewById(R.id.player_6_score);
        scoreView7 = findViewById(R.id.player_7_score);
        scoreView8 = findViewById(R.id.player_8_score);
        scoreView9 = findViewById(R.id.player_9_score);
        scoreView10 = findViewById(R.id.player_10_score);

        linearLayout1 = findViewById(R.id.linearLayout);
        linearLayout2 = findViewById(R.id.linearLayout2);
        linearLayout3 = findViewById(R.id.linearLayout3);
        linearLayout4 = findViewById(R.id.linearLayout4);
        linearLayout5 = findViewById(R.id.linearLayout5);
        linearLayout6 = findViewById(R.id.linearLayout6);
        linearLayout7 = findViewById(R.id.linearLayout7);
        linearLayout8 = findViewById(R.id.linearLayout8);
        linearLayout9 = findViewById(R.id.linearLayout9);
        linearLayout10 = findViewById(R.id.linearLayout10);

        playerOne = findViewById(R.id.player_1_name);
        playerTwo = findViewById(R.id.player_2_name);
        playerThree = findViewById(R.id.player_3_name);
        playerFour = findViewById(R.id.player_4_name);
        playerFive = findViewById(R.id.player_5_name);
        playerSix = findViewById(R.id.player_6_name);
        playerSeven = findViewById(R.id.player_7_name);
        playerEight = findViewById(R.id.player_8_name);
        playerNine = findViewById(R.id.player_9_name);
        playerTen = findViewById(R.id.player_10_name);

        linearLayout1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setBackgroundColor(getResources().getColor(R.color.whiteSeeThrough));
                linearLayout2.setBackgroundColor(0);
                linearLayout3.setBackgroundColor(0);
                linearLayout4.setBackgroundColor(0);
                linearLayout5.setBackgroundColor(0);
                linearLayout6.setBackgroundColor(0);
                linearLayout7.setBackgroundColor(0);
                linearLayout8.setBackgroundColor(0);
                linearLayout9.setBackgroundColor(0);
                linearLayout10.setBackgroundColor(0);
                clicked1 = true;
                clicked2 = false;
                clicked3 = false;
                clicked4 = false;
                clicked5 = false;
                clicked6 = false;
                clicked7 = false;
                clicked8 = false;
                clicked9 = false;
                clicked10 = false;
            }
        }));
        linearLayout2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout2.setBackgroundColor(getResources().getColor(R.color.whiteSeeThrough));
                linearLayout1.setBackgroundColor(0);
                linearLayout3.setBackgroundColor(0);
                linearLayout4.setBackgroundColor(0);
                linearLayout5.setBackgroundColor(0);
                linearLayout6.setBackgroundColor(0);
                linearLayout7.setBackgroundColor(0);
                linearLayout8.setBackgroundColor(0);
                linearLayout9.setBackgroundColor(0);
                linearLayout10.setBackgroundColor(0);
                clicked2 = true;
                clicked1 = false;
                clicked3 = false;
                clicked4 = false;
                clicked5 = false;
                clicked6 = false;
                clicked7 = false;
                clicked8 = false;
                clicked9 = false;
                clicked10 = false;
            }
        }));
        linearLayout3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout3.setBackgroundColor(getResources().getColor(R.color.whiteSeeThrough));
                linearLayout1.setBackgroundColor(0);
                linearLayout2.setBackgroundColor(0);
                linearLayout4.setBackgroundColor(0);
                linearLayout5.setBackgroundColor(0);
                linearLayout6.setBackgroundColor(0);
                linearLayout7.setBackgroundColor(0);
                linearLayout8.setBackgroundColor(0);
                linearLayout9.setBackgroundColor(0);
                linearLayout10.setBackgroundColor(0);
                clicked3 = true;
                clicked1 = false;
                clicked2 = false;
                clicked4 = false;
                clicked5 = false;
                clicked6 = false;
                clicked7 = false;
                clicked8 = false;
                clicked9 = false;
                clicked10 = false;
            }
        }));
        linearLayout4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout4.setBackgroundColor(getResources().getColor(R.color.whiteSeeThrough));
                linearLayout1.setBackgroundColor(0);
                linearLayout3.setBackgroundColor(0);
                linearLayout2.setBackgroundColor(0);
                linearLayout5.setBackgroundColor(0);
                linearLayout6.setBackgroundColor(0);
                linearLayout7.setBackgroundColor(0);
                linearLayout8.setBackgroundColor(0);
                linearLayout9.setBackgroundColor(0);
                linearLayout10.setBackgroundColor(0);
                clicked4 = true;
                clicked1 = false;
                clicked3 = false;
                clicked2 = false;
                clicked5 = false;
                clicked6 = false;
                clicked7 = false;
                clicked8 = false;
                clicked9 = false;
                clicked10 = false;
            }
        }));
        linearLayout5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout5.setBackgroundColor(getResources().getColor(R.color.whiteSeeThrough));
                linearLayout1.setBackgroundColor(0);
                linearLayout3.setBackgroundColor(0);
                linearLayout4.setBackgroundColor(0);
                linearLayout2.setBackgroundColor(0);
                linearLayout6.setBackgroundColor(0);
                linearLayout7.setBackgroundColor(0);
                linearLayout8.setBackgroundColor(0);
                linearLayout9.setBackgroundColor(0);
                linearLayout10.setBackgroundColor(0);
                clicked5 = true;
                clicked1 = false;
                clicked3 = false;
                clicked4 = false;
                clicked2 = false;
                clicked6 = false;
                clicked7 = false;
                clicked8 = false;
                clicked9 = false;
                clicked10 = false;
            }
        }));
        linearLayout6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout6.setBackgroundColor(getResources().getColor(R.color.whiteSeeThrough));
                linearLayout1.setBackgroundColor(0);
                linearLayout3.setBackgroundColor(0);
                linearLayout4.setBackgroundColor(0);
                linearLayout5.setBackgroundColor(0);
                linearLayout2.setBackgroundColor(0);
                linearLayout7.setBackgroundColor(0);
                linearLayout8.setBackgroundColor(0);
                linearLayout9.setBackgroundColor(0);
                linearLayout10.setBackgroundColor(0);
                clicked6 = true;
                clicked1 = false;
                clicked3 = false;
                clicked4 = false;
                clicked5 = false;
                clicked2 = false;
                clicked7 = false;
                clicked8 = false;
                clicked9 = false;
                clicked10 = false;
            }
        }));
        linearLayout7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout7.setBackgroundColor(getResources().getColor(R.color.whiteSeeThrough));
                linearLayout1.setBackgroundColor(0);
                linearLayout3.setBackgroundColor(0);
                linearLayout4.setBackgroundColor(0);
                linearLayout5.setBackgroundColor(0);
                linearLayout6.setBackgroundColor(0);
                linearLayout2.setBackgroundColor(0);
                linearLayout8.setBackgroundColor(0);
                linearLayout9.setBackgroundColor(0);
                linearLayout10.setBackgroundColor(0);
                clicked7 = true;
                clicked1 = false;
                clicked3 = false;
                clicked4 = false;
                clicked5 = false;
                clicked6 = false;
                clicked2 = false;
                clicked8 = false;
                clicked9 = false;
                clicked10 = false;
            }
        }));
        linearLayout8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout8.setBackgroundColor(getResources().getColor(R.color.whiteSeeThrough));
                linearLayout1.setBackgroundColor(0);
                linearLayout3.setBackgroundColor(0);
                linearLayout4.setBackgroundColor(0);
                linearLayout5.setBackgroundColor(0);
                linearLayout6.setBackgroundColor(0);
                linearLayout7.setBackgroundColor(0);
                linearLayout2.setBackgroundColor(0);
                linearLayout9.setBackgroundColor(0);
                linearLayout10.setBackgroundColor(0);
                clicked8 = true;
                clicked1 = false;
                clicked3 = false;
                clicked4 = false;
                clicked5 = false;
                clicked6 = false;
                clicked7 = false;
                clicked2 = false;
                clicked9 = false;
                clicked10 = false;
            }
        }));
        linearLayout9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout9.setBackgroundColor(getResources().getColor(R.color.whiteSeeThrough));
                linearLayout1.setBackgroundColor(0);
                linearLayout3.setBackgroundColor(0);
                linearLayout4.setBackgroundColor(0);
                linearLayout5.setBackgroundColor(0);
                linearLayout6.setBackgroundColor(0);
                linearLayout7.setBackgroundColor(0);
                linearLayout8.setBackgroundColor(0);
                linearLayout2.setBackgroundColor(0);
                linearLayout10.setBackgroundColor(0);
                clicked9 = true;
                clicked1 = false;
                clicked3 = false;
                clicked4 = false;
                clicked5 = false;
                clicked6 = false;
                clicked7 = false;
                clicked8 = false;
                clicked2 = false;
                clicked10 = false;
            }
        }));
        linearLayout10.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout10.setBackgroundColor(getResources().getColor(R.color.whiteSeeThrough));
                linearLayout1.setBackgroundColor(0);
                linearLayout3.setBackgroundColor(0);
                linearLayout4.setBackgroundColor(0);
                linearLayout5.setBackgroundColor(0);
                linearLayout6.setBackgroundColor(0);
                linearLayout7.setBackgroundColor(0);
                linearLayout8.setBackgroundColor(0);
                linearLayout9.setBackgroundColor(0);
                linearLayout2.setBackgroundColor(0);
                clicked10 = true;
                clicked1 = false;
                clicked3 = false;
                clicked4 = false;
                clicked5 = false;
                clicked6 = false;
                clicked7 = false;
                clicked8 = false;
                clicked9 = false;
                clicked2 = false;
            }
        }));
    }

    // Save the user's current game state
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_SCORE_ONE, scorePlayerOne);
        savedInstanceState.putInt(STATE_SCORE_TWO, scorePlayerTwo);
        savedInstanceState.putInt(STATE_SCORE_THREE, scorePlayerThree);
        savedInstanceState.putInt(STATE_SCORE_FOUR, scorePlayerFour);
        savedInstanceState.putInt(STATE_SCORE_FIVE, scorePlayerFive);
        savedInstanceState.putInt(STATE_SCORE_SIX, scorePlayerSix);
        savedInstanceState.putInt(STATE_SCORE_SEVEN, scorePlayerSeven);
        savedInstanceState.putInt(STATE_SCORE_EIGHT, scorePlayerEight);
        savedInstanceState.putInt(STATE_SCORE_NINE, scorePlayerNine);
        savedInstanceState.putInt(STATE_SCORE_TEN, scorePlayerTen);
        savedInstanceState.putString(STATE_RESULTS, message);
        super.onSaveInstanceState(savedInstanceState);
    }

    // Always call the superclass so it can restore the view hierarchy
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        scorePlayerOne = savedInstanceState.getInt(STATE_SCORE_ONE);
        scorePlayerTwo = savedInstanceState.getInt(STATE_SCORE_TWO);
        scorePlayerThree = savedInstanceState.getInt(STATE_SCORE_THREE);
        scorePlayerFour = savedInstanceState.getInt(STATE_SCORE_FOUR);
        scorePlayerFive = savedInstanceState.getInt(STATE_SCORE_FIVE);
        scorePlayerSix = savedInstanceState.getInt(STATE_SCORE_SIX);
        scorePlayerSeven = savedInstanceState.getInt(STATE_SCORE_SEVEN);
        scorePlayerEight = savedInstanceState.getInt(STATE_SCORE_EIGHT);
        scorePlayerNine = savedInstanceState.getInt(STATE_SCORE_NINE);
        scorePlayerTen = savedInstanceState.getInt(STATE_SCORE_TEN);
        message = savedInstanceState.getString(STATE_RESULTS);
        displayForPlayerOne(scorePlayerOne);
        displayForPlayerTwo(scorePlayerTwo);
        displayForPlayerThree(scorePlayerThree);
        displayForPlayerFour(scorePlayerFour);
        displayForPlayerFive(scorePlayerFive);
        displayForPlayerSix(scorePlayerSix);
        displayForPlayerSeven(scorePlayerSeven);
        displayForPlayerEight(scorePlayerEight);
        displayForPlayerNine(scorePlayerNine);
        displayForPlayerTen(scorePlayerTen);
    }

    /**
     * Displays the given score for player one.
     */
    public void displayForPlayerOne(int score) {
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when player one button -1 point is clicked.
     */
    public void minusOnePoint(View View) {

        if (clicked1) {
            scorePlayerOne = scorePlayerOne - 1;
            displayForPlayerOne(scorePlayerOne);
        }
        if (clicked2) {
            scorePlayerTwo = scorePlayerTwo - 1;
            displayForPlayerTwo(scorePlayerTwo);
        }
        if (clicked3) {
            scorePlayerThree = scorePlayerThree - 1;
            displayForPlayerThree(scorePlayerThree);
        }
        if (clicked4) {
            scorePlayerFour = scorePlayerFour - 1;
            displayForPlayerFour(scorePlayerFour);
        }
        if (clicked5) {
            scorePlayerFive = scorePlayerFive - 1;
            displayForPlayerFive(scorePlayerFive);
        }
        if (clicked6) {
            scorePlayerSix = scorePlayerSix - 1;
            displayForPlayerSix(scorePlayerSix);
        }
        if (clicked7) {
            scorePlayerSeven = scorePlayerSeven - 1;
            displayForPlayerSeven(scorePlayerSeven);
        }
        if (clicked8) {
            scorePlayerEight = scorePlayerEight - 1;
            displayForPlayerEight(scorePlayerEight);
        }
        if (clicked9) {
            scorePlayerNine = scorePlayerNine - 1;
            displayForPlayerNine(scorePlayerNine);
        }
        if (clicked10) {
            scorePlayerTen = scorePlayerTen - 1;
            displayForPlayerTen(scorePlayerTen);
        }

    }

    /**
     * This method is called when player one button -2 points is clicked.
     */
    public void minusTwoPoints(View View) {
        if (clicked1) {
            scorePlayerOne = scorePlayerOne - 2;
            displayForPlayerOne(scorePlayerOne);
        }
        if (clicked2) {
            scorePlayerTwo = scorePlayerTwo - 2;
            displayForPlayerTwo(scorePlayerTwo);
        }
        if (clicked3) {
            scorePlayerThree = scorePlayerThree - 2;
            displayForPlayerThree(scorePlayerThree);
        }
        if (clicked4) {
            scorePlayerFour = scorePlayerFour - 2;
            displayForPlayerFour(scorePlayerFour);
        }
        if (clicked5) {
            scorePlayerFive = scorePlayerFive - 2;
            displayForPlayerFive(scorePlayerFive);
        }
        if (clicked6) {
            scorePlayerSix = scorePlayerSix - 2;
            displayForPlayerSix(scorePlayerSix);
        }
        if (clicked7) {
            scorePlayerSeven = scorePlayerSeven - 2;
            displayForPlayerSeven(scorePlayerSeven);
        }
        if (clicked8) {
            scorePlayerEight = scorePlayerEight - 2;
            displayForPlayerEight(scorePlayerEight);
        }
        if (clicked9) {
            scorePlayerNine = scorePlayerNine - 2;
            displayForPlayerNine(scorePlayerNine);
        }
        if (clicked10) {
            scorePlayerTen = scorePlayerTen - 2;
            displayForPlayerTen(scorePlayerTen);
        }
    }

    /**
     * This method is called when player one button -3 points is clicked.
     */
    public void minusThreePoints(View View) {
        if (clicked1) {
            scorePlayerOne = scorePlayerOne - 3;
            displayForPlayerOne(scorePlayerOne);
        }
        if (clicked2) {
            scorePlayerTwo = scorePlayerTwo - 3;
            displayForPlayerTwo(scorePlayerTwo);
        }
        if (clicked3) {
            scorePlayerThree = scorePlayerThree - 3;
            displayForPlayerThree(scorePlayerThree);
        }
        if (clicked4) {
            scorePlayerFour = scorePlayerFour - 3;
            displayForPlayerFour(scorePlayerFour);
        }
        if (clicked5) {
            scorePlayerFive = scorePlayerFive - 3;
            displayForPlayerFive(scorePlayerFive);
        }
        if (clicked6) {
            scorePlayerSix = scorePlayerSix - 3;
            displayForPlayerSix(scorePlayerSix);
        }
        if (clicked7) {
            scorePlayerSeven = scorePlayerSeven - 3;
            displayForPlayerSeven(scorePlayerSeven);
        }
        if (clicked8) {
            scorePlayerEight = scorePlayerEight - 3;
            displayForPlayerEight(scorePlayerEight);
        }
        if (clicked9) {
            scorePlayerNine = scorePlayerNine - 3;
            displayForPlayerNine(scorePlayerNine);
        }
        if (clicked10) {
            scorePlayerTen = scorePlayerTen - 3;
            displayForPlayerTen(scorePlayerTen);
        }
    }

    /**
     * This method is called when player one button -5 points is clicked.
     */
    public void minusFivePoints(View View) {
        unDoOne = scorePlayerOne;
        if (clicked1) {
            scorePlayerOne = scorePlayerOne - 5;
            displayForPlayerOne(scorePlayerOne);
        }
        if (clicked2) {
            scorePlayerTwo = scorePlayerTwo - 5;
            displayForPlayerTwo(scorePlayerTwo);
        }
        if (clicked3) {
            scorePlayerThree = scorePlayerThree - 5;
            displayForPlayerThree(scorePlayerThree);
        }
        if (clicked4) {
            scorePlayerFour = scorePlayerFour - 5;
            displayForPlayerFour(scorePlayerFour);
        }
        if (clicked5) {
            scorePlayerFive = scorePlayerFive - 5;
            displayForPlayerFive(scorePlayerFive);
        }
        if (clicked6) {
            scorePlayerSix = scorePlayerSix - 5;
            displayForPlayerSix(scorePlayerSix);
        }
        if (clicked7) {
            scorePlayerSeven = scorePlayerSeven - 5;
            displayForPlayerSeven(scorePlayerSeven);
        }
        if (clicked8) {
            scorePlayerEight = scorePlayerEight - 5;
            displayForPlayerEight(scorePlayerEight);
        }
        if (clicked9) {
            scorePlayerNine = scorePlayerNine - 5;
            displayForPlayerNine(scorePlayerNine);
        }
        if (clicked10) {
            scorePlayerTen = scorePlayerTen - 5;
            displayForPlayerTen(scorePlayerTen);
        }
    }

    /**
     * This method is called when player one button -7 points is clicked.
     */
    public void minusSevenPoints(View View) {
        if (clicked1) {
            scorePlayerOne = scorePlayerOne - 7;
            displayForPlayerOne(scorePlayerOne);
        }
        if (clicked2) {
            scorePlayerTwo = scorePlayerTwo - 7;
            displayForPlayerTwo(scorePlayerTwo);
        }
        if (clicked3) {
            scorePlayerThree = scorePlayerThree - 7;
            displayForPlayerThree(scorePlayerThree);
        }
        if (clicked4) {
            scorePlayerFour = scorePlayerFour - 7;
            displayForPlayerFour(scorePlayerFour);
        }
        if (clicked5) {
            scorePlayerFive = scorePlayerFive - 7;
            displayForPlayerFive(scorePlayerFive);
        }
        if (clicked6) {
            scorePlayerSix = scorePlayerSix - 7;
            displayForPlayerSix(scorePlayerSix);
        }
        if (clicked7) {
            scorePlayerSeven = scorePlayerSeven - 7;
            displayForPlayerSeven(scorePlayerSeven);
        }
        if (clicked8) {
            scorePlayerEight = scorePlayerEight - 7;
            displayForPlayerEight(scorePlayerEight);
        }
        if (clicked9) {
            scorePlayerNine = scorePlayerNine - 7;
            displayForPlayerNine(scorePlayerNine);
        }
        if (clicked10) {
            scorePlayerTen = scorePlayerTen - 7;
            displayForPlayerTen(scorePlayerTen);
        }
    }

    /**
     * Displays the given score for player two.
     */
    public void displayForPlayerTwo(int score) {
        scoreView2.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for player three.
     */
    public void displayForPlayerThree(int score) {
        scoreView3.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for player four.
     */
    public void displayForPlayerFour(int score) {
        scoreView4.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for player five.
     */
    public void displayForPlayerFive(int score) {
        scoreView5.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for player six.
     */
    public void displayForPlayerSix(int score) {
        scoreView6.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for player seven.
     */
    public void displayForPlayerSeven(int score) {
        scoreView7.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for player eight.
     */
    public void displayForPlayerEight(int score) {
        scoreView8.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for player nine.
     */
    public void displayForPlayerNine(int score) {
        scoreView9.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for player ten.
     */
    public void displayForPlayerTen(int score) {
        scoreView10.setText(String.valueOf(score));
    }

    /**
     * This method is called when Reset button is clicked, it resets both team scores to zero.
     */
    public void resetScore(View View) {
        unDoOne = unDoTwo = unDoThree = unDoFour = unDoFive = unDoSix = unDoSeven = unDoEight = unDoNine = unDoTen = 0;
        scorePlayerOne = scorePlayerTwo = scorePlayerThree = scorePlayerFour = scorePlayerFive = 0;
        scorePlayerSix = scorePlayerSeven = scorePlayerEight = scorePlayerNine = scorePlayerTen = 0;
        displayForPlayerOne(scorePlayerOne);
        displayForPlayerTwo(scorePlayerTwo);
        displayForPlayerThree(scorePlayerThree);
        displayForPlayerFour(scorePlayerFour);
        displayForPlayerFive(scorePlayerFive);
        displayForPlayerSix(scorePlayerSix);
        displayForPlayerSeven(scorePlayerSeven);
        displayForPlayerEight(scorePlayerEight);
        displayForPlayerNine(scorePlayerNine);
        displayForPlayerTen(scorePlayerTen);
    }

    /**
     * This method is called when Undo button is clicked, it cancels the last operation (can be used only to cancel one last operation).

     public void unDo(View View) {

     if () {
     scorePlayerOne = unDoOne;
     }
     if () {
     scorePlayerTwo = unDoTwo;
     }
     displayForPlayerOne(scorePlayerOne);
     displayForPlayerTwo(scorePlayerTwo);
     }
     */
    /**
     * This method is called when game ends (-66 or < scores for one or both players), it shows the text with the winners name or declare draw.
     */

    public void gameEnd(View View) {
        if (scorePlayerOne <= -66 && scorePlayerOne < scorePlayerTwo && scorePlayerOne < scorePlayerThree && scorePlayerOne < scorePlayerFour && scorePlayerOne < scorePlayerFive && scorePlayerOne < scorePlayerSix && scorePlayerOne < scorePlayerSeven && scorePlayerOne < scorePlayerEight && scorePlayerOne < scorePlayerNine && scorePlayerOne < scorePlayerTen) {
            nameOne = playerOne.getText().toString();
            if (nameOne.equals("")) {
                nameOne = "Player 1";
            }
            messageLose = nameOne + getString(R.string.loser);
            toast(messageLose);
        } else if (scorePlayerTwo <= -66 && scorePlayerTwo < scorePlayerOne && scorePlayerTwo < scorePlayerThree && scorePlayerTwo < scorePlayerFour && scorePlayerTwo < scorePlayerFive && scorePlayerTwo < scorePlayerSix && scorePlayerTwo < scorePlayerSeven && scorePlayerTwo < scorePlayerEight && scorePlayerTwo < scorePlayerNine && scorePlayerTwo < scorePlayerTen) {
            nameTwo = playerTwo.getText().toString();
            if (nameTwo.equals("")) {
                nameTwo = "Player 2";
            }
            messageLose = nameTwo + getString(R.string.loser);
            toast(messageLose);
        } else if (scorePlayerThree <= -66 && scorePlayerThree < scorePlayerOne && scorePlayerThree < scorePlayerTwo && scorePlayerThree < scorePlayerFour && scorePlayerThree < scorePlayerFive && scorePlayerThree < scorePlayerSix && scorePlayerThree < scorePlayerSeven && scorePlayerThree < scorePlayerEight && scorePlayerThree < scorePlayerNine && scorePlayerThree < scorePlayerTen) {
            nameThree = playerThree.getText().toString();
            if (nameThree.equals("")) {
                nameThree = "Player 3";
            }
            messageLose = nameThree + getString(R.string.loser);
            toast(messageLose);
        } else if (scorePlayerFour <= -66 && scorePlayerFour < scorePlayerOne && scorePlayerFour < scorePlayerThree && scorePlayerFour < scorePlayerTwo && scorePlayerFour < scorePlayerFive && scorePlayerFour < scorePlayerSix && scorePlayerFour < scorePlayerSeven && scorePlayerFour < scorePlayerEight && scorePlayerFour < scorePlayerNine && scorePlayerFour < scorePlayerTen) {
            nameFour = playerFour.getText().toString();
            if (nameFour.equals("")) {
                nameFour = "Player 4";
            }
            messageLose = nameFour + getString(R.string.loser);
            toast(messageLose);
        } else if (scorePlayerFive <= -66 && scorePlayerFive < scorePlayerOne && scorePlayerFive < scorePlayerThree && scorePlayerFive < scorePlayerTwo && scorePlayerFive < scorePlayerFour && scorePlayerFive < scorePlayerSix && scorePlayerFive < scorePlayerSeven && scorePlayerFive < scorePlayerEight && scorePlayerFive < scorePlayerNine && scorePlayerFive < scorePlayerTen) {
            nameFive = playerFive.getText().toString();
            if (nameFive.equals("")) {
                nameFive = "Player 5";
            }
            messageLose = nameFive + getString(R.string.loser);
            toast(messageLose);
        } else if (scorePlayerSix <= -66 && scorePlayerSix < scorePlayerOne && scorePlayerSix < scorePlayerThree && scorePlayerSix < scorePlayerTwo && scorePlayerSix < scorePlayerFour && scorePlayerSix < scorePlayerFive && scorePlayerSix < scorePlayerSeven && scorePlayerSix < scorePlayerEight && scorePlayerSix < scorePlayerNine && scorePlayerSix < scorePlayerTen) {
            nameSix = playerSix.getText().toString();
            if (nameSix.equals("")) {
                nameSix = "Player 6";
            }
            messageLose = nameSix + getString(R.string.loser);
            toast(messageLose);
        } else if (scorePlayerSeven <= -66 && scorePlayerSeven < scorePlayerOne && scorePlayerSeven < scorePlayerThree && scorePlayerSeven < scorePlayerTwo && scorePlayerSeven < scorePlayerFour && scorePlayerSeven < scorePlayerFive && scorePlayerSeven < scorePlayerSix && scorePlayerSeven < scorePlayerEight && scorePlayerSeven < scorePlayerNine && scorePlayerSeven < scorePlayerTen) {
            nameSeven = playerSeven.getText().toString();
            if (nameSeven.equals("")) {
                nameSeven = "Player 7";
            }
            messageLose = nameSeven + getString(R.string.loser);
            toast(messageLose);
        } else if (scorePlayerEight <= -66 && scorePlayerEight < scorePlayerOne && scorePlayerEight < scorePlayerThree && scorePlayerEight < scorePlayerTwo && scorePlayerEight < scorePlayerFour && scorePlayerEight < scorePlayerFive && scorePlayerEight < scorePlayerSeven && scorePlayerEight < scorePlayerSix && scorePlayerEight < scorePlayerNine && scorePlayerEight < scorePlayerTen) {
            nameEight = playerEight.getText().toString();
            if (nameEight.equals("")) {
                nameEight = "Player 8";
            }
            messageLose = nameEight + getString(R.string.loser);
            toast(messageLose);
        } else if (scorePlayerNine <= -66 && scorePlayerNine < scorePlayerOne && scorePlayerNine < scorePlayerThree && scorePlayerNine < scorePlayerTwo && scorePlayerNine < scorePlayerFour && scorePlayerNine < scorePlayerFive && scorePlayerNine < scorePlayerSeven && scorePlayerNine < scorePlayerEight && scorePlayerNine < scorePlayerSix && scorePlayerNine < scorePlayerTen) {
            nameNine = playerNine.getText().toString();
            if (nameNine.equals("")) {
                nameNine = "Player 9";
            }
            messageLose = nameNine + getString(R.string.loser);
            toast(messageLose);
        } else if (scorePlayerTen <= -66 && scorePlayerTen < scorePlayerOne && scorePlayerTen < scorePlayerThree && scorePlayerTen < scorePlayerTwo && scorePlayerTen < scorePlayerFour && scorePlayerTen < scorePlayerFive && scorePlayerTen < scorePlayerSeven && scorePlayerTen < scorePlayerEight && scorePlayerTen < scorePlayerNine && scorePlayerTen < scorePlayerSix) {
            nameNine = playerTen.getText().toString();
            if (nameTen.equals("")) {
                nameTen = "Player 10";
            }
            messageLose = nameTen + getString(R.string.loser);
            toast(messageLose);
        } else if (scorePlayerOne > -66 && scorePlayerTwo > -66 && scorePlayerThree > -66 && scorePlayerFour > -66 && scorePlayerFive > -66 && scorePlayerSix > -66 && scorePlayerSeven > -66 && scorePlayerEight > -66 && scorePlayerNine > -66 && scorePlayerTen > -66) {
            String toast_message = "Keep playing";
            Toast.makeText(MainActivityTen.this, toast_message, Toast.LENGTH_SHORT).show();
        } else {
            message = "It's a \nDraw between losers!";
            toast(message);
        }

      if (scorePlayerTwo < 0 && scorePlayerThree < 0 && scorePlayerFour < 0 && scorePlayerFive < 0 && scorePlayerSix < 0 && scorePlayerSeven < 0 && scorePlayerEight < 0 && scorePlayerNine < 0 && scorePlayerTen < 0 && scorePlayerOne > scorePlayerTwo && scorePlayerOne > scorePlayerThree && scorePlayerOne > scorePlayerFour && scorePlayerOne > scorePlayerFive && scorePlayerOne > scorePlayerSix && scorePlayerOne > scorePlayerSeven && scorePlayerOne > scorePlayerEight && scorePlayerOne > scorePlayerNine && scorePlayerOne > scorePlayerTen) {
            nameOne = playerOne.getText().toString();
            if (nameOne.equals("")) {
                nameOne = "Player 1";
            }
            messageWins = nameOne + getString(R.string.winner);
          toast(messageWins);
        } else if (scorePlayerOne < 0 && scorePlayerThree < 0 && scorePlayerFour < 0 && scorePlayerFive < 0 && scorePlayerSix < 0 && scorePlayerSeven < 0 && scorePlayerEight < 0 && scorePlayerNine < 0 && scorePlayerTen < 0 && scorePlayerTwo > scorePlayerOne && scorePlayerTwo > scorePlayerThree && scorePlayerTwo > scorePlayerFour && scorePlayerTwo > scorePlayerFive && scorePlayerTwo > scorePlayerSix && scorePlayerTwo > scorePlayerSeven && scorePlayerTwo > scorePlayerEight && scorePlayerTwo > scorePlayerNine && scorePlayerTwo > scorePlayerTen) {
            nameTwo = playerTwo.getText().toString();
            if (nameTwo.equals("")) {
                nameTwo = "Player 2";
            }
            messageWins = nameTwo + getString(R.string.winner);
          toast(messageWins);
        } else if (scorePlayerOne < 0 && scorePlayerTwo < 0 && scorePlayerFour < 0 && scorePlayerFive < 0 && scorePlayerSix < 0 && scorePlayerSeven < 0 && scorePlayerEight < 0 && scorePlayerNine < 0 && scorePlayerTen < 0 && scorePlayerThree > scorePlayerOne && scorePlayerThree > scorePlayerTwo && scorePlayerThree > scorePlayerFour && scorePlayerThree > scorePlayerFive && scorePlayerThree > scorePlayerSix && scorePlayerThree > scorePlayerSeven && scorePlayerThree > scorePlayerEight && scorePlayerThree > scorePlayerNine && scorePlayerThree > scorePlayerTen) {
            nameThree = playerThree.getText().toString();
            if (nameThree.equals("")) {
                nameThree = "Player 3";
            }
            messageWins = nameThree + getString(R.string.winner);
          toast(messageWins);
        } else if (scorePlayerOne < 0 && scorePlayerTwo < 0 && scorePlayerThree < 0 && scorePlayerFive < 0 && scorePlayerSix < 0 && scorePlayerSeven < 0 && scorePlayerEight < 0 && scorePlayerNine < 0 && scorePlayerTen < 0 && scorePlayerFour > scorePlayerOne && scorePlayerFour > scorePlayerTwo && scorePlayerFour > scorePlayerThree && scorePlayerFour > scorePlayerFive && scorePlayerFour > scorePlayerSix && scorePlayerFour > scorePlayerSeven && scorePlayerFour > scorePlayerEight && scorePlayerFour > scorePlayerNine && scorePlayerFour > scorePlayerTen) {
            nameFour = playerFour.getText().toString();
            if (nameFour.equals("")) {
                nameFour = "Player 4";
            }
            messageWins = nameFour + getString(R.string.winner);
          toast(messageWins);
        } else if (scorePlayerOne < 0 && scorePlayerTwo < 0 && scorePlayerFour < 0 && scorePlayerThree < 0 && scorePlayerSix < 0 && scorePlayerSeven < 0 && scorePlayerEight < 0 && scorePlayerNine < 0 && scorePlayerTen < 0 && scorePlayerFive > scorePlayerOne && scorePlayerFive > scorePlayerThree && scorePlayerFive > scorePlayerFour && scorePlayerFive > scorePlayerThree && scorePlayerFive > scorePlayerSix && scorePlayerFive > scorePlayerSeven && scorePlayerFive > scorePlayerEight && scorePlayerFive > scorePlayerNine && scorePlayerFive > scorePlayerTen) {
            nameFive = playerFive.getText().toString();
            if (nameFive.equals("")) {
                nameFive = "Player 5";
            }
            messageWins = nameFive + getString(R.string.winner);
          toast(messageWins);
        } else if (scorePlayerOne < 0 && scorePlayerTwo < 0 && scorePlayerFour < 0 && scorePlayerThree < 0 && scorePlayerFive < 0 && scorePlayerSeven < 0 && scorePlayerEight < 0 && scorePlayerNine < 0 && scorePlayerTen < 0 && scorePlayerSix > scorePlayerOne && scorePlayerSix > scorePlayerThree && scorePlayerSix > scorePlayerFour && scorePlayerSix > scorePlayerThree && scorePlayerSix > scorePlayerFive && scorePlayerSix > scorePlayerSeven && scorePlayerSix > scorePlayerEight && scorePlayerSix > scorePlayerNine && scorePlayerSix > scorePlayerTen) {
            nameSix = playerSix.getText().toString();
            if (nameSix.equals("")) {
                nameSix = "Player 6";
            }
            messageWins = nameSix + getString(R.string.winner);
          toast(messageWins);
        } else if (scorePlayerOne < 0 && scorePlayerTwo < 0 && scorePlayerFour < 0 && scorePlayerThree < 0 && scorePlayerFive < 0 && scorePlayerSix < 0 && scorePlayerEight < 0 && scorePlayerNine < 0 && scorePlayerTen < 0 && scorePlayerSeven > scorePlayerOne && scorePlayerSeven > scorePlayerThree && scorePlayerSeven > scorePlayerFour && scorePlayerSeven > scorePlayerThree && scorePlayerSeven > scorePlayerFive && scorePlayerSeven > scorePlayerSix && scorePlayerSeven > scorePlayerEight && scorePlayerSeven > scorePlayerNine && scorePlayerSeven > scorePlayerTen) {
            nameSeven = playerSeven.getText().toString();
            if (nameSeven.equals("")) {
                nameSeven = "Player 7";
            }
            messageWins = nameSeven + getString(R.string.winner);
          toast(messageWins);
        } else if (scorePlayerOne < 0 && scorePlayerTwo < 0 && scorePlayerFour < 0 && scorePlayerThree < 0 && scorePlayerFive < 0 && scorePlayerSix < 0 && scorePlayerSeven < 0 && scorePlayerNine < 0 && scorePlayerTen < 0 && scorePlayerEight > scorePlayerOne && scorePlayerEight > scorePlayerThree && scorePlayerEight > scorePlayerFour && scorePlayerEight > scorePlayerThree && scorePlayerEight > scorePlayerFive && scorePlayerEight > scorePlayerSix && scorePlayerEight > scorePlayerSeven && scorePlayerEight > scorePlayerNine && scorePlayerEight > scorePlayerTen) {
            nameEight = playerEight.getText().toString();
            if (nameEight.equals("")) {
                nameEight = "Player 8";
            }
            messageWins = nameEight + getString(R.string.winner);
          toast(messageWins);
        } else if (scorePlayerOne < 0 && scorePlayerTwo < 0 && scorePlayerFour < 0 && scorePlayerThree < 0 && scorePlayerFive < 0 && scorePlayerSix < 0 && scorePlayerSeven < 0 && scorePlayerEight < 0 && scorePlayerTen < 0 && scorePlayerNine > scorePlayerOne && scorePlayerNine > scorePlayerThree && scorePlayerNine > scorePlayerFour && scorePlayerNine > scorePlayerThree && scorePlayerNine > scorePlayerFive && scorePlayerNine > scorePlayerSix && scorePlayerNine > scorePlayerSeven && scorePlayerNine > scorePlayerEight && scorePlayerNine > scorePlayerTen) {
            nameNine = playerNine.getText().toString();
            if (nameNine.equals("")) {
                nameNine = "Player 9";
            }
            messageWins = nameNine + getString(R.string.winner);
          toast(messageWins);
        } else if (scorePlayerOne < 0 && scorePlayerTwo < 0 && scorePlayerFour < 0 && scorePlayerThree < 0 && scorePlayerFive < 0 && scorePlayerSix < 0 && scorePlayerSeven < 0 && scorePlayerNine < 0 && scorePlayerEight < 0 && scorePlayerTen > scorePlayerOne && scorePlayerTen > scorePlayerThree && scorePlayerTen > scorePlayerFour && scorePlayerTen > scorePlayerThree && scorePlayerTen > scorePlayerFive && scorePlayerTen > scorePlayerSix && scorePlayerTen > scorePlayerSeven && scorePlayerTen > scorePlayerNine && scorePlayerTen > scorePlayerEight) {
            nameTen = playerTen.getText().toString();
            if (nameTen.equals("")) {
                nameTen = "Player 10";
            }
            messageWins = nameTen + getString(R.string.winner);
            toast(messageWins);
        } else if (scorePlayerOne > -66 && scorePlayerTwo > -66 && scorePlayerThree > -66 && scorePlayerFour > -66 && scorePlayerFive > -66 && scorePlayerSix > -66 && scorePlayerSeven > -66 && scorePlayerEight > -66 && scorePlayerNine > -66 && scorePlayerTen > -66) {
            String toast_message = "Keep playing";
            Toast.makeText(MainActivityTen.this, toast_message, Toast.LENGTH_SHORT).show();
        }
        }
    }