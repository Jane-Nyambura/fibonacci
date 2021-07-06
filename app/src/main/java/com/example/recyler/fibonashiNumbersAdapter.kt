package com.example.recyler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class fibonashiNumbersAdapter(var BigInteger: MutableList<BigInteger>): RecyclerView.Adapter<NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var itemView = LayoutInflater.from(parent.context)
           .inflate(R.layout.fibonashi_list_item, parent, false)
        return NumberViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNumbers.text = BigInteger.get(position).toString()

    }

    override fun getItemCount(): Int {
   return BigInteger.size
    }
}
class NumberViewHolder(var itemView:View):RecyclerView.ViewHolder(itemView){
    var tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)
}











//
//class namesrvadapter(var namesList: List<String>) : RecyclerView.Adapter<NamesViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
//        var itemView = LayoutInflater.from(parent.context)
//            .inflate(R.layout.name_list_item, parent, false)
//        return NamesViewHolder(itemView)
//    }
//
//    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
//        holder.tvName.text = namesList.get(position)
//    }
//
//    override fun getItemCount(): Int {
//        return namesList.size
//    }
//}
//
//class NamesViewHolder(var itemView: View) : RecyclerView.ViewHolder(itemView) {
//    var tvName = itemView.findViewById<TextView>(R.id.tvName)
//}
