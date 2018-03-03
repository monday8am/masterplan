package com.monday8am.masterplan

import android.app.Application
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric


class MasterplanApplication: Application() {

    override fun onTerminate() {
        super.onTerminate()
    }

    override fun onCreate() {
        super.onCreate()
        Fabric.with(this, Crashlytics())

    }
}
