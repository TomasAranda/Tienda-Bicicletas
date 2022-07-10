package ar.edu.unlam.tiendabicicletas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ar.edu.unlam.tiendabicicletas.databinding.FragmentCreateUserBinding
import ar.edu.unlam.tiendabicicletas.databinding.FragmentLoginBinding
import com.google.android.material.datepicker.MaterialDatePicker

class CreateUserFragment : Fragment() {

    private var _binding: FragmentCreateUserBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreateUserBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnRegistrar.setOnClickListener{
            findNavController().navigate(R.id.action_createUserFragment_to_FirstFragment)
        }
        /*val datePicker =
            MaterialDatePicker.Builder.datePicker()
                .setTitleText("Select date")
                .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                .build()*/
        /*binding.inputFecha.setOnClickListener {
            //datePicker.show()
        }*/



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

    }
}