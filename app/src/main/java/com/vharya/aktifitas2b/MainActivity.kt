package com.vharya.aktifitas2b

import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val titles = arrayListOf(
        "Ghost of Tsushima", "Cyberpunk 2077", "Far Cry 4",
        "The Witcher 3", "Red Dead Redemption 2", "Blood Borne",
        "Elden Ring", "Assassin's Creed Revalation", "The Witcher 3",
        "Far Cry 4", "Ghost of Tsushima"
    )

    private val images = arrayListOf(
        R.drawable.c1, R.drawable.c2, R.drawable.c3,
        R.drawable.c4, R.drawable.c5, R.drawable.c6,
        R.drawable.c7, R.drawable.c8, R.drawable.c4,
        R.drawable.c3, R.drawable.c1
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val gridView = findViewById<GridView>(R.id.gridview)

        gridView.adapter = GridAdapter(this, titles, images)
    }
}