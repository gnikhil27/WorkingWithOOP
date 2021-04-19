package nik.iant.workingwithoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import nik.iant.workingwithoop.Student
import nik.iant.workingwithoop.Maths
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var student1 = Student()
        student1.getData("Nikhil",20,1)
        Toast.makeText(this,student1.StudentName,Toast.LENGTH_LONG).show()

        val txtbx = findViewById<EditText>(R.id.edtVal)
        txtbx.setOnKeyListener(View.OnKeyListener(
             function = fun(v:View,keyCode:Int, keyEvent: KeyEvent?):Boolean{
                 var txtAns= findViewById<TextView>(R.id.textView)
                 val m=Maths()
                 if(!txtbx.text.toString().isNullOrBlank())
                    txtAns.setText(m.factorial(txtbx.text.toString().toDouble()).toString())
                return false
            }
        ))
    }

    override fun onBackPressed() {
        Toast.makeText(this, "Closing App", Toast.LENGTH_LONG).show()
        super.onBackPressed()
    }
}