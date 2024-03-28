package com.example.introduce

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signup_id = findViewById<EditText>(R.id.signup_inputid)
        val signup_password = findViewById<EditText>(R.id.signup_inputpassword)
        val signup_name = findViewById<EditText>(R.id.signup_inputname)
        val btn_signup = findViewById<Button>(R.id.bt_create)

        btn_signup.setOnClickListener {
            if(signup_id.text.isBlank() || signup_password.text.isBlank() ||signup_name.text.isBlank())
                Toast.makeText(this@SignUpActivity, "공란 없이 입력해주세요.", Toast.LENGTH_SHORT).show()
            else{
                val intent = Intent(this, SignInActivity::class.java)
                intent.putExtra("id", signup_id.text.toString())
                intent.putExtra("name", signup_name.text.toString())
                intent.putExtra("password", signup_password.text.toString())
                setResult(RESULT_OK, intent)
                finish()
            }
        }
    }
}