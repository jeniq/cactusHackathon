package ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners;

import android.app.Activity;
import android.view.View;
import android.widget.Button;

import ua.kyiv.mykhailoivanov.ironcontinent.R;
import ua.kyiv.mykhailoivanov.ironcontinent.TheLayout;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingThread;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.gym_menu.GymMenu;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class GymPickListener  implements View.OnClickListener {
    private Activity activity;
    private String gymName;
    private Button button;
    public GymPickListener(Activity activityIn, String gymIdentification, Button buttonIn)
    {
        activity = activityIn;
        gymName = gymIdentification;
        button = buttonIn;
    }

    @Override
    public void onClick(View v)
    {
        // @TODO: SET BUTTON BACKGROUND with star, and make prev current with no star

        if (GymMenu.currentGymButton!=null)
        {
            GymMenu.currentGymButton.setBackgroundResource(R.drawable.gymbtnpics);
        }

        GymMenu.currentGymButton = button;
        GymMenu.currentGymName = gymName;
        GymMenu.currentGymButton.setBackgroundResource(R.drawable.gymbuttonpressed);
    }
}