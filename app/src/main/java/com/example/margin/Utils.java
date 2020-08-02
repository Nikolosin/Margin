package com.example.margin;

import android.app.Activity;
import android.content.Intent;

public class Utils
{
    private static int sTheme;

    public final static int THEME_DEF = 0;
    public final static int THEME_GREEN = 1;
    public final static int THEME_BLACK = 2;
    public final static int THEME_BLUE = 3;

    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));

    }

    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            default:
            case THEME_DEF:
                activity.setTheme(R.style.AppTheme);
                break;
            case THEME_GREEN:
                activity.setTheme(R.style.Margin1);
                break;
            case THEME_BLACK:
                activity.setTheme(R.style.Margin2);
                break;
            case THEME_BLUE:
                activity.setTheme(R.style.Margin3);
                break;
        }
    }
}