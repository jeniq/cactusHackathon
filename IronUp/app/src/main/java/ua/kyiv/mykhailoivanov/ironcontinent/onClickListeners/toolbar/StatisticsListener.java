package ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners.toolbar;

import android.view.View;

import ua.kyiv.mykhailoivanov.ironcontinent.TheLayout;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingThread;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.news_menu.NewsMenu;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.statistics_menu.StatisticsMenu;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class StatisticsListener implements View.OnClickListener {
    private StatisticsMenu statisticsMenu;

    public StatisticsListener(StatisticsMenu statisticsMenuInput)
    {
        statisticsMenu = statisticsMenuInput;
    }
    @Override
    public void onClick(View v)
    {
        statisticsMenu.show();
        SlidingThread.slideRight = true;
        TheLayout.whichWayToSlide = 1;
    }
}