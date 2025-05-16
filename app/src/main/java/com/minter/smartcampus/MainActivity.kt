package com.minter.smartcampus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

//앱의 시작 화면 정의
class MainActivity : ComponentActivity() {
    //초기화 작업을 넣는 메인 함수
    override fun onCreate(savedInstanceState: Bundle?) {
        //시스템 UI, 테마 등 자동 초기화
        super.onCreate(savedInstanceState)

        enableEdgeToEdge() //상태바, 네비게이션바까지 확장해서 그리도록 설정

        // XML 기반 UI 연결
        setContentView(R.layout.activity_login)




    }
}

