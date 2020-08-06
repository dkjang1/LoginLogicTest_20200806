package com.kakao.loginlogictest_20200806

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtLoginEmail.setText("admin@test.com")
        edtLoginPassword.setText("qwer")

//        로그인버튼을클릭할경우
        btnLogin.setOnClickListener {

//            아이디 입력값, 비밀번호 입력값 저장
            val inputEmail = edtLoginEmail.text.toString()
            val inputPassword = edtLoginPassword.text.toString()

//            저장값 해당조건 처리
//            아이디 admin@text.com 이고 비밀번호 qwer 일경우
            if (inputEmail == "admin@test.com" && inputPassword == "qwer") {
                Toast.makeText(this, "로그인성공\n관리자입니다", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "로그인실패", Toast.LENGTH_SHORT).show()
            }


        }
    }
}