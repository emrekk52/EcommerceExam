package com.ecommerce.exam.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ecommerce.exam.constant.Constant.Companion.categoryList
import com.ecommerce.exam.fragments.ProductItemFragment


class TabPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount() = categoryList.size

    override fun createFragment(position: Int): Fragment {
        return ProductItemFragment(position)
    }


}