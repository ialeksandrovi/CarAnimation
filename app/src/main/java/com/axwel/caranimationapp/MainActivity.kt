package com.axwel.caranimationapp

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Display
import androidx.appcompat.widget.AppCompatImageView
import com.arellomobile.mvp.presenter.InjectPresenter

class MainActivity : AppCompatActivity() {
    lateinit var car: AppCompatImageView
    lateinit var animatorSet: AnimatorSet


    lateinit var presenter: CarPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = CarPresenter()

        car = findViewById(R.id.ivCar)

        presenter.detectAutodromSizes(windowManager.defaultDisplay)



        car.setOnClickListener {
            animatorSet = AnimatorSet()

            if (car.translationX != 25F) {
                car.translationX = 25F
                car.translationY = 25F

                car.rotation = 30F
            }
            presenter.go(car)
        }
    }
}