package playground.mine.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textChange = findViewById<TextView>(R.id.guza)
        val btnClickMe = findViewById<Button>(R.id.mybutton)
        var counter = 0
        btnClickMe.text = "Haha"
        btnClickMe.setOnClickListener {
            btnClickMe.text = "Hoho"

            counter += 1

            textChange.text = counter.toString()
        }
    }
}