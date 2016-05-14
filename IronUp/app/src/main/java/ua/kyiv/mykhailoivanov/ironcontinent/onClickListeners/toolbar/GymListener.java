package ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners.toolbar;

import android.view.View;

import ua.kyiv.mykhailoivanov.ironcontinent.TheLayout;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingThread;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.gym_menu.GymMenu;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.news_menu.NewsMenu;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class GymListener implements View.OnClickListener {
    private GymMenu gymMenu;

    public GymListener(GymMenu gymMenuInput)
    {
        gymMenu = gymMenuInput;
    }
    @Override
    public void onClick(View v)
    {
        gymMenu.show();
        SlidingThread.slideRight = true;
        TheLayout.whichWayToSlide = 1;
    }
}