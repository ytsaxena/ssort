package android.pass.sort

import android.os.Bundle
import android.pass.sort.databinding.ActivityTextViewBinding
import androidx.appcompat.app.AppCompatActivity

class TextViewActivity : AppCompatActivity() {

    lateinit var binding : ActivityTextViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTextViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val slist = intent.getStringArrayListExtra("SORTEDLIST")

        if (slist != null) {
            binding.sortednumTextView.text = slist.joinToString(",")
        }

    }
}