package ua.kyiv.mykhailoivanov.ironcontinent.menus.training_menu;

import android.app.Activity;
import android.view.View;

import ua.kyiv.mykhailoivanov.ironcontinent.R;

/**
 * Created by MykhailoIvanov on 5/15/2016.
 */
public class TrainingListeners implements View.OnClickListener {

    Activity activity;
    Exercise exercise;
    TrainingMenu trainingHistory;

    public TrainingListeners(Activity activity, Exercise exercise, TrainingMenu trainingHistory){
        this.activity = activity;
        this.exercise = exercise;
        this.trainingHistory = trainingHistory;
    }

    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.newExerciseButton:
                exercise.setListeners();
                break;
            case R.id.endTrainingButton:
                trainingHistory.appendTraining();
                trainingHistory.appendListener();
                break;
        }
    }


}