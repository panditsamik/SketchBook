package com.example.sketchbook

import android.graphics.Color
import android.graphics.Color.red
import android.graphics.Paint
import android.graphics.Path
import android.graphics.drawable.ColorDrawable
import android.hardware.camera2.params.ColorSpaceTransform
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.text.method.TextKeyListener.clear
import android.widget.ImageButton
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.graphics.red
import com.example.sketchbook.PaintView.Companion.colourList
import com.example.sketchbook.PaintView.Companion.currentBrush
import com.example.sketchbook.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var redbtn = findViewById<ImageButton>(R.id.redbtn)
        var bluebtn = findViewById<ImageButton>(R.id.bluebtn)
        var greenbtn = findViewById<ImageButton>(R.id.greenbtn)
        var yellowbtn = findViewById<ImageButton>(R.id.yellowbtn)
        var orangebtn = findViewById<ImageButton>(R.id.orangebtn)
        var eraserbtn = findViewById<ImageButton>(R.id.eraser)
        var brushbtn = findViewById<ImageButton>(R.id.Brush)

        redbtn.setOnClickListener {
            Toast.makeText(this,"Red",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.RED
            currentColour(paintBrush.color)
        }
        bluebtn.setOnClickListener {
            Toast.makeText(this,"Blue",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.BLUE
            currentColour(paintBrush.color)
        }
        greenbtn.setOnClickListener {
            Toast.makeText(this,"Green",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.GREEN
            currentColour(paintBrush.color)
        }
        yellowbtn.setOnClickListener {
            Toast.makeText(this,"Yellow",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.YELLOW
            currentColour(paintBrush.color)
        }
        orangebtn.setOnClickListener {
            Toast.makeText(this,"Grey",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.GRAY
            currentColour(paintBrush.color)
        }
        eraserbtn.setOnClickListener {
            Toast.makeText(this,"Cleared",Toast.LENGTH_LONG).show()
            pathList.clear()
            colourList.clear()
            path.reset()
        }
        brushbtn.setOnClickListener {
            Toast.makeText(this,"Brush",Toast.LENGTH_LONG).show()
        }


    }
    private fun currentColour(colour : Int){
        currentBrush = colour
        path = Path()
    }
}
