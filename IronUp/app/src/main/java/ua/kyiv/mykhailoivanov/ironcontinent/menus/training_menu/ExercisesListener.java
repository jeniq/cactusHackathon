package ua.kyiv.mykhailoivanov.ironcontinent.menus.training_menu;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import ua.kyiv.mykhailoivanov.ironcontinent.R;

/**
 * Created by MykhailoIvanov on 5/15/2016.
 */
public class ExercisesListener implements View.OnClickListener {
    Activity activity;
    TrainMenu training;
    TextView exerciseName;
    EditText weight;

    public ExercisesListener(Activity activity, TrainMenu training){
        this.activity = activity;
        this.training = training;
    }

    @Override
    public void onClick(View view){
        weight = (EditText) activity.findViewById(R.id.editWeight);
        if (weight.getText().toString().isEmpty())
            return;

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

        training.changeLayer();
        training.linearView = (LinearLayout) activity.findViewById(R.id.exercisesList);
        addExercise(exerciseName.getText().toString(),
                Integer.parseInt(weight.getText().toString()));
    }

    public void addExercise(String name, int weight){
        training.exerciseList.add(new Exercise(name, weight));

        LinearLayout block = new LinearLayout(activity);
        block.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout.LayoutParams blockParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        block.setLayoutParams(blockParams);

        TextView exerciseInfo = new TextView(activity);
        exerciseInfo.setText(name + ". Weight is " + weight + "kg");
        exerciseInfo.setTextSize(24);


        ViewGroup.LayoutParams textParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);

        exerciseInfo.setLayoutParams(textParams);
        block.addView(exerciseInfo);
        training.linearView.addView(block);
    }
}