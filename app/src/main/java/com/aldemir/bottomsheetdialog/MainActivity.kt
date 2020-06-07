package com.aldemir.bottomsheetdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonShow.setOnClickListener {
            val bottomSheetDialog = BottomSheetDialog(this@MainActivity, R.style.BottomSheetDialogTheme)
            val bottomSheetView = LayoutInflater.from(applicationContext)
                    .inflate(R.layout.layout_bottom_sheet,
                            findViewById<LinearLayout>(R.id.bottomSheetContainer)
                    )
            bottomSheetView.findViewById<Button>(R.id.buttonShare).setOnClickListener {
                Toast.makeText(this@MainActivity, "Add Share ...", Toast.LENGTH_SHORT).show()

            }

            bottomSheetDialog.setContentView(bottomSheetView)
//            bottomSheetDialog.dismissWithAnimation = true
            bottomSheetDialog.show()
        }
    }
}
