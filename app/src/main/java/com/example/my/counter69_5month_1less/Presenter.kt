package com.example.my.counter69_5month_1less

import com.example.my.counter69_5month_1less.model.CounterModel
import com.example.my.counter69_5month_1less.view.CounterView

class Presenter(private val view: CounterView) {

    private var model = CounterModel()

    fun increment() {
        model.increment()
        showToast()
        changeColor()
        view.updateActualCount(model.count)
    }

    private fun showToast() {
        if (model.count == 10) {
            view.showToast("Поздравляем")
        }
    }

    private fun changeColor() {
        if (model.count in -15..15) {
            view.changeColor(R.color.black)
        } else {
            view.changeColor(R.color.green)
        }
    }

}