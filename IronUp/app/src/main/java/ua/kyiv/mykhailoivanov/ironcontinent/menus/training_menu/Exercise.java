package ua.kyiv.mykhailoivanov.ironcontinent.menus.training_menu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import ua.kyiv.mykhailoivanov.ironcontinent.R;

public class Exercise {
    String name;
    int weight; // current approach in exercise
    int quantity;
    Activity activity;
    ChoiceExercise exerciseList;
    ExercisesListener exercisesListener;
    TrainMenu training;
    TextView exerciseName;

    public Exercise(Activity activity, TrainMenu training){
        this.activity = activity;
        this.training = training;
        exercisesListener = new ExercisesListener(activity, training);
    }

    public Exercise(String name, int weight){
        this.name = name;
        this.weight = weight;
    }


    private LinearLayout trainMenuLay;
    private LinearLayout holeLay;

    public void setListeners(){

        holeLay = (LinearLayout) activity.findViewById(R.id.contentMenusID);

        holeLay.removeAllViews();


        trainMenuLay = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.choice_exercise_layout, null);
        holeLay.addView(trainMenuLay);

        exerciseName = (TextView) activity.findViewById(R.id.squatsExercise);
        exerciseName.setOnClickListener(exercisesListener);
        exerciseName = (TextView) activity.findViewById(R.id.barbellBenchPressExercise);
        exerciseName.setOnClickListener(exercisesListener);
        exerciseName = (TextView) activity.findViewById(R.id.deadliftExercise);
        exerciseName.setOnClickListener(exercisesListener);

    }
}