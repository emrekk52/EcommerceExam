package com.ecommerce.exam.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.ecommerce.exam.activitys.DetailActivity
import com.ecommerce.exam.adapters.ProductAdapter
import com.ecommerce.exam.constant.Constant.Companion.productList
import com.ecommerce.exam.constant.Constant.Companion.subTotal
import com.ecommerce.exam.databinding.FragmentItemProductBinding
import com.ecommerce.exam.models.Product
import java.io.Serializable


class ProductItemFragment(val categoryId: Int) : Fragment() {

    private var _binding: FragmentItemProductBinding? = null

    private val binding get() = _binding!!
    lateinit var list: List<Product>


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        list = productList.filter { it.categoryId == categoryId }
        val adapter = ProductAdapter(
            context = requireContext(),
            list = list,
            onClickItem = ::onClickItem,
            addButtonClickItem = ::addButtonClickItem
        )

        binding.recycler.adapter = adapter

        binding.recycler.layoutManager =
            GridLayoutManager(requireContext(), 4)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentItemProductBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun onClickItem(position: Int) {

        val intent = Intent(requireActivity(), DetailActivity::class.java)
        intent.putExtra("product", list[position] as Serializable)
        startActivity(intent)

    }


    private fun addButtonClickItem(price: Double) {
        subTotal.value = subTotal.value?.plus(price)

    }


}