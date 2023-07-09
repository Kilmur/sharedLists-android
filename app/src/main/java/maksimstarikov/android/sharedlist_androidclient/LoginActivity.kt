package maksimstarikov.android.sharedlist_androidclient

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    fun onCLickLogin(view: View) {
        val inputEmailField = findViewById<EditText>(R.id.loginPage_inputEmail)
        inputEmailField.setText("asdasda")
    }
}
