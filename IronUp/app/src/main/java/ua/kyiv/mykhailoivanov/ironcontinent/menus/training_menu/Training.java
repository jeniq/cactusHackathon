package ua.kyiv.mykhailoivanov.ironcontinent.menus.training_menu;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ua.kyiv.mykhailoivanov.ironcontinent.R;

/**
 * Created by Женя on 14.05.2016.
 */
public class Training {
    LinearLayout linearView;




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
//
    private static SimpleDateFormat dateFormat;
    List<Exercise> exerciseList;
    private Date date;
    Activity activity;
    private Exercise exercise;
    TrainingListeners trainingListeners;
    private Button button;
    LinearLayout exercisesListView;
    TrainingMenu trainingHistory;

    public Training(Activity activity, TrainingMenu trainingHistory){
        this.activity = activity;
        this.trainingHistory = trainingHistory;
        date = new Date();
        exercise = new Exercise(activity, this);
        trainingListeners = new TrainingListeners(activity, exercise, trainingHistory);
        exerciseList = new ArrayList<>();
        changeLayer();
    }

    public String getDate(){
        dateFormat = new SimpleDateFormat("dd MMMM");
        return new String(dateFormat.format(date));
    }




    public void addExercise(String name, int weight){
        exerciseList.add(new Exercise(name, weight));
        for (int i = 0; i < exerciseList.size(); i++) {
            exercisesListView = (LinearLayout) activity.findViewById(R.id.exercisesList);
            LinearLayout block = new LinearLayout(activity);
            block.setOrientation(LinearLayout.HORIZONTAL);

            LinearLayout.LayoutParams blockParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT);
            block.setLayoutParams(blockParams);

            TextView exerciseInfo = new TextView(activity);
            exerciseInfo.setText(exerciseList.get(i).name + ". Weight is " +
                    exerciseList.get(i).weight + " kg");
            exerciseInfo.setTextSize(24);


            ViewGroup.LayoutParams textParams = new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);

            exerciseInfo.setLayoutParams(textParams);
            block.addView(exerciseInfo);
            exercisesListView.addView(block);
        }
    }

}