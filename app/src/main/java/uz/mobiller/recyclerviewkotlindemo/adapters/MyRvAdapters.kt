package uz.mobiller.recyclerviewkotlindemo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_cinema.view.*
import uz.mobiller.recyclerviewkotlindemo.R
import uz.mobiller.recyclerviewkotlindemo.models.Cinema

class MyRvAdapters(var cinemaList: List<Cinema>) :
    RecyclerView.Adapter<MyRvAdapters.MyViewHolder>() {

    inner class MyViewHolder(var itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(cinema: Cinema) {
            itemView.action_image.setImageResource(cinema.picture!!)
            itemView.name.text = cinema.name
            itemView.views.text = cinema.views.toString()
            itemView.data.text = cinema.data
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_cinema, parent, false)
        val myViewHolder = MyViewHolder(itemView)
        return myViewHolder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val cinema = cinemaList[position]
        holder.onBind(cinema)
    }

    override fun getItemCount(): Int {
        return cinemaList.size
    }

}