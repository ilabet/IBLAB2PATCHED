package com.example.iblab2seniorclass
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var emails: List<Email>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailsRv = findViewById<RecyclerView>(R.id.emailsRv)

        emails = EmailFetcher.getEmails()

        val emailAdapter = EmailAdapter(emails)

        emailsRv.adapter = emailAdapter
        emailsRv.layoutManager = LinearLayoutManager(this)
    }
}
