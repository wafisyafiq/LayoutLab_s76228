package com.example.layoutlab_s76228

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(
    private val studentList: List<Student>
) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    class StudentViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val name: TextView = itemView.findViewById(R.id.tvStudentName)
        val studentId: TextView = itemView.findViewById(R.id.tvStudentId)
        val course: TextView = itemView.findViewById(R.id.tvStudentCourse)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StudentViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_student, parent, false)

        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: StudentViewHolder,
        position: Int
    ) {
        val student = studentList[position]

        holder.name.text = student.name
        holder.studentId.text = student.studentId
        holder.course.text = student.course
    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}