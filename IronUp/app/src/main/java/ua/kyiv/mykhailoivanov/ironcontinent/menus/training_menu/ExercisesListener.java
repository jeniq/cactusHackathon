package ua.kyiv.mykhailoivanov.ironcontinent.menus.training_menu;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import ua.kyiv.mykhailoivanov.ironcontinent.R;

public class ExercisesListener implements View.OnClickListener {

Activity activity;
Training training;
TextView exerciseName;
EditText weight;

    public ExercisesListener(Activity activity, Training training){
        this.activity = activity;
        this.training = training;
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.squatsExercise:
                exerciseName = (TextView) activity.findViewById(R.id.squatsExercise);
                break;
            case R.id.barbellBenchPressExercise:
                exerciseName = (TextView) activity.findViewById(R.id.barbellBenchPressExercise);
                break;
            case R.id.deadliftExercise:
                exerciseName = (TextView) activity.findViewById(R.id.deadliftExercise);
                break;
        }
        weight = (EditText) activity.findViewById(R.id.editWeight);
        if (!weight.getText().toString().matches("\\d+")){
            Toast.makeText(activity, "Wrong numeric value!", Toast.LENGTH_SHORT).show();
        }else{
            training.changeLayer();
            training.addExercise(exerciseName.getText().toString(),
                    Integer.parseInt(weight.getText().toString()));
        }
    }

}