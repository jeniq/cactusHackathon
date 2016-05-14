package ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners;

import android.view.View;

import ua.kyiv.mykhailoivanov.ironcontinent.TheLayout;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingThread;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class SliderButtonListener implements View.OnClickListener {
    @Override
    public void onClick(View v)
    {
        if (TheLayout.whichWayToSlide == 1)
        {
            SlidingThread.slideLeft = true;
            TheLayout.whichWayToSlide = 0;
        }
        else if (TheLayout.whichWayToSlide == 0)
        {
            SlidingThread.slideRight = true;
            TheLayout.whichWayToSlide = 1;
        }
    }
}
