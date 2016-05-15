package ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners.toolbar;

import android.view.View;

import ua.kyiv.mykhailoivanov.ironcontinent.TheLayout;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingThread;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.news_menu.NewsMenu;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class NewsFeedListener implements View.OnClickListener {
    private NewsMenu newsMenu;

    public NewsFeedListener(NewsMenu newsMenuInput)
    {
        newsMenu = newsMenuInput;
    }
    @Override
    public void onClick(View v)
    {
        SlidingThread.slideLeft = true;
        TheLayout.whichWayToSlide = 0;

        SlidingThread.menuNum = 1;

    }
}