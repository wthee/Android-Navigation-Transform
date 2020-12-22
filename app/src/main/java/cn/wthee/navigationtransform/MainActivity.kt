package cn.wthee.navigationtransform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.wthee.navigationtransform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}