package com.example.hello_world

import io.flutter.app.FlutterApplication;
import com.applivery.applvsdklib.Applivery

class AppliveryApplication : FlutterApplication() {

    override fun onCreate() {
        super.onCreate()
        
        println("before call")
        Applivery.init(this, "cj9b5UaVGdK-SLxIQ3lIZGHC", false)
        println("after call")
    }

}