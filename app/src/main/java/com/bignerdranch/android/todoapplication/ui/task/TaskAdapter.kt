package com.bignerdranch.android.todoapplication.ui.task

//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.DiffUtil
//import androidx.recyclerview.widget.ListAdapter
//import androidx.recyclerview.widget.RecyclerView
//import com.bignerdranch.android.todoapp.databinding.RowLayoutBinding
//import com.bignerdranch.android.todoapplication.database.Task
//
//class TaskAdapter: ListAdapter<Task, TaskAdapter.ViewHolder>(TaskDiffCallback) {
//
//    companion object TaskDiffCallback: DiffUtil.ItemCallback<Task>() {
//        override fun areItemsTheSame(oldItem: Task, newItem: Task) = oldItem.id == newItem.id
//        override fun areContentsTheSame(oldItem: Task, newItem: Task) = oldItem == newItem
//    }
//
//    class ViewHolder(val binding: RowLayoutBinding): RecyclerView.ViewHolder(binding.root){
//        fun bind(task: Task){
//            binding.task = task
//            binding.executePendingBindings()
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        return ViewHolder(RowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val current = getItem(position)
//        holder.bind(current)
//    }
//}