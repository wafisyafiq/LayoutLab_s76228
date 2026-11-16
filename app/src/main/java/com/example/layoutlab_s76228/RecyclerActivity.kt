package com.example.layoutlab_s76228

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.layoutlab_s76228.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {

    private lateinit var studentAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val recyclerView = findViewById<androidx.recyclerview.widget.RecyclerView>(
            R.id.recyclerViewStudents
        )

        val btnList = findViewById<android.widget.Button>(R.id.btnList)
        val btnGrid = findViewById<android.widget.Button>(R.id.btnGrid)

        val students = (1..50).map { number ->
            Student(
                name = "Student $number",
                studentId = "STU%03d".format(number),
                course = "Computer Science"
            )
        }

        studentAdapter = StudentAdapter(students)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = studentAdapter

        btnList.setOnClickListener {
            recyclerView.layoutManager = LinearLayoutManager(this)
        }

        btnGrid.setOnClickListener {
            recyclerView.layoutManager = GridLayoutManager(this, 2)
        }
    }
}

