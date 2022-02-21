package com.axwel.caranimationapp.data

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MovingQueue {
    fun runQueue(queue: MutableList<MovingTask>) {
        CoroutineScope(Dispatchers.Main).launch {
            queue.forEach {
                val scope = CoroutineScope(Dispatchers.Main).async {
                    it.getMoving().start()
                }
                scope.await()
            }
        }
    }
}