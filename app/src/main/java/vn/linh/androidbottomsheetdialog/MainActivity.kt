package vn.linh.androidbottomsheetdialog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.widget.Button
import kotlinx.android.synthetic.main.bottom_sheet_view.*
import kotlinx.android.synthetic.main.content_main.*
import android.support.design.widget.BottomSheetDialog



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



       val sheetBehavior = BottomSheetBehavior.from(bottom_sheet)
        findViewById<Button>(R.id.btn_bottom_sheet).setOnClickListener {
            if (sheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED) {
                sheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
                btn_bottom_sheet.text = "Close sheet"
            } else {
                sheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
                btn_bottom_sheet.text = "Expand sheet"
            }
        }

        findViewById<Button>(R.id.btn_bottom_sheet_dialog).setOnClickListener {
            val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog, null)

            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }

        findViewById<Button>(R.id.btn_bottom_sheet_dialog_fragment).setOnClickListener {

            val bottomSheetFragment = BottomSheetFragment()
            bottomSheetFragment.show(supportFragmentManager,"" )
        }
    }
}
