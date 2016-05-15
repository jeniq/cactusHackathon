package ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners.toolbar;

import android.view.View;

import ua.kyiv.mykhailoivanov.ironcontinent.TheLayout;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingThread;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.training_menu.Training;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.training_menu.TrainingMenu;

/**
 * Created by MykhailoIvanov on 5/15/2016.
 */
public class TrainListener  implements View.OnClickListener {
    private TrainingMenu trainMenu;

    public TrainListener(TrainingMenu trainMenuIn)
    {
        trainMenu = trainMenuIn;
    }
    @Override
    public void onClick(View v)
    {
        SlidingThread.slideLeft = true;
        TheLayout.whichWayToSlide = 0;

        SlidingThread.menuNum = 4;
    }
}