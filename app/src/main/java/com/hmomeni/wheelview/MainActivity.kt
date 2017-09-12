package com.hmomeni.wheelview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import com.hmomeni.wheellayoutmanager.WheelLayoutManager
import com.hmomeni.wheelview.adapters.SampleAdapter
import com.hmomeni.wheelview.models.Person


class MainActivity : AppCompatActivity() {
	private lateinit var recyclerView: RecyclerView
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		recyclerView = findViewById(R.id.recyclerView)

		val persons: MutableList<Person> = ArrayList()

		persons.add(Person("Irma", "https://randomuser.me/api/portraits/women/9.jpg"))
		persons.add(Person("Katherina", "https://randomuser.me/api/portraits/women/52.jpg"))
		persons.add(Person("Constance", "https://randomuser.me/api/portraits/women/50.jpg"))
		persons.add(Person("Judy", "https://randomuser.me/api/portraits/women/25.jpg"))
		persons.add(Person("Helena", "https://randomuser.me/api/portraits/women/23.jpg"))
		persons.add(Person("Hermione", "https://randomuser.me/api/portraits/women/44.jpg"))
		persons.add(Person("Felicity", "https://randomuser.me/api/portraits/women/30.jpg"))
		persons.add(Person("Joan", "https://randomuser.me/api/portraits/women/31.jpg"))
		persons.add(Person("Clair", "https://randomuser.me/api/portraits/women/34.jpg"))

		val adapter = SampleAdapter(this, persons)

		recyclerView.adapter = adapter
		val wlm = WheelLayoutManager()
		wlm.setTotalColumnCount(3)
		recyclerView.layoutManager = wlm
	}
}
