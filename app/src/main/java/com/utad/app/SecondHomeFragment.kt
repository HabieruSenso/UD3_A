package com.utad.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView

class SecondHomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var bottom_navigation = view.findViewById<BottomNavigationView>(R.id.bottom_navigation_view)

        bottom_navigation.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.page_1 -> {
                    goToFragment(HomeFragment())
                    true
                }
                R.id.page_2 -> {
                    goToFragment(FavouriteFragment())
                    true
                }
                R.id.page_3 -> {
                    goToFragment(UploadFragment())
                    true
                }
                R.id.page_4 -> {
                    goToFragment(YouFragment())
                    true
                }
                else -> false
            }
        }
        bottom_navigation.selectedItemId = R.id.page_1
        //fin botoners
    }
    fun goToFragment(fragment: Fragment) {
        activity?.let{
            it.supportFragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
        }
    }

}