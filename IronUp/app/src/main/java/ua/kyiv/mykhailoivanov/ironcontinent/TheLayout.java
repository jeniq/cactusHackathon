package ua.kyiv.mykhailoivanov.ironcontinent;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

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
    public View toolbarView;
    public View otherView;
    public static int menuMargin;
    public static  int whichWayToSlide;

    public void setActivity(Activity activityInput, int width)
    {
        menuMargin = (int) (width*0.2);
        activity = activityInput;

        whichWayToSlide = 0; // 0 - Right
        // 1 - Left
    }


    LinearLayout layContains;
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        layContains = (LinearLayout) this.getChildAt(1);

        toolbarView = layContains.getChildAt(0);
        otherView = layContains.getChildAt(1);
    }

    protected void onLayout(boolean changed, int left, int top, int right, int bottom)
    {
        super.onLayout(changed, left,  top,  right,  bottom);
        if (changed)
            calculateChildDimensions();


        otherView.layout(left + (int)(menuMargin/0.2), top,  right + (int)(menuMargin/0.2), bottom);
        toolbarView.layout(left, top, right, bottom);

    }

    private void calculateChildDimensions()
    {
        toolbarView.getLayoutParams().height = this.getHeight();
        toolbarView.getLayoutParams().width = (int) ((int) this.getWidth()*0.8);

        otherView.getLayoutParams().height = this.getHeight();
        otherView.getLayoutParams().width = this.getWidth();
    }
}
