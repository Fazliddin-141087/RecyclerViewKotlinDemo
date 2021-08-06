package uz.mobiller.recyclerviewkotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import uz.mobiller.recyclerviewkotlindemo.adapters.MyRvAdapters
import uz.mobiller.recyclerviewkotlindemo.models.Cinema
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var cinemaList: ArrayList<Cinema>
    lateinit var myRvAdapters: MyRvAdapters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loadCinema()

        myRvAdapters = MyRvAdapters(cinemaList)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = myRvAdapters

    }

    private fun loadCinema() {
        cinemaList = ArrayList()

        cinemaList.add(Cinema(R.drawable.one, "Avengers", 500, "16 Feb 2018"))
        cinemaList.add(Cinema(R.drawable.two, "Avengers Age of Ultron", 400, "17 March 2018"))
        cinemaList.add(Cinema(R.drawable.threee, "Iron Man 3", 550, "17 April 2018"))
        cinemaList.add(Cinema(R.drawable.four, "Avengers: Infinity War", 1500, "15 Jan 2018"))
        cinemaList.add(Cinema(R.drawable.ragnarok, "Thor: Ragnarok", 200, "17 March 2018"))
        cinemaList.add(Cinema(R.drawable.black_panther, "Black Panther", 250, "17 May 2018"))
        cinemaList.add(Cinema(R.drawable.logan, "Logan", 320, "17 Dec 2018"))
    }
}