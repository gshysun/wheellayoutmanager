package com.hmomeni.wheelview.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.hmomeni.wheelview.R
import com.hmomeni.wheelview.models.Person
import com.hmomeni.wheelview.viewholders.SampleItemHolder

/**
 * Created by hamed on 9/11/17.
 */
class SampleAdapter(private val mContext: Context, private val persons: List<Person>) : RecyclerView.Adapter<SampleItemHolder>() {

	override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): SampleItemHolder = SampleItemHolder(mContext, LayoutInflater.from(mContext).inflate(R.layout.rcl_item_person, parent, false))

	override fun onBindViewHolder(holder: SampleItemHolder?, position: Int) {
		holder!!.bindView(persons[position])
	}

	override fun getItemCount(): Int = persons.size

}