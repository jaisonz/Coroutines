package com.coroutines.sample.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.coroutines.sample.databinding.RecyclerviewItemBinding
import com.coroutines.sample.model.dataModel.DataModelItem

/**
 * RecyclerViewAdapter class to display the bing the API response list to View
 */
class RecyclerViewAdapter(private var apiResponse: MutableList<DataModelItem>? = null) :
    RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerviewItemBinding.inflate(inflater, parent, false)
        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        if (apiResponse != null && apiResponse!!.size > 0) {
            holder.bind(apiResponse!![position])
        }
    }

    override fun getItemCount(): Int {
        return if (apiResponse != null && apiResponse!!.size > 0) {
            apiResponse!!.size
        } else {
            0
        }
    }

    /**
     * ViewHolder class to map the the list item to the data
     */
    class RecyclerViewHolder(bindingItem: RecyclerviewItemBinding) : RecyclerView.ViewHolder(bindingItem.root) {
        private var binding: RecyclerviewItemBinding? = null

        init {
            binding = bindingItem
        }

        fun bind(rowData: DataModelItem) {
            binding?.datamodel = rowData
            binding?.executePendingBindings()
        }
    }
}