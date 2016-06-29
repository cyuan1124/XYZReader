package com.example.xyzreader;

import android.content.Context;
import android.content.res.Configuration;

/**
 * Created by chenyuan on 6/28/16.
 */
public class Utils {

    public static int getUiMode(Context context) {
        int currentNightMode = context.getResources().getConfiguration().uiMode
                & Configuration.UI_MODE_NIGHT_MASK;
        return currentNightMode;
    }

    public static boolean isNightMode(Context context) {
        return getUiMode(context) == Configuration.UI_MODE_NIGHT_YES;
    }

}
