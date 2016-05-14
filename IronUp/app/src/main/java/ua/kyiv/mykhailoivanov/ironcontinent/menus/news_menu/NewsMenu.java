package ua.kyiv.mykhailoivanov.ironcontinent.menus.news_menu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import ua.kyiv.mykhailoivanov.ironcontinent.R;
import ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners.toolbar.NewsFeedListener;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class NewsMenu {
    private Activity activity;
    private LinearLayout linearLayout;
    private View layView;

    public NewsMenu(Activity activityIn)
    {
        activity = activityIn;
    }

    public void show()
    {
        layView = LayoutInflater.from(activity).inflate(R.layout.lefttoolbar, null);
    }
}
