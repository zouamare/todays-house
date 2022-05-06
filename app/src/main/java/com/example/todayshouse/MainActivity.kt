package com.example.todayshouse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.todayshouse.Fragment.HomeFragment
import com.example.todayshouse.Fragment.InteriorFragment
import com.example.todayshouse.Fragment.MyPageFragment
import com.example.todayshouse.Fragment.StoreFragment
import com.example.todayshouse.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragment_home = HomeFragment()
        val fragment_store = StoreFragment()
        val fragment_interior = InteriorFragment()
        val fragement_my_page = MyPageFragment()

        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.add(R.id.fragmentContainerView, fragment_home)
        fragmentTransaction.commit()

        binding.tabLayout.getTabAt(0)?.setIcon(R.drawable.home_black)
        binding.tabLayout.getTabAt(1)?.setIcon(R.drawable.store_white)
        binding.tabLayout.getTabAt(2)?.setIcon(R.drawable.interior_white)
        binding.tabLayout.getTabAt(3)?.setIcon(R.drawable.my_page_white)
        binding.tabLayout.getTabAt(4)?.setIcon(R.drawable.plus)


        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab!!.position) {
                    0 -> {
                        val homeTransaction: FragmentTransaction =
                            fragmentManager.beginTransaction()
                        homeTransaction.replace(R.id.fragmentContainerView, fragment_home)
                            .commitAllowingStateLoss()

                        binding.tabLayout.getTabAt(0)?.setIcon(R.drawable.home_black)
                        binding.tabLayout.getTabAt(1)?.setIcon(R.drawable.store_white)
                        binding.tabLayout.getTabAt(2)?.setIcon(R.drawable.interior_white)
                        binding.tabLayout.getTabAt(3)?.setIcon(R.drawable.my_page_white)
                    }

                    1 -> {
                        val storeTransaction: FragmentTransaction =
                            fragmentManager.beginTransaction()
                        storeTransaction.replace(R.id.fragmentContainerView, fragment_store)
                            .commitAllowingStateLoss()

                        binding.tabLayout.getTabAt(0)?.setIcon(R.drawable.home_white)
                        binding.tabLayout.getTabAt(1)?.setIcon(R.drawable.store_black)
                        binding.tabLayout.getTabAt(2)?.setIcon(R.drawable.interior_white)
                        binding.tabLayout.getTabAt(3)?.setIcon(R.drawable.my_page_white)
                    }

                    2 -> {
                        val interiorTransaction: FragmentTransaction =
                            fragmentManager.beginTransaction()
                        interiorTransaction.replace(R.id.fragmentContainerView, fragment_interior)
                            .commitAllowingStateLoss()

                        binding.tabLayout.getTabAt(0)?.setIcon(R.drawable.home_white)
                        binding.tabLayout.getTabAt(1)?.setIcon(R.drawable.store_white)
                        binding.tabLayout.getTabAt(2)?.setIcon(R.drawable.interior_black)
                        binding.tabLayout.getTabAt(3)?.setIcon(R.drawable.my_page_white)
                    }

                    3 -> {
                        val myPageTransaction: FragmentTransaction =
                            fragmentManager.beginTransaction()
                        myPageTransaction.replace(R.id.fragmentContainerView, fragement_my_page)
                            .commitAllowingStateLoss()

                        binding.tabLayout.getTabAt(0)?.setIcon(R.drawable.home_white)
                        binding.tabLayout.getTabAt(1)?.setIcon(R.drawable.store_white)
                        binding.tabLayout.getTabAt(2)?.setIcon(R.drawable.interior_white)
                        binding.tabLayout.getTabAt(3)?.setIcon(R.drawable.my_page_black)
                    }

                    4 -> {
                        //버튼 돌아가는 액션
                        //bottom navigation view 실행
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })

    }
}