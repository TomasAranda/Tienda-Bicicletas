package ar.edu.unlam.tiendabicicletas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ar.edu.unlam.tiendabicicletas.databinding.FragmentProductDetailBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ProductDetailFragment : Fragment() {

    private var _binding: FragmentProductDetailBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentProductDetailBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.actionBar?.hide()
        binding.buttonSecond.setOnClickListener {
            /*if(user.isLog()){
                ConfirmBuyFragment(/*itemBuy*/).show(childFragmentManager, ConfirmBuyFragment.TAG)
            }else{*/
                findNavController().navigate(R.id.action_SecondFragment_to_loginFragment)
            //}
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}