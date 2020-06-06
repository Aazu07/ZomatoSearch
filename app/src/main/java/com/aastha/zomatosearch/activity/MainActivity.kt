package com.aastha.zomatosearch.activity

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.TextUtils
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.aastha.zomatosearch.R
import com.aastha.zomatosearch.adapter.RestaurantAdapter
import com.aastha.zomatosearch.databinding.ActivityMainBinding
import com.aastha.zomatosearch.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private var handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        viewModel.searchResults.observe(this, Observer {
            it ?: return@Observer
            binding.restaurantList.adapter = RestaurantAdapter(this, it)
        })

        viewModel.isLoading.observe(this, Observer {
            it ?: return@Observer
            if (it) {
                binding.progressBar.visibility = View.VISIBLE
                binding.errorMessage.visibility = View.GONE
            } else {
                binding.progressBar.visibility = View.GONE
            }
        })

        viewModel.errorMessage.observe(this, Observer {
            if (TextUtils.isEmpty(it)) {
                binding.errorMessage.visibility = View.GONE
            } else {
                binding.errorMessage.visibility = View.VISIBLE
                binding.errorMessage.text = it
            }
        })

        binding.searchBox.doAfterTextChanged {
            handler.removeCallbacksAndMessages(null)
            if (!TextUtils.isEmpty(it.toString())) {
                handler.postDelayed({
                    viewModel.getSearchData(it.toString().replace(" ", "%20"))
                }, 500)
            }
        }
        //Initial Search so that page is not empty on Startup
        viewModel.getSearchData("+")
    }

    override fun onStop() {
        super.onStop()
        handler.removeCallbacksAndMessages(null)
    }


}
