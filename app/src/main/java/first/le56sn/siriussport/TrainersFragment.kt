package first.le56sn.siriussport

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class TrainersFragment : Fragment() {

    lateinit var trainersRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_trainers, container, false)


        val trainersNames:List<String> = listOf("Лариса", "Егор Аксенов", "Валентина")

        trainersRecyclerView = view.findViewById(R.id.trainers_recycler_view)
        trainersRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        trainersRecyclerView.adapter=TrainersAdapter(trainersNames)


        return view

    }


}