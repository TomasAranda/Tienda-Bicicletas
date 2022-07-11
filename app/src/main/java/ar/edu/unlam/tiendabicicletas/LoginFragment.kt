package ar.edu.unlam.tiendabicicletas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ar.edu.unlam.tiendabicicletas.databinding.FragmentLoginBinding
import ar.edu.unlam.tiendabicicletas.databinding.FragmentProductDetailBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.actionBar?.hide()
        binding.btnRegistrar.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_createUserFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

    }
}