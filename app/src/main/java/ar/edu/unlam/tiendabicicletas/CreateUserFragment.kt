package ar.edu.unlam.tiendabicicletas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.findNavController

import com.google.android.material.datepicker.MaterialDatePicker
import java.text.SimpleDateFormat
import java.util.*

class CreateUserFragment : Fragment() {

    private var _binding: ar.edu.unlam.tiendabicicletas.databinding.FragmentCreateUserBinding? = null
    private val binding get() = _binding!!
    private val map = mutableMapOf<String, Int>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ar.edu.unlam.tiendabicicletas.databinding.FragmentCreateUserBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setProvinces()
        activity?.actionBar?.hide()
        binding.inputFecha.setOnClickListener {
            picker()
        }
        binding.viewFecha.setOnClickListener {
            picker()
        }
        binding.btnRegistrar.setOnClickListener{
            findNavController().navigate(R.id.action_createUserFragment_to_FirstFragment)
        }
    }

    private fun setProvinces() {
        val items = resources.getStringArray(R.array.provinces)
        val adapter = ArrayAdapter(requireContext(), R.layout.list_item, items)
        binding.autoComplete.setAdapter(adapter)
    }

    private fun picker() {
        val datePicker = DatePickerFragment { day, month, year -> onDateSelected(day, month, year) }
        datePicker.show(parentFragmentManager, "datePicker")
    }
    private fun onDateSelected(day: Int, month: Int, year: Int) {
        binding.inputFecha.editText?.setText("$day - $month - $year")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

    }
}