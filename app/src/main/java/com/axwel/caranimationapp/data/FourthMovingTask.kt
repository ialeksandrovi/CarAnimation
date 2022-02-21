package com.axwel.caranimationapp.data

import android.animation.ObjectAnimator
import android.view.View

class FourthMovingTask(private val view: View): MovingTask {
    override fun getMoving(): ObjectAnimator {
        return ObjectAnimator.ofFloat(view, "translationY", 100F).apply {
            duration = 1000
        }
    }
}