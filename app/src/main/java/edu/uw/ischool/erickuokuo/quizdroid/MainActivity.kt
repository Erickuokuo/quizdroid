package edu.uw.ischool.erickuokuo.quizdroid

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

// MainActivity.kt
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(edu.uw.ischool.erickuokuo.quizdroid.R.layout.activity_main)

        val topics = listOf("Math", "Physics", "Marvel Super Heroes")

        val topicListView = findViewById<ListView>(edu.uw.ischool.erickuokuo.quizdroid.R.id.topicListView)
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, topics)
        topicListView.adapter = adapter

        topicListView.setOnItemClickListener { _, _, position, _ ->
            val selectedTopic = topics[position]
            val intent = Intent(this, TopicOverviewActivity::class.java)
            intent.putExtra("topic", selectedTopic)
            startActivity(intent)
        }
    }
}