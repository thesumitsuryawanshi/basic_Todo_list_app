package com.example.fundamentals

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val currenttask = mutableListOf(
            todoData("are you done with the task list app", false),
            todoData("you added colors to the Tasklist app", false),
            todoData("call your Mom", false),
            todoData("feed the dog", false),
            todoData("go for a walk ", false),
        )

        val adapter = rvAdapter(currenttask)
        myRV.adapter = adapter

        btnAddTask.setOnClickListener {
            val newTask = et_newTask.text.toString()
            val newtodo = todoData(newTask, false)
            currenttask.add(newtodo)
            adapter.notifyItemInserted(currenttask.size - 1)
        }
    }
}