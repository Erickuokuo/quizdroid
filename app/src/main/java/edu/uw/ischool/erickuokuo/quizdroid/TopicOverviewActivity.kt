package edu.uw.ischool.erickuokuo.quizdroid
import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
// TopicOverviewActivity.kt
class TopicOverviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(edu.uw.ischool.erickuokuo.quizdroid.R.layout.activity_topic_overview)

        val topic = intent.getStringExtra("topic") ?: ""
        val description = "This is a brief description of the $topic topic."
        val totalQuestions = 10 // Set the total number of questions.

        val descriptionTextView = findViewById<TextView>(edu.uw.ischool.erickuokuo.quizdroid.R.id.descriptionTextView)
        val beginButton = findViewById<Button>(edu.uw.ischool.erickuokuo.quizdroid.R.id.beginButton)

        descriptionTextView.text = description
        // Set the total number of questions text.

        beginButton.setOnClickListener {
            // Start the QuestionActivity for the selected topic.
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("topic", topic)
            startActivity(intent)
        }
    }
}
