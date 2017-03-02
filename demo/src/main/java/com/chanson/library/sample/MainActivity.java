package com.chanson.library.sample;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

/**
 * Created by Administrator on 2017/3/2 0002.
 */

public class MainActivity extends Activity {

    
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.main);
    }
}
