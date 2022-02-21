package com.axwel.caranimationapp.data

import android.animation.ObjectAnimator
import android.view.View

class ThirdMovingTask(private val view: View, private val height: Float): MovingTask {
    override fun getMoving(): ObjectAnimator {
        return ObjectAnimator.ofFloat(view, "translationY", -height/2F).apply {
            duration = 1000
        }
    }
}