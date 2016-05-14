package ua.kyiv.mykhailoivanov.ironcontinent.menus.statistics_menu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import ua.kyiv.mykhailoivanov.ironcontinent.R;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class StatisticsMenu {
    private Activity activity;
    private LinearLayout statisticsMenuLay;
    private LinearLayout holeLay;

    public StatisticsMenu(Activity activityIn)
    {
        activity = activityIn;
    }

    public void show()
    {

        holeLay = (LinearLayout) activity.findViewById(R.id.contentMenusID);
        holeLay.removeAllViews();

        statisticsMenuLay = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.statistics_menu, null);
        holeLay.addView(statisticsMenuLay);
    }
}
