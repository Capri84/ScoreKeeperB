package com.example.android.scorekeeperb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeperb.R;

public class MainActivity extends AppCompatActivity {

    int scorePlayer = 0;
    int scoreDealer = 0;
    String winner = "";
    String loser = "";
    String draw = "";
    String bothLost = "";
    String bothWon = "";
    String winner1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for the Player.
     */
    public void displayForPlayer(int score) {
        TextView scoreView = findViewById(R.id.player_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for the Dealer.
     */
    public void displayForDealer(int score) {
        TextView scoreView = findViewById(R.id.dealer_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = findViewById(R.id.result);
        priceTextView.setText(message);
    }

    /**
     * This method is called when the "+1" button for Player is clicked.
     */
    public void plusOnePlayer(View view) {
        scorePlayer = scorePlayer + 1;
        displayForPlayer(scorePlayer);
    }

    /**
     * This method is called when the "+2" button for Player is clicked.
     */
    public void plusTwoPlayer(View view) {
        scorePlayer = scorePlayer + 2;
        displayForPlayer(scorePlayer);
    }

    /**
     * This method is called when the "+3" button for Player is clicked.
     */
    public void plusThreePlayer(View view) {
        scorePlayer = scorePlayer + 3;
        displayForPlayer(scorePlayer);
    }

    /**
     * This method is called when the "+4" button for Player is clicked.
     */
    public void plusFourPlayer(View view) {
        scorePlayer = scorePlayer + 4;
        displayForPlayer(scorePlayer);
    }

    /**
     * This method is called when the "+5" button for Player is clicked.
     */
    public void plusFivePlayer(View view) {
        scorePlayer = scorePlayer + 5;
        displayForPlayer(scorePlayer);
    }

    /**
     * This method is called when the "+6" button for Player is clicked.
     */
    public void plusSixPlayer(View view) {
        scorePlayer = scorePlayer + 6;
        displayForPlayer(scorePlayer);
    }

    /**
     * This method is called when the "+7" button for Player is clicked.
     */
    public void plusSevenPlayer(View view) {
        scorePlayer = scorePlayer + 7;
        displayForPlayer(scorePlayer);
    }

    /**
     * This method is called when the "+8" button for Player is clicked.
     */
    public void plusEightPlayer(View view) {
        scorePlayer = scorePlayer + 8;
        displayForPlayer(scorePlayer);
    }

    /**
     * This method is called when the "+9" button for Player is clicked.
     */
    public void plusNinePlayer(View view) {
        scorePlayer = scorePlayer + 9;
        displayForPlayer(scorePlayer);
    }

    /**
     * This method is called when the "+10" button for Player is clicked.
     */
    public void plusTenPlayer(View view) {
        scorePlayer = scorePlayer + 10;
        displayForPlayer(scorePlayer);
    }

    /**
     * This method is called when the "+11" button for Player is clicked.
     */
    public void plusElevenPlayer(View view) {
        scorePlayer = scorePlayer + 11;
        displayForPlayer(scorePlayer);
    }

    /**
     * This method is called when the "+1" button for Dealer is clicked.
     */
    public void plusOneDealer(View view) {
        if (scoreDealer >= 17 && scoreDealer <= 21) {
            return;
        } else{
            scoreDealer = scoreDealer + 1;}
        displayForDealer(scoreDealer);
    }

    /**
     * This method is called when the "+2" button for Dealer is clicked.
     */
    public void plusTwoDealer(View view) {
        if (scoreDealer >= 17 && scoreDealer <= 21) {
            return;
        } else{
            scoreDealer = scoreDealer + 2;}
        displayForDealer(scoreDealer);
    }

    /**
     * This method is called when the "+3" button for Dealer is clicked.
     */
    public void plusThreeDealer(View view) {
        if (scoreDealer >= 17 && scoreDealer <= 21) {
            return;
        } else{
            scoreDealer = scoreDealer + 3;}
        displayForDealer(scoreDealer);
    }

    /**
     * This method is called when the "+4" button for Dealer is clicked.
     */
    public void plusFourDealer(View view) {
        if (scoreDealer >= 17 && scoreDealer <= 21) {
            return;
        } else{
            scoreDealer = scoreDealer + 4;}
        displayForDealer(scoreDealer);
    }

    /**
     * This method is called when the "+5" button for Dealer is clicked.
     */
    public void plusFiveDealer(View view) {
        if (scoreDealer >= 17 && scoreDealer <= 21) {
            return;
        } else{
            scoreDealer = scoreDealer + 5;}
        displayForDealer(scoreDealer);
    }

    /**
     * This method is called when the "+6" button for Dealer is clicked.
     */
    public void plusSixDealer(View view) {
        if (scoreDealer >= 17 && scoreDealer <= 21) {
            return;
        } else{
            scoreDealer = scoreDealer + 6;}
        displayForDealer(scoreDealer);
    }

    /**
     * This method is called when the "+7" button for Dealer is clicked.
     */
    public void plusSevenDealer(View view) {
        if (scoreDealer >= 17 && scoreDealer <= 21) {
            return;
        } else{
            scoreDealer = scoreDealer + 7;}
        displayForDealer(scoreDealer);
    }

    /**
     * This method is called when the "+8" button for Dealer is clicked.
     */
    public void plusEightDealer(View view) {
        if (scoreDealer >= 17 && scoreDealer <= 21) {
            return;
        } else{
            scoreDealer = scoreDealer + 8;}
        displayForDealer(scoreDealer);
    }

    /**
     * This method is called when the "+9" button for Dealer is clicked.
     */
    public void plusNineDealer(View view) {
        if (scoreDealer >= 17 && scoreDealer <= 21) {
            return;
        } else{
            scoreDealer = scoreDealer + 9;}
        displayForDealer(scoreDealer);
    }

    /**
     * This method is called when the "+10" button for Dealer is clicked.
     */
    public void plusTenDealer(View view) {
        if (scoreDealer >= 17 && scoreDealer <= 21) {
            return;
        } else{
            scoreDealer = scoreDealer + 10;}
        displayForDealer(scoreDealer);
    }

    /**
     * This method is called when the "+11" button for Dealer is clicked.
     */
    public void plusElevenDealer(View view) {
        if (scoreDealer >= 17 && scoreDealer <= 21) {
            return;
        } else{
        scoreDealer = scoreDealer + 11;}
        displayForDealer(scoreDealer);
    }

    /**
     * This method is called when the "Winner" button is clicked.
     * It compares the scores and says who is the winner.
     */
    public void winner(View view) {
        winner = "Player wins!";
        winner1 = "BlackJack! Player wins!";
        loser = "Player loses, Dealer wins!";
        draw = "Draw! Press Reset \nand start again!";
        bothLost = "Both Player and Dealer lose!";
        bothWon = "BlackJack! Both Player and Dealer win!";
        if (scorePlayer > scoreDealer && scorePlayer < 21)
        {displayMessage(winner);}
        if (scorePlayer == 21)
        {displayMessage(winner1);}
        if (scorePlayer < scoreDealer && scoreDealer > 21 && scorePlayer < 21)
        {displayMessage(winner);}
        if (scorePlayer > scoreDealer && scoreDealer == 21)
        {displayMessage(loser);}
        if (scorePlayer < scoreDealer && scoreDealer <= 21)
        {displayMessage(loser);}
        if (scorePlayer > scoreDealer && scorePlayer > 21)
        {displayMessage(loser);}
        if (scorePlayer > 21 && scoreDealer > 21)
        {displayMessage(bothLost);}
        if (scorePlayer == scoreDealer && scorePlayer == 21)
        {displayMessage(bothWon);}
        if (scorePlayer == scoreDealer && scorePlayer < 21)
        {displayMessage(draw);}
    }
    /**
     * This method is called when the "Reset" button is clicked.
     * It resets the score for both players back to 0 and clears messages.
     */
    public void reset(View view) {
        scorePlayer = 0;
        scoreDealer = 0;
        winner = "";
        winner1 = "";
        loser = "";
        draw="";
        bothLost="";
        bothWon="";
        displayForPlayer(scorePlayer);
        displayForDealer(scoreDealer);
        displayMessage(winner);
        displayMessage(loser);
        displayMessage(draw);
        displayMessage(bothLost);
        displayMessage(bothWon);
        displayMessage(winner1);
    }
}

