package ua.kyiv.mykhailoivanov.ironcontinent.menus.animation;

import android.os.Handler;
import android.view.View;

import ua.kyiv.mykhailoivanov.ironcontinent.TheLayout;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class SlidingHandler extends Handler {

    private TheLayout theLayout;
    private int slidingValue;

    public SlidingHandler(TheLayout layoutIn, int width)
    {
        theLayout = layoutIn;
        slidingValue = width/30;
    }

    public void handleMessage(android.os.Message message)
    {
        switch (message.what)
        {
            case 0:
                theLayout.otherView.setVisibility(View.VISIBLE);
                theLayout.otherView.offsetLeftAndRight(-slidingValue);
                theLayout.cameraView.offsetLeftAndRight(-slidingValue);
                theLayout.whichWayToSlide = 1;
                theLayout.postInvalidate();
                break;
            case 1:
                theLayout.otherView.setVisibility(View.VISIBLE);
                theLayout.otherView.offsetLeftAndRight(slidingValue);
                theLayout.cameraView.offsetLeftAndRight(slidingValue);
                theLayout.whichWayToSlide = 0;
                theLayout.postInvalidate();
                break;
        }
    }
}
