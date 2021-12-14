package jp.ac.it_college.std.s20020.time

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.ac.it_college.std.s20020.time.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.n0.minValue = 0
        binding.n0.maxValue= 24





        binding.button.setOnClickListener{
            val a = TimePicer()

            a.show(supportFragmentManager, "datePicker")
            println(binding.n0.value)
        }


    }
}