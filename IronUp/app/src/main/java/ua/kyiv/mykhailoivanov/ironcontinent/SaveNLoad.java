package ua.kyiv.mykhailoivanov.ironcontinent;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class SaveNLoad {

    public static final String APP_PREFERENCES = "my_settings";

    public static Activity activity;

    public static SharedPreferences mSettings;
    public static SharedPreferences.Editor editor;

    public static final String brsave = "1000";

    public static int getGymNumber()
    {
        mSettings = activity.getSharedPreferences("GYM_NUMBER", activity.MODE_PRIVATE);

        return mSettings.getInt("GYM_NUMBER", 0);
    }

    public static String getGymName(int id)
    {
        mSettings = activity.getSharedPreferences(Integer.toString(id), activity.MODE_PRIVATE);

        return mSettings.getString(Integer.toString(id), null);
    }
    public static int num;
    public static void saveGym(String name)
    {
        mSettings = activity.getSharedPreferences("GYM_NUMBER", activity.MODE_PRIVATE);

        if (mSettings.contains("GYM_NUMBER"))
        {
             num = mSettings.getInt("GYM_NUMBER", 0);
            num++;
            editor = mSettings.edit();
            editor.putInt("GYM_NUMBER", num);
            editor.apply();

            mSettings = activity.getSharedPreferences(Integer.toString(num), activity.MODE_PRIVATE);
            editor = mSettings.edit();
            editor.putString(Integer.toString(num), name);
            editor.apply();
        }
        else
        {
            num = 1;
            editor = mSettings.edit();
            editor.putInt("GYM_NUMBER", num);
            editor.apply();

            mSettings = activity.getSharedPreferences(Integer.toString(num), activity.MODE_PRIVATE);
            editor = mSettings.edit();
            editor.putString(Integer.toString(num), name);
            editor.apply();
        }
    }
}
