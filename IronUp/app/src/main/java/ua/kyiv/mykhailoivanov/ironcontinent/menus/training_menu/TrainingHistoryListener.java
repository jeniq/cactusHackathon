package ua.kyiv.mykhailoivanov.ironcontinent.menus.training_menu;


import android.app.Activity;
import android.view.View;

public class TrainingHistoryListener implements View.OnClickListener {

    Activity activity;
    Training training;
    TrainingMenu trainingHistory;

    public TrainingHistoryListener(Activity activity, TrainingMenu trainingHistory,
                                   Training training){
        this.activity = activity;
        this.trainingHistory = trainingHistory;
        this.training = training;
    }

    @Override
    public void onClick(View view){
        training = new Training(activity, trainingHistory);
    }

}