package ua.kyiv.mykhailoivanov.ironcontinent;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingHandler;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingThread;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class TheLayout extends LinearLayout {

    public TheLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public TheLayout(Context context) {
        super(context);
    }
    public TheLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private Activity activity;
    public View cameraView;
    public View otherView;
    private int menuMargin;
    public  int whichWayToSlide;
    private SlidingThread slidingThread;
    private SlidingHandler slidingHandler;

    public void setActivity(Activity activityInput, int width)
    {
        menuMargin = (int) (width*0.2);
        activity = activityInput;

        slidingHandler = new SlidingHandler(this, width);
        slidingThread = new SlidingThread(slidingHandler);
        slidingThread.start();
        whichWayToSlide = 0; // 0 - closed
        // 1 - opened
    }

    public void stopAnimationThread()
    {
        slidingThread.stopThread = true;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        otherView = this.getChildAt(0);
        cameraView = this.getChildAt(1);
    }

    protected void onLayout(boolean changed, int left, int top, int right, int bottom)
    {
        if (changed)
            calculateChildDimensions();

        otherView.layout(left + (int)(menuMargin/0.2), top,  right + (int)(menuMargin/0.2), bottom);
        cameraView.layout(left, top, right, bottom);

    }
    private void calculateChildDimensions()
    {
        cameraView.getLayoutParams().height = this.getHeight();
        cameraView.getLayoutParams().width = this.getWidth();

        otherView.getLayoutParams().height = this.getHeight();
        otherView.getLayoutParams().width = this.getWidth();
    }


    public void doSliding()
    {
        switch(whichWayToSlide)
        {
            case 0:
                slidingThread.slideLeft = true;
                break;
            case 1:
                slidingThread.slideRight = true;
                break;
        }
    }
}
