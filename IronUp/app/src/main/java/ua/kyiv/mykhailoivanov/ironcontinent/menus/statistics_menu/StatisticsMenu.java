package ua.kyiv.mykhailoivanov.ironcontinent.menus.statistics_menu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import ua.kyiv.mykhailoivanov.ironcontinent.IronContinent;
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

    private View view;
    private LinearLayout linearLay;
    private ScrollView scrollView;
    public void show()
    {

        holeLay = (LinearLayout) activity.findViewById(R.id.contentMenusID);
        holeLay.removeAllViews();

        statisticsMenuLay = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.all_statistic_layout, null);
        holeLay.addView(statisticsMenuLay);

        if (IronContinent.isAdmin)
        {
            scrollView = (ScrollView) statisticsMenuLay.getChildAt(1);
            linearLay = (LinearLayout) scrollView.getChildAt(0);
            for (int i = 0; i < 5; i++)
            {
                if( i == 4)
                {
                    view = linearLay.getChildAt(i);
                    view.setVisibility(View.GONE);
                }
                else
                {
                    // @TODO: connect clicklistener
                }
            }
        }


    }
}
