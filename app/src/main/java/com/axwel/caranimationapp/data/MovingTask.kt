package com.axwel.caranimationapp.data

import android.animation.ObjectAnimator

interface MovingTask {
    fun getMoving(): ObjectAnimator
}