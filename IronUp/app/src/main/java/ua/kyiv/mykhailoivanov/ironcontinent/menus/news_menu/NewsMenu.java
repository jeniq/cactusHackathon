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
    private LinearLayout newsMenuLay;
    private LinearLayout holeLay;

    public NewsMenu(Activity activityIn)
    {
        activity = activityIn;
    }

    public void show()
    {

        holeLay = (LinearLayout) activity.findViewById(R.id.contentMenusID);
        holeLay.removeAllViews();

        newsMenuLay = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.news_menu, null);
        holeLay.addView(newsMenuLay);
    }

}
