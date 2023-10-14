package com.example.my.counter69_5month_1less

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.my.counter69_5month_1less.databinding.ActivityMainBinding
import com.example.my.counter69_5month_1less.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding

    private var presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        binding.incrementBtn.setOnClickListener {
            presenter.increment()
        }
    }

    override fun updateActualCount(count: Int) {
        binding.tvCountTv.text = count.toString()
    }

    override fun showToast(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun changeColor(color: Int) {
        binding.tvCountTv.setTextColor(getColor(color))
    }

}