package com.esolutions.basketball.counter

import android.arch.lifecycle.ViewModel

class ScoreViewModel: ViewModel() {
    // Tracks the score for the team A
    var scoreTeamA: Int = 0

    // Tracks the score for the team B
    var scoreTeamB: Int = 0
}