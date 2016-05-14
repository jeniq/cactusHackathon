package ua.kyiv.mykhailoivanov.ironcontinent.menus.gym_menu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import ua.kyiv.mykhailoivanov.ironcontinent.R;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class GymMenu {

    private Activity activity;
    private LinearLayout gymMenuLay;
    private LinearLayout holeLay;

    public GymMenu(Activity activityIn)
    {
        activity = activityIn;
    }

    public void show()
    {

        holeLay = (LinearLayout) activity.findViewById(R.id.contentMenusID);
        holeLay.removeAllViews();

        gymMenuLay = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.gyms_menu, null);
        holeLay.addView(gymMenuLay);
    }
}
