package com.example.tradingcriptos

import android.app.Application
import dagger.hilt.android.HiltAndroidApp // permite injectar dependencias

@HiltAndroidApp
class BaseApplication: Application() {
}