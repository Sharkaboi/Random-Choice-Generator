package com.example.randomchoicegenerator

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
           private val choicelist = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         choicestext.append("\n")
        selectbutton.setOnClickListener{
            if(choicelist.isNotEmpty()){
            val rand= Random()
            val randchoice= rand.nextInt(choicelist.count())
            anstext.setText("I choose "+(choicelist[randchoice])+" !")
            }
            else{anstext.text="No  Choices Entered!"}
        }
        addbtn.setOnClickListener{
            if(c1tf.text.isNotBlank() && c1tf.text.isNotEmpty()){
            val choice=c1tf.text.toString()
            choicelist.add(choice)
            choicestext.append("$choice\n")
            c1tf.text.clear()
            c1tf.clearFocus()}
            else{anstext.text="Invalid Entry"}
        }
        clrbtn.setOnClickListener{
            choicelist.clear()
            anstext.text=null
            choicestext.text="Choices:\n"
            c1tf.setText(null)

        }
    }
}
