package ar.edu.unlam.tiendabicicletas

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import ar.edu.unlam.tiendabicicletas.placeholder.PlaceholderContent.PlaceholderItem
import ar.edu.unlam.tiendabicicletas.databinding.FragmentItemBinding

class MyProductItemRecyclerViewAdapter(
    private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<MyProductItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
//        holder.idView.text = item.id
//        holder.contentView.text = item.content
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.botonComprar.setOnClickListener {
                findNavController(it).navigate(R.id.action_FirstFragment_to_SecondFragment)
            }
        }
        //override fun toString(): String {
          //  return super.toString() + " '" + contentView.text + "'"
        //}
    }

}