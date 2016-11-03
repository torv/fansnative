package com.torv.adam.fansnavite;

/**
 * Created by AdamLi on 2016/11/3.
 */

public class Secure {

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("Secure");
    }
}
