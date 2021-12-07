package first.le56sn.siriussport

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainPageFragment : Fragment() {


    lateinit var fonImageView: ImageView
    lateinit var informationTextView: TextView
    lateinit var visitSiteButton: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main_page, container, false)

        fonImageView=view.findViewById(R.id.fon_image_view)
        informationTextView=view.findViewById(R.id.information_text)
        visitSiteButton=view.findViewById(R.id.visit_site_button)

        visitSiteButton.setOnClickListener(){
            val sitelink = Uri.parse("https://siriusnsk.ru")
            val openBrowserIntent= Intent(Intent.ACTION_VIEW,sitelink)
            startActivity(openBrowserIntent)
        }




        return view
    }


}