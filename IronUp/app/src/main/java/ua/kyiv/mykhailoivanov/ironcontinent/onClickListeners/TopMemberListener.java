package ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners;

import android.app.Activity;
import android.view.View;
import android.widget.Button;

import ua.kyiv.mykhailoivanov.ironcontinent.TheLayout;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingThread;

/**
 * Created by MykhailoIvanov on 5/15/2016.
 */

// FOR ADMIN MODE ONLY
public class TopMemberListener  implements View.OnClickListener {
    private Activity activity;
    private Button button;
    public TopMemberListener(Activity activityIn, Button buttonIn)
    {
        activity = activityIn;
        button = buttonIn;
    }

    @Override
    public void onClick(View v)
    {

    }
}
