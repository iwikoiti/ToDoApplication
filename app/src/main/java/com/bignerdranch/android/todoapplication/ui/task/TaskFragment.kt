package com.bignerdranch.android.todoapplication.ui.task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bignerdranch.android.todoapp.R
import com.bignerdranch.android.todoapp.databinding.FragmentTaskBinding
import com.bignerdranch.android.todoapplication.viewmodel.TaskViewModel

class TaskFragment : Fragment() {

    private val viewModel: TaskViewModel by viewModels()
    //private lateinit var adapter: TaskAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTaskBinding.inflate(inflater)

//        binding.lifecycleOwner = this
//        binding.viewModel = viewModel
        //adapter = TaskAdapter()

//        viewModel.getAllTasks.observe(viewLifecycleOwner){
//            adapter.submitList(it)
//        }

        binding.apply {

            //binding.recyclerView.adapter = adapter

            floatingActionButton.setOnClickListener{
                findNavController().navigate(R.id.action_taskFragment_to_addFragment)
            }
        }
        return binding.root
    }


}