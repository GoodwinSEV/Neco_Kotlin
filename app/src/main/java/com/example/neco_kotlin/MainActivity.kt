package com.example.neco_kotlin

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    //Объявление переменных
    private var text: String = "На дощатой <террасе>, под звуки виолончели <Аполлинария> Николаевна <потчевала> Иннокентия Иннокентьевича <винегретом> и прочими <яствами> и просила сдать ведомости"
    private var tvText: TextView? = null; //Создали переменную для TextView


       @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
           super.onCreate(savedInstanceState)
           setContentView(R.layout.activity_main) //отображение нужного слоя
           tvText = findViewById(R.id.tvTextView2) //Связали переменную и компонент
           var subText: String = text.substringAfter('<')
           var subText2: String = subText.substringBefore('>')

           for (n in 0..10) //перебор от 0 до 10
           {
               Log.d("MyLog", "N is : " + n)
           }
            //Отобразить содержимое переменной tvText на компоненте tvTextView2
           tvText?.setText(subText2)

       }

    //Написать любое предложение и заключить два слова в треул скобки, разместить еще один
    //TextView на активити и отобразит эти два слова в TextView

}