package com.example.introduce

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class SignInActivity : AppCompatActivity() {
    private lateinit var getResult : ActivityResultLauncher<Intent>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        var signin_id = findViewById<EditText>(R.id.signin_inputid)
        var signin_password = findViewById<EditText>(R.id.signin_inputpassword)
        val btn_login = findViewById<Button>(R.id.bt_login)
        val btn_signup = findViewById<Button>(R.id.bt_signup)



        btn_login.setOnClickListener {
            if(signin_id.text.isBlank() || signin_password.text.isBlank())
                Toast.makeText(this@SignInActivity, "공란 없이 입력해주세요.", Toast.LENGTH_SHORT).show()
            else {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("id", signin_id.text.toString())
                startActivity(intent)
            }
        }

        btn_signup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            //startActivity(intent)
            getResult.launch(intent)
        }
       getResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){result ->
           if(result.resultCode == RESULT_OK){
               val getId = result.data?.getStringExtra("id") ?: ""
               val getPassword = result.data?.getStringExtra("password") ?: ""
               signin_id.setText(getId)
               signin_password.setText(getPassword)
           }
       }

    }
}


