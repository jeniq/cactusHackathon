package ua.kyiv.mykhailoivanov.ironcontinent.menus.animation;

import android.os.Handler;

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
        slidingValue = (int) ((0.8*width)/30);
    }

    public void handleMessage(android.os.Message message)
    {
        switch (message.what)
        {
            case 0:
                theLayout.otherView.offsetLeftAndRight(-slidingValue);
                theLayout.toolbarView.offsetLeftAndRight(-slidingValue);
                theLayout.postInvalidate();
                break;
            case 1:
                theLayout.otherView.offsetLeftAndRight(slidingValue);
                theLayout.toolbarView.offsetLeftAndRight(slidingValue);
                theLayout.postInvalidate();
                break;

            case 11:
                theLayout.activity.getNewsMenu().show();
                break;
            case 12:
                theLayout.activity.getStatisticsMenu().show();
                break;
            case 13:
                theLayout.activity.getGymMenu().show();
                break;
            case 14:
                theLayout.activity.getTrainMenu().show();
                break;

        }
    }
}
