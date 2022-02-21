package com.axwel.caranimationapp

import com.arellomobile.mvp.MvpView

interface CarView: MvpView {
    fun setToStart()
    fun go()
}