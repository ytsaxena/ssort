package android.pass.sort

import android.R
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.pass.sort.databinding.ActivityMainBinding as ActivityMainBinding1


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding1.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn.setOnClickListener {
            val nums = binding.edNumber.text.toString().trim()

            val inputNumber: List<String> = nums.split(",")

            var slist: ArrayList<String> = ArrayList()
            slist.addAll(inputNumber.sortedBy { it.toLong() })
            //   Log.d("checksarray", "" + slist)

            //pass arraylist
            val intent = Intent(this, TextViewActivity::class.java)
            intent.putStringArrayListExtra("SORTEDLIST", slist)
            startActivity(intent)

        }


    }
}





