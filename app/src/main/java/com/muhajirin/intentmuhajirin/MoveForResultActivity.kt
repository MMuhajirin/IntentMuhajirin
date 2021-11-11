package com.muhajirin.intentmuhajirin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.core.os.bundleOf

class MoveForResultActivity : AppCompatActivity() {
    var rgDrink: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var btnChoose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_for_result)

        rgDrink = findViewById(R.id.rg_drink)
        btnChoose = findViewById(R.id.btn_choose)
        btnChoose.setOnClickListener {
            val selectedOption: Int = rgDrink!!.checkedRadioButtonId
            radioButton = findViewById(selectedOption)

            val intent = Intent(this, MainActivity::class.java)
            val bundle = Bundle()
            bundle.putString("Warna", radioButton.text as String?)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}