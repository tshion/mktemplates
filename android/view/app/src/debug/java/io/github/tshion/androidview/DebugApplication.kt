package io.github.tshion.androidview

import android.os.StrictMode
import timber.log.Timber

class DebugApplication : MainApplication() {

    override fun onCreate() {
        StrictMode.setThreadPolicy(
            StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .penaltyFlashScreen()
                .build(),
        )
        StrictMode.setVmPolicy(
            StrictMode.VmPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build(),
        )
        Timber.plant(Timber.DebugTree())
        super.onCreate()
    }
}
