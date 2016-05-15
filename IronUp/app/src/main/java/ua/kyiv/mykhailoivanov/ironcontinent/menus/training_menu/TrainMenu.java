package ua.kyiv.mykhailoivanov.ironcontinent.menus.training_menu;


import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ua.kyiv.mykhailoivanov.ironcontinent.R;

/**
 * Created by Женя on 14.05.2016.
 */
public class TrainMenu {
    private static SimpleDateFormat dateFormat;
    List<Exercise> exerciseList;
    private Date date;
    Activity activity;
    private Exercise exercise;
    TrainingListeners trainingListeners;
    private Button button;
    LinearLayout linearView;

    public TrainMenu(Activity activityIn) {
        activity = activityIn;
        exercise = new Exercise(activity, this);
        trainingListeners = new TrainingListeners(activity, exercise, this);
        exerciseList = new ArrayList<>();
    }

    public void show()
    {
        changeLayer();
    }

    public String getDate() {
        return new String(dateFormat.format(date));
    }


    private LinearLayout trainMenuLay;
    private LinearLayout holeLay;

    public void changeLayer() {

        holeLay = (LinearLayout) activity.findViewById(R.id.contentMenusID);
        holeLay.removeAllViews();

        trainMenuLay = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.exercises_list_layout, null);
        holeLay.addView(trainMenuLay);

        button = (Button) activity.findViewById(R.id.newExerciseButton);
        button.setOnClickListener(trainingListeners);
        button = (Button) activity.findViewById(R.id.endTrainingButton);
        button.setOnClickListener(trainingListeners);
    }
}