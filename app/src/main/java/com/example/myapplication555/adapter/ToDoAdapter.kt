package com.example.myapplication555.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication111.enums.Priorities
import com.example.myapplication555.R
import com.example.myapplication555.model.ToDo
import kotlinx.android.synthetic.main.item_todo_recyclerview.view.*

class ToDoAdapter(private val listOfToDos: MutableList<ToDo>
) : RecyclerView.Adapter<>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ??? {

    }

    override fun onBindViewHolder(holder: ???, position: Int) {

    }

    override fun getItemCount(): Int {

    }


}

inner class ToDoHolder(private val view: View):RecyclerView.ViewHolder(view), View.OnClickListener
{
    init{
        view.setOnClickListener(this)
    }
    fun bindToDo(toDo :ToDo){
        view.tv_title.text = toDo.title
        view.tv_dueDate.text = toDo.dueDate
        view.tv_description.text = toDo.description
        when(toDo.priority){
            Priorities.LOW -> view.iv_priority.setBackgroundResource(R.drawable.prio_green)
            Priorities.MEDIUM -> view.iv_priority.setBackgroundResource(R.drawable.prio_orange)
            Priorities.HIGH -> view.iv_priority.setBackgroundResource(R.drawable.prio_red)
        }
    }


    override fun onClick(v: View?) {

    }

}