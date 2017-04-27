package com.example.android.volleyballscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * This App counts the given score for Team A.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int Ascore = 0;

    public void PointA (View view) {
        Ascore = Ascore + 1;
        displayForTeamA(Ascore);

    }

    public void CancelA (View view) {
        Ascore = Ascore - 1;
        displayForTeamA(Ascore);

    }



    int Bscore = 0;
    int limit = 0;

    public void PointB (View view) {
        Bscore = Bscore + 1;
        displayForTeamB(Bscore);

    }

    public void CancelB (View view) {
        Bscore = Bscore - 1;
        displayForTeamB(Bscore);

    }
    public void firstSet (View view) {
        int BfirstSet = Bscore;
        int AfirstSet = Ascore;
        Bscore = 0;
        Ascore = 0;
        displayForTeamB(Bscore);
        displayForTeamA(Ascore);
        displayBfirstSet(BfirstSet);
        displayAfirstSet(AfirstSet);

    }
    public void secondSet (View view) {
        int BsecondSet = Bscore;
        int AsecondSet = Ascore;
        Bscore = 0;
        Ascore = 0;
        displayForTeamB(Bscore);
        displayForTeamA(Ascore);
        displayBsecondSet(BsecondSet);
        displayAsecondSet(AsecondSet);

    }
    public void thirdSet (View view) {
        int BthirdSet = Bscore;
        int AthirdSet = Ascore;
        Bscore = 0;
        Ascore = 0;
        displayForTeamB(Bscore);
        displayForTeamA(Ascore);
        displayBthirdSet(BthirdSet);
        displayAthirdSet(AthirdSet);

    }
    public void fourthSet (View view) {
        int BfourthSet = Bscore;
        int AfourthSet = Ascore;
        Bscore = 0;
        Ascore = 0;
        displayForTeamB(Bscore);
        displayForTeamA(Ascore);
        displayBfourthSet(BfourthSet);
        displayAfourthSet(AfourthSet);

    }
    public void fifthSet (View view) {
        int BfifthSet = Bscore;
        int AfifthSet = Ascore;
        Bscore = 0;
        Ascore = 0;
        displayForTeamB(Bscore);
        displayForTeamA(Ascore);
        displayBfifthSet(BfifthSet);
        displayAfifthSet(AfifthSet);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int Ascore) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(Ascore));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int Bscore) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(Bscore));
    }
    /**
     * Displays the last score for Team B.
     */
    public void displayBfirstSet(int BfirstSet) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_1st);
        scoreView.setText(String.valueOf(BfirstSet));
    }
    /**
     * Displays the last score for Team B.
     */
    public void displayAfirstSet(int AfirstSet) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_1st);
        scoreView.setText(String.valueOf(AfirstSet));
    }
    /**
     * Displays the secondSet for Team B.
     */
    public void displayBsecondSet(int BsecondSet) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_2nd);
        scoreView.setText(String.valueOf(BsecondSet));
    }
    /**
     * Displays the secondSet for Team B.
     */
    public void displayAsecondSet(int AsecondSet) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_2nd);
        scoreView.setText(String.valueOf(AsecondSet));
    }
    /**
     * Displays the secondSet for Team B.
     */
    public void displayBthirdSet(int BthirdSet) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_3rd);
        scoreView.setText(String.valueOf(BthirdSet));
    }
    /**
     * Displays the secondSet for Team B.
     */
    public void displayAthirdSet(int AthirdSet) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_3rd);
        scoreView.setText(String.valueOf(AthirdSet));
    }
    /**
     * Displays the secondSet for Team B.
     */
    public void displayBfourthSet(int BfourthSet) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_4th);
        scoreView.setText(String.valueOf(BfourthSet));
    }
    /**
     * Displays the secondSet for Team B.
     */
    public void displayAfourthSet(int AfourthSet) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_4th);
        scoreView.setText(String.valueOf(AfourthSet));
    }
    /**
     * Displays the secondSet for Team B.
     */
    public void displayBfifthSet(int BfifthSet) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_5th);
        scoreView.setText(String.valueOf(BfifthSet));
    }
    /**
     * Displays the secondSet for Team B.
     */
    public void displayAfifthSet(int AfifthSet) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_5th);
        scoreView.setText(String.valueOf(AfifthSet));
    }





}
