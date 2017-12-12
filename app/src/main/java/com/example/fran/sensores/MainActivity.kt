package com.example.fran.sensores

import android.content.Context
import android.hardware.Sensor
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.hardware.SensorManager
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

   var salida: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        salida = findViewById<View>(R.id.salida) as TextView
        val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        val listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL)
        for (sensor in listaSensores) {
            log(sensor.name)
        }
    }

    private fun log(string: String) {
        salida!!.append(string + "\n")
    }

}
