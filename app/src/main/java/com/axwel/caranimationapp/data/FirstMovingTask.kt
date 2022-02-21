package com.axwel.caranimationapp.data

import android.animation.ObjectAnimator
import android.view.View

class FirstMovingTask(private val view: View, private val value: Float): MovingTask {
    override fun getMoving(): ObjectAnimator {
        return ObjectAnimator
            .ofFloat(view, "translationX", -value/1.28F).apply {
                duration = 1000
            }
    }
}