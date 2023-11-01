package edu.uw.ischool.erickuokuo.quizdroid
import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
// AnswerActivity.kt
class AnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(edu.uw.ischool.erickuokuo.quizdroid.R.layout.answer_activity)

        val userAnswer = "Paris" // Set the user's answer.
        val correctAnswer = "Paris" // Set the correct answer.
        val correctCount = 5 // Set the correct count.
        val totalCount = 9 // Set the total count.

        val userAnswerTextView = findViewById<TextView>(edu.uw.ischool.erickuokuo.quizdroid.R.id.userAnswerTextView)
        val correctAnswerTextView = findViewById<TextView>(edu.uw.ischool.erickuokuo.quizdroid.R.id.correctAnswerTextView)
        val scoreTextView = findViewById<TextView>(edu.uw.ischool.erickuokuo.quizdroid.R.id.scoreTextView)
        val nextButton = findViewById<Button>(edu.uw.ischool.erickuokuo.quizdroid.R.id.nextButton)
        val finishButton = findViewById<Button>(edu.uw.ischool.erickuokuo.quizdroid.R.id.finishButton)

        userAnswerTextView.text = "Your answer: $userAnswer"
        correctAnswerTextView.text = "Correct answer: $correctAnswer"
        scoreTextView.text = "You have $correctCount out of $totalCount correct"

//        if (/* Check if it's the last question */) {
//            nextButton.visibility = View.GONE
//            finishButton.visibility = View.VISIBLE
//        }
//
//        nextButton.setOnClickListener {
//            // Navigate to the next question in QuestionActivity.
//        }
//
//        finishButton.setOnClickListener {
//            // Navigate back to the main topic selection page (MainActivity).
//        }
    }
}
