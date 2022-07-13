package ar.edu.unlam.tiendabicicletas

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import ar.edu.unlam.tiendabicicletas.databinding.FragmentConfirmBuyBinding

class ConfirmBuyFragment (/*val compra: Compra*/): DialogFragment() {

    private var _binding: FragmentConfirmBuyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        _binding = FragmentConfirmBuyBinding.inflate(LayoutInflater.from(context))
        return AlertDialog.Builder(requireActivity())
            .setView(binding.root)
            .create()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    companion object {
        const val TAG = "ConfirmationDialog"
    }
}
