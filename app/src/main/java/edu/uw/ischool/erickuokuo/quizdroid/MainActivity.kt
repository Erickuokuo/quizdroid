package edu.uw.ischool.erickuokuo.quizdroid

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

// MainActivity.kt


class MainActivity : AppCompatActivity() {
    private lateinit var topicListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        topicListView = findViewById(R.id.topicListView)

        // Define a list of topics (hard-coded for this example).
        val topics = arrayOf("Math", "Physics", "Marvel Super Heroes")

        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, topics)
        topicListView.adapter = adapter

        topicListView.setOnItemClickListener { parent, view, position, id ->
            // Start the Topic Overview activity for the selected topic.
            val selectedTopic = topics[position]
            val intent = Intent(this, TopicOverviewActivity::class.java)
            intent.putExtra("topic", selectedTopic)
            startActivity(intent)
        }
    }
}
