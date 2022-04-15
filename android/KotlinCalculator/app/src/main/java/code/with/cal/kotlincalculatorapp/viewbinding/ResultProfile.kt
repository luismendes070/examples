package code.with.cal.kotlincalculatorapp.viewbinding

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import code.with.cal.kotlincalculatorapp.R

class ResultProfile : Fragment() {

    companion object {
        fun newInstance() = ResultProfile()
    }

    private lateinit var viewModel: ResultProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.result_profile_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ResultProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}