package com.axwel.caranimationapp

import android.graphics.Point
import android.view.Display
import android.view.View
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.axwel.caranimationapp.data.*
import java.util.concurrent.BlockingQueue
import java.util.concurrent.PriorityBlockingQueue

@InjectViewState
class CarPresenter: MvpPresenter<CarView>() {
    private var height: Float = 0f
    private var width: Float = 0f

    private var queue: MutableList<MovingTask> = mutableListOf()


    fun detectAutodromSizes(display: Display) {
        val point = Point()
        display.getSize(point)
        width = point.x.toFloat()
        height = point.y.toFloat()
    }

    fun go(view: View) {
        view.also {
            queue.apply {
                add(FirstMovingTask(view, width))
                add(SecondMovingTask(view))
                add(ThirdMovingTask(view, height))
                add(FourthMovingTask(view))
            }
        }
        MovingQueue().runQueue(queue)
    }


}