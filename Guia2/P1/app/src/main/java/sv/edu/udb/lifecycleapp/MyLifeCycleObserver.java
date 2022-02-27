package sv.edu.udb.lifecycleapp;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnlifecycleEvent;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyLifeCycleObserver implements LifecycleObserver {

    private static final String TAG = "MyLifeCycleObserver";
    private MainActivity obj;

    public MyLifeCycleObserver(MainActivity mainActivity){
        this.obj = mainActivity;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE) void onCreated(){
        log.i(TAG, "OnCreate");
        Toast.makeText(this.obj,  "OnCreate", Toast.LENGTH_SHORT).show();
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_START) void onStart(){
        log.i(TAG, "OnStart");
        Toast.makeText(this.obj, "OnStart", Toast.LENGTH_SHORT).show();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME) void onResume(){
        log.i(TAG, "OnResume");
        Toast.makeText(this.obj, "OnResume", Toast.LENGTH_SHORT).show();
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_STOP) void onStop(){
        log.i(TAG,  "OnStop");
        Toast.makeText(this.obj, "OnStop", Toast.LENGTH_SHORT).show();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY) void onDestroy(){
        log.i(TAG,"OnDestroy");
        Toast.makeText(this.obj, "OnDestroy", Toast.LENGTH_SHORT).show();
    }




}
