package com.gerinda.apps.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gerinda.apps.R
import com.gerinda.apps.data.Evaluasi

class EvaluasiAdapter : RecyclerView.Adapter<EvaluasiAdapter.EvaluasiHolder>() {
    private var listGetEvaluasi: MutableList<Evaluasi> = ArrayList()


    fun replaceAll(items: MutableList<Evaluasi>) {
        listGetEvaluasi.clear()
        listGetEvaluasi = items
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): EvaluasiHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_rv_evaluasi, viewGroup, false)
        return EvaluasiHolder(view)
    }

    override fun onBindViewHolder(holder: EvaluasiHolder, position: Int) {
        holder.bind(listGetEvaluasi[position], position)
    }

    override fun getItemCount(): Int {
        return listGetEvaluasi.size
    }

    inner class EvaluasiHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var evaluasi: TextView = itemView.findViewById(R.id.txtEvaluasi)
        private val nomer: TextView = itemView.findViewById(R.id.txtNumber)
        fun bind(item: Evaluasi, number: Int) {
            evaluasi.text = item.evaluasi
            nomer.text = "${number + 1} ."
        }
    }

}