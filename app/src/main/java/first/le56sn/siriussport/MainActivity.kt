package first.le56sn.siriussport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


private const val LAST_SELECTED_ITEM="item"
class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bottomNavigationView = findViewById(R.id.bottom_navigation_menu)
        bottomNavigationView.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.main_page -> {
                    fragment = MainPageFragment()
                }
                R.id.trainers_page -> {
                    fragment = TrainersFragment()
                }
                R.id.info_page -> {
                    fragment = InfoFragment()
                }
            }
            replaceFragment(fragment!!)
            true
        }
bottomNavigationView.selectedItemId= savedInstanceState?.getInt(
    LAST_SELECTED_ITEM) ?: R.id.main_page

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_SELECTED_ITEM,bottomNavigationView.selectedItemId)
    }
   private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(fragment.tag)
            .commit()


    }
}