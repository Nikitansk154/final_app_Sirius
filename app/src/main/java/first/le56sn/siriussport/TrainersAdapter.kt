package first.le56sn.siriussport

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TrainersAdapter(private val trainersNames: List<String>) :
    RecyclerView.Adapter<TrainersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainersViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.trainers_list_item, parent, false)
        return TrainersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TrainersViewHolder, position: Int) {
        val name = trainersNames[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return trainersNames.size
    }
}