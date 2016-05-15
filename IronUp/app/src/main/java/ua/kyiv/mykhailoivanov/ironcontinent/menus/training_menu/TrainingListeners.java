package ua.kyiv.mykhailoivanov.ironcontinent.menus.training_menu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import ua.kyiv.mykhailoivanov.ironcontinent.R;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingThread;

/**
 * Created by MykhailoIvanov on 5/15/2016.
 */
public class TrainingListeners implements View.OnClickListener {

    Activity activity;
    Exercise exercise;
    private TrainMenu trainMenu;

    public TrainingListeners(Activity activity, Exercise exercise, TrainMenu trainMenuIn){
        this.activity = activity;
        this.exercise = exercise;
        trainMenu = trainMenuIn;
    }

    private LinearLayout trainMenuLay;
    private LinearLayout holeLay;
    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.newExerciseButton:
                exercise.setListeners();
                break;
            case R.id.endTrainingButton:
                trainMenu.show();
                break;
        }
    }


}