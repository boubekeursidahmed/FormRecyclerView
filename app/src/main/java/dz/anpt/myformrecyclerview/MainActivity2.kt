package dz.anpt.myformrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tvName : TextView = findViewById(R.id.a2_tvTitle)
        val tvAge : TextView = findViewById(R.id.a2_tvAge)
        val img : ImageView = findViewById(R.id.a2_img)

        tvName.text = intent.getStringExtra("name_user")
        tvAge.text = intent.getIntExtra("age_user", 0).toString()
        img.setImageResource(intent.getIntExtra("img_user", 0))
    }
}