package com.infraredcontrol.abrsmarttech

import android.hardware.ConsumerIrManager
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_dashboard.*
import android.content.Context
import android.os.*
import android.support.v7.app.AlertDialog
import android.widget.SeekBar
import android.widget.Toast

class Dashboard : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val IR = getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager
        bulb1.setOnClickListener {
            bulb1.setImageResource(R.mipmap.on2)
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            Handler().postDelayed({
                bulb1.setImageResource(R.mipmap.off2)
            }, 500)
            val pattern1 = intArrayOf(1901, 4453, 650, 1614, 650, 1588, 650, 1614, 650, 442, 650,442, 650, 468, 650, 442, 650, 494, 572,
                    1614, 650, 1588, 650, 1614, 650, 494, 572,442, 651, 442, 650, 442, 650, 442, 650, 1614, 650, 1588, 651, 1588, 650, 442, 650,
                    494, 598, 442, 650, 442, 650, 520, 572, 442, 650, 442, 650, 442, 651,
                    1588, 650, 1614, 650, 1588, 650, 1614, 650, 1588, 650, 48958)
            CheckInfraredonDevice(IR,pattern1)

        }
        bulb2.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            bulb2.setImageResource(R.mipmap.on2)
            Handler().postDelayed({
                bulb2.setImageResource(R.mipmap.off2)
            }, 500)
            val pattern1 = intArrayOf(1901, 4453,650, 494, 572,442, 651, 442, 650, 442, 650, 442, 650, 1614, 650, 1588,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,1)

            CheckInfraredonDevice(IR,pattern1)

        }
        bulb3.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            bulb3.setImageResource(R.mipmap.on2)
            Handler().postDelayed({
                bulb3.setImageResource(R.mipmap.off2)
            }, 500)
//            val pattern1 = intArrayOf(1901, 4453,494, 598, 442, 650, 442, 650, 520, 572, 442, 650, 442, 650, 442, 651,96,32,16,32,16,16,16,16,16,32,32,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,32,1)
            val pattern1 = intArrayOf(1901, 4453, 442, 650, 442, 650, 1614, 650, 1588, 651, 1588, 650,494, 598, 442, 650, 442, 650, 520, 572, 442, 650, 442, 650, 442, 651,96,32,16,32,16,16,16,16,16,32,32,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,32,1)

            CheckInfraredonDevice(IR,pattern1)

        }
        bulb4.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            bulb4.setImageResource(R.mipmap.on2)
            Handler().postDelayed({
                bulb4.setImageResource(R.mipmap.off2)
            }, 500)
            val pattern1 = intArrayOf(1901, 4453,96,32,1614, 650, 1588, 650, 1614, 650, 494, 572,442, 651, 442, 650, 442, 650, 442, 650, 1614, 650, 1588, 651, 1588, 650, 442,16,16,16,16,16,16,16,16,16,16,32,32,16,16,16,16,16,16,32,32,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,1)

            CheckInfraredonDevice(IR,pattern1)

        }






//        // next line
//        bulb5.setOnClickListener {
//            signal.visibility = View.VISIBLE
//            Handler().postDelayed({
//                signal.visibility = View.INVISIBLE
//            }, 10)
//            bulb5.setImageResource(R.mipmap.on2)
//            Handler().postDelayed({
//                bulb5.setImageResource(R.mipmap.off2)
//            }, 500)
//            CheckInfraredonDevice(IR,38000)
//        }
//        bulb6.setOnClickListener {
//            signal.visibility = View.VISIBLE
//            Handler().postDelayed({
//                signal.visibility = View.INVISIBLE
//            }, 10)
//            bulb6.setImageResource(R.mipmap.on2)
//            Handler().postDelayed({
//                bulb6.setImageResource(R.mipmap.off2)
//            }, 500)
//            CheckInfraredonDevice(IR,38000)
//        }
//        bulb7.setOnClickListener {
//            signal.visibility = View.VISIBLE
//            Handler().postDelayed({
//                signal.visibility = View.INVISIBLE
//            }, 10)
//            bulb7.setImageResource(R.mipmap.on2)
//            Handler().postDelayed({
//                bulb7.setImageResource(R.mipmap.off2)
//            }, 500)
//            CheckInfraredonDevice(IR,38000)
//        }
//        bulb8.setOnClickListener {
//            signal.visibility = View.VISIBLE
//            Handler().postDelayed({
//                signal.visibility = View.INVISIBLE
//            }, 10)
//            bulb8.setImageResource(R.mipmap.on2)
//            Handler().postDelayed({
//                bulb8.setImageResource(R.mipmap.off2)
//            }, 500)
//            CheckInfraredonDevice(IR,38000)
//        }

        fanoff.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            val pattern1 = intArrayOf(1901,1588, 650,494, 598, 442, 650, 442, 650, 520, 572, 442, 650, 442, 650, 442, 650, 1614, 650, 1588, 651, 1588, 650, 442,32,32,32,32,64,64,64,64,32,32,32,32,32,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,1)

            CheckInfraredonDevice(IR,pattern1)

        }

        minus.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            val pattern1 = intArrayOf(1901, 4453, 651, 442, 650, 442, 650, 442, 650, 1614, 650, 1588, 651, 1588, 650,494, 598, 442, 650, 442, 650, 520, 572,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,32,1)
            CheckInfraredonDevice(IR,pattern1)
        }

        plus.setOnClickListener{
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            val pattern1 = intArrayOf(1901, 442, 650, 1614, 650, 1588, 651, 1588, 650, 442, 650,494, 598, 442, 650, 442, 650, 520, 572, 442, 650, 442, 650, 442, 651,1588, 650, 1614, 650, 1588, 650, 1614, 650, 1588, 650, 48958)
            CheckInfraredonDevice(IR,pattern1)
        }

        shutdown.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            val pattern1 = intArrayOf(1901, 4453, 442, 650, 442, 650, 1614, 650, 1588, 651, 1588, 442,650,442,651,96,32,16,32,16,16,16,16,16,32,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,32,1)
            CheckInfraredonDevice(IR,pattern1)

        }

        signal.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)

        }

    }
    fun CheckInfraredonDevice(IR:ConsumerIrManager,pattern:IntArray) {

        val vb = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if(vb.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                vb.vibrate(VibrationEffect.createOneShot(100, 70))
            }
            else {
                vb.vibrate(70);
            }
        }
        if (!IR.hasIrEmitter()) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("ARB Infrared")
        builder.setMessage("No Infrared found on this device..!!")
        builder.setNeutralButton("OK") { dialog, which -> null }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
        else {
            IR.transmit(38000, pattern)

        }


    }


}

