package com.example.helloworldkotlin.viewbinding

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.helloworldkotlin.R
import com.example.helloworldkotlin.databinding.ResultProfileBinding
// https://developer.android.com/topic/libraries/view-binding#setup
class ResultProfile : Fragment() {

    companion object {
        fun newInstance() = ResultProfile()
    }

    private lateinit var viewModel: ResultProfileViewModel

    private lateinit var binding: ResultProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ResultProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.name.text = viewModel.name
        binding.button.setOnClickListener { viewModel.userClicked() }

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.result_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ResultProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}