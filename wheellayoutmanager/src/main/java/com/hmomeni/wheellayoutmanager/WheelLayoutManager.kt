package com.hmomeni.wheellayoutmanager

import android.support.v7.widget.RecyclerView

/**
 * Created by hamed on 9/11/17.
 */
class WheelLayoutManager : RecyclerView.LayoutManager() {
	override fun generateDefaultLayoutParams(): RecyclerView.LayoutParams {
		return RecyclerView.LayoutParams(
				RecyclerView.LayoutParams.WRAP_CONTENT,
				RecyclerView.LayoutParams.WRAP_CONTENT)
	}
}