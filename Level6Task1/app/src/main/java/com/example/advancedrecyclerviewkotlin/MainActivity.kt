package com.example.advancedrecyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.advancedrecyclerviewkotlin.model.ColorItem
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private val colors = arrayListOf<ColorItem>()
    private val colorAdapter = ColorAdapter(colors, { colorItem -> onColorClick(colorItem) })
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar(toolbar)
        initViews()
    }

    private fun initViews() {
        rvColors.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rvColors.adapter = colorAdapter
    }

    private fun onColorClick(colorItem: ColorItem) {
        Snackbar.make(rvColors, "This color is: ${colorItem.name}", Snackbar.LENGTH_LONG).show()
    }

}
