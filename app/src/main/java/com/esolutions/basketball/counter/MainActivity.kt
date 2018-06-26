package com.esolutions.basketball.counter

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var mViewModel: ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)
        displayForTeamA(mViewModel.scoreTeamA)
        displayForTeamB(mViewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 1
        displayForTeamA(mViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 2
        displayForTeamA(mViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 3
        displayForTeamA(mViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 1
        displayForTeamB(mViewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 2
        displayForTeamB(mViewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 3
        displayForTeamB(mViewModel.scoreTeamB)
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View) {
        mViewModel.scoreTeamA = 0
        mViewModel.scoreTeamB = 0
        displayForTeamA(mViewModel.scoreTeamA)
        displayForTeamB(mViewModel.scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = findViewById<View>(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = findViewById<View>(R.id.team_b_score) as TextView
        scoreView.text = score.toString()
    }
}
