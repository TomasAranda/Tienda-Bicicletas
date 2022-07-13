package ar.edu.unlam.tiendabicicletas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import ar.edu.unlam.tiendabicicletas.databinding.FragmentProductListBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ProductListFragment : Fragment() {

    private var _binding: FragmentProductListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentProductListBinding.inflate(inflater, container, false)
//        val tv = binding.tituloLista
//        binding.filterButtonBar.findViewById<Button>(R.id.trail_button).setOnClickListener{
//            tv.text = "Trail"
//        }
//        binding.filterButtonBar.findViewById<Button>(R.id.enduro_button).setOnClickListener{
//            tv.text = "Enduro"
//        }
//        binding.filterButtonBar.findViewById<Button>(R.id.xc_button).setOnClickListener{
//            tv.text = "Cross-country"
//        }
//        binding.filterButtonBar.findViewById<Button>(R.id.downhill_button).setOnClickListener{
//            tv.text = "Downhill"
//        }
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //binding.buttonFirst.setOnClickListener {
          //  findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        //}
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}