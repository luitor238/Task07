package com.example.task07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TableLayout

class GridLayout : AppCompatActivity() {

    private lateinit var bntVolver : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)

        bntVolver = findViewById(R.id.btnVolver)

        bntVolver.setOnClickListener {
            val intent = Intent(this@GridLayout, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var x = false
        when (item.itemId) {
            R.id.action_linearLayout -> {
                val intent = Intent(this@GridLayout, LinearLayout::class.java)
                x = true
                startActivity(intent)
            }

            R.id.action_tableLayout -> {
                val intent = Intent(this@GridLayout, TableLayout::class.java)
                x = true
                startActivity(intent)
            }

            R.id.action_relativeLayout -> {
                val intent = Intent(this@GridLayout, RelativeLayout::class.java)
                x = true
                startActivity(intent)
            }
            else -> super.onOptionsItemSelected(item)
        }
        return x
    }
}