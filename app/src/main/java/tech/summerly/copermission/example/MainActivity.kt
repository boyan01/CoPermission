package tech.summerly.copermission.example

import android.Manifest
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.launch
import tech.summerly.copermission.requestPermission

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun requestReadPhoneState(view: View) {
        launch {
            val isGranted = requestPermission(Manifest.permission.READ_PHONE_STATE)
            toast("isGranted ? : $isGranted")
        }
    }

    fun request2(view: View) {
        launch {
            val isGranted = requestPermission(Manifest.permission.READ_PHONE_STATE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.ACCESS_FINE_LOCATION)
            toast("isGranted ? : ${isGranted.joinToString()}")
        }
    }

    private fun toast(string: String) = launch(UI) {
        Toast.makeText(this@MainActivity, string, Toast.LENGTH_SHORT).show()
    }
}
