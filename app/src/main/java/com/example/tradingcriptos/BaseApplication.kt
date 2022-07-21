package com.example.tradingcriptos

import android.app.Application
import com.example.tradingcriptos.utils.ReleaseTree
import dagger.hilt.android.HiltAndroidApp // permite injectar dependencias
import timber.log.Timber

@HiltAndroidApp
class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
            if (BuildConfig.DEBUG)
                Timber.plant(Timber.DebugTree())
            else
                Timber.plant(ReleaseTree())
    }
}
