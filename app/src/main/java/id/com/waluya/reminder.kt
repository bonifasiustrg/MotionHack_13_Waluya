package id.com.waluya

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class reminder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reminder)

        val buttonImageView1 = findViewById<ImageView>(R.id.buatjadwal)
        buttonImageView1.setOnClickListener {
            val intent = Intent(this, reminder_saveobat::class.java)
            startActivity(intent)
        }
    }
}