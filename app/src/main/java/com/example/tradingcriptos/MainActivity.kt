package com.example.tradingcriptos

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.tradingcriptos.components.CriptoButton
import com.example.tradingcriptos.domain.viewmodels.CriptosViewModel
import com.example.tradingcriptos.ui.theme.TradingCriptosTheme
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val vm: CriptosViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TradingCriptosTheme {
                CriptoButton()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
        vm.getCriptos(onSuccess = {
            Timber.v("MainActivity", it.size.toString())
            Toast.makeText(this, it.size.toString(), Toast.LENGTH_SHORT).show()
        },
            onError = {
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
            })
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }
}
