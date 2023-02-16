package com.example.neco_kotlin

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    //Объявление переменных
    private var text: String = "В магазине <осталось> 10 банок колы, а <может> и больше"
    private var tvText: TextView? = null; //Создали переменную для TextView


       @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
           super.onCreate(savedInstanceState)
           setContentView(R.layout.activity_main) //отображение нужного слоя
           tvText = findViewById(R.id.tvTextView2) //Связали переменную и компонент
           var subText: String = text.substringAfter('<')
           var subText2: String = subText.substringBefore('>')
            //Отобразить содержимое переменной tvText на компоненте tvTextView2
           tvText?.setText(subText2)

       }

    //Написать любое предложение и заключить два слова в треул скобки, разместить еще один
    //TextView на активити и отобразит эти два слова в TextView

}