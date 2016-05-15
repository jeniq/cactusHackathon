package ua.kyiv.mykhailoivanov.ironcontinent.menus.training_menu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import ua.kyiv.mykhailoivanov.ironcontinent.R;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingThread;

public class ChoiceExercise implements View.OnClickListener{
    Activity activity;
    Exercise exercise;

    public ChoiceExercise(Activity A, Exercise exercise)
    {
        activity = A;
        this.exercise = exercise;
    }

    private LinearLayout trainMenuLay;
    private LinearLayout holeLay;
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.squatsExercise:
                holeLay = (LinearLayout) activity.findViewById(R.id.contentMenusID);
                holeLay.removeAllViews();

                trainMenuLay = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.exercises_list_layout, null);
                holeLay.addView(trainMenuLay);
                break;
        }

    }
}