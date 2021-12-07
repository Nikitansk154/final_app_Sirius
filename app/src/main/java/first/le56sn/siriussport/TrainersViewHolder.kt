package first.le56sn.siriussport

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TrainersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val trainersNameTextView: TextView = itemView.findViewById(R.id.trainers_name_text_view)


    fun bind(name:String){
        trainersNameTextView.text=name

    }



}