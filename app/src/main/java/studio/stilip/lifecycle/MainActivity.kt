package studio.stilip.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            addSenderFragment()
        }
    }

    private fun addSenderFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.main_fragment, SenderFragment())
            .commit()
    }
}