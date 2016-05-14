package ua.kyiv.mykhailoivanov.ironcontinent.menus.left_toolbar_menu;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import ua.kyiv.mykhailoivanov.ironcontinent.IronContinent;
import ua.kyiv.mykhailoivanov.ironcontinent.R;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.news_menu.NewsMenu;
import ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners.toolbar.NewsFeedListener;
import ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners.toolbar.StatisticsListener;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class LeftToolbarMenu {

    private LinearLayout linearLayout;
    private Activity activity;

    private Button button;
    private NewsFeedListener newsFeedListener;
    private StatisticsListener statisticsListener;
    private IronContinent ironContinent;

    public LeftToolbarMenu(Activity activityIn, IronContinent ironContinentIn)
    {
        ironContinent = ironContinentIn;
        activity = activityIn;
        linearLayout = (LinearLayout) activity.findViewById(R.id.leftToolbarLayoutID);
        View view = LayoutInflater.from(activity).inflate(R.layout.lefttoolbar, null);
        linearLayout.addView(view);



        newsFeedListener = new NewsFeedListener(ironContinent.getNewsMenu());
        statisticsListener = new StatisticsListener(ironContinent.getStatisticsMenu());

        button = (Button) activity.findViewById(R.id.newsFeedButtonID);
        button.setOnClickListener(newsFeedListener);

        button = (Button) activity.findViewById(R.id.statisticsButtonID);
        button.setOnClickListener(statisticsListener);

        // @TODO: FINISH 3 MENUS
    }
}
