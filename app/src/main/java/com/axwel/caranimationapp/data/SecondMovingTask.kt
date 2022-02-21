package com.axwel.caranimationapp.data

import android.animation.ObjectAnimator
import android.view.View

class SecondMovingTask(val view: View): MovingTask {
    override fun getMoving(): ObjectAnimator {
        return ObjectAnimator.ofFloat(view, "rotation", -90F).apply {
            duration = 1000
        }
    }
}