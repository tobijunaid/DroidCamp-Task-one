package com.example.tobijunaid.gunsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class recyclerViewAdapter(private val context: Context, private val userList: ArrayList<userDataModel>, var itemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<recyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var user:userDataModel = userList[position]
        holder.setData(user, position)
        holder.bind(user, itemClickListener)
        //holder.title.text = user.title
        //holder.desc.text = user.desc

    }

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item){

        var currentTitle:userDataModel? = null
        var currentPosition: Int = 0


       // var title:TextView = item.findViewById(R.id.tvTitle)
        //var desc:TextView = item.findViewById(R.id.tvDesc)

        fun setData(data:userDataModel, position: Int) {
            data?.let {
                itemView.tvTitle.text = data.title
                itemView.tvDesc.text = data.desc
                itemView.profile_image.id = data.img

            }
            this.currentTitle = data
            this.currentPosition = position
        }

        fun bind(user: userDataModel, clickListener : OnItemClickListener){
             currentTitle?.title = user.title

            itemView.setOnClickListener {
                clickListener.onItemClick(user)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(user:userDataModel)
    }
}