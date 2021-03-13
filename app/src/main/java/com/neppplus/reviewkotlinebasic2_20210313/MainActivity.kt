package com.neppplus.reviewkotlinebasic2_20210313

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if문 연습 코드

        val myAge = 34

        if (myAge >= 30) {
            Log.d("나이", "30대 이상")
        }

        else if (myAge >= 20) {
            Log.d("나이", "20대")

        }

        else {
            Log.d("나이", "미성년자")
        }



        sendBtn.setOnClickListener {

//            버튼이 눌리면
//            1. inputEdt에 적힌 내용을 inputMessage 변수에 메모 : get

            val inputMessage = inputEdt.text.toString()

//            2. contentTxt의 text속성값을 inputMessage에 적힌 값으로 변경 : set

            contentTxt.text = inputMessage


        }

    }
}