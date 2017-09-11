package com.hmomeni.wheelview.viewholders

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.hmomeni.wheelview.R
import com.hmomeni.wheelview.models.Person

/**
 * Created by hamed on 9/11/17.
 */
class SampleItemHolder(private val mContext: Context, itemView: View?) : RecyclerView.ViewHolder(itemView) {
	private var imageView: ImageView = itemView!!.findViewById(R.id.imageView)

	fun bindView(person: Person) {
		Glide.with(mContext).load(person.photo).into(imageView)
	}
}