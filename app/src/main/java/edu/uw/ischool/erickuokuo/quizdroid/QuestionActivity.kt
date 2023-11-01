package edu.uw.ischool.erickuokuo.quizdroid
import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
// QuestionActivity.kt
class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(edu.uw.ischool.erickuokuo.quizdroid.R.layout.activity_question)

        val topic = intent.getStringExtra("topic") ?: ""
        val questionText = "What is the capital of France?" // Set the question.
        val answers = listOf("New York", "London", "Paris", "Berlin") // Set the answer choices.

        val questionTextView = findViewById<TextView>(edu.uw.ischool.erickuokuo.quizdroid.R.id.questionTextView)
        val radioGroup = findViewById<RadioGroup>(edu.uw.ischool.erickuokuo.quizdroid.R.id.radioGroup)
        val submitButton = findViewById<Button>(edu.uw.ischool.erickuokuo.quizdroid.R.id.submitButton)

        questionTextView.text = questionText
        for (answer in answers) {
            val radioButton = RadioButton(this)
            radioButton.text = answer
            radioGroup.addView(radioButton)
        }

        submitButton.setOnClickListener {
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            if (selectedRadioButtonId != -1) {
                // Handle user's choice and navigate to the AnswerActivity.
            } else {
                // Show a message to select an answer.
            }
        }
    }
}
