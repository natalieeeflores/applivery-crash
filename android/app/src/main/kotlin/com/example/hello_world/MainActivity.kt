package com.example.hello_world

import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant
import com.applivery.applvsdklib.Applivery
import io.flutter.plugin.common.MethodChannel


class MainActivity: FlutterActivity() {
    private val CHANNEL = "applivery"
    
    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine);

        MethodChannel(flutterEngine.getDartExecutor(), CHANNEL).setMethodCallHandler { call, result ->
        // Note: this method is invoked on the main thread.
        // TODO
            if (call.method.equals("checkForUpdate")) {
                Applivery.checkForUpdates()
            }
        }
    }
}
