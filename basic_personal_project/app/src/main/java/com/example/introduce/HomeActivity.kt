package com.example.introduce

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class HomeActivity : AppCompatActivity(){
    var random = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val show_id = findViewById<TextView>(R.id.home_showid)
        val id = intent.getStringExtra("id")
        val finish_btn = findViewById<Button>(R.id.home_finishbtn)
        val img = findViewById<ImageView>(R.id.home_profile)

        show_id.setText(id) //로그인 아이디를 보여줌

        var count = random.nextInt(4) + 1
        when(count){ //랜덤 이미지 출력
            1 -> img.setImageResource(R.drawable.baseline_arrow_downward_24)
            2 -> img.setImageResource(R.drawable.baseline_arrow_back_24)
            3 -> img.setImageResource(R.drawable.baseline_arrow_forward_24)
            4 -> img.setImageResource(R.drawable.baseline_arrow_upward_24)
        }

        finish_btn.setOnClickListener { //버튼 클릭 시 종료
            finish()
        }
    }
}