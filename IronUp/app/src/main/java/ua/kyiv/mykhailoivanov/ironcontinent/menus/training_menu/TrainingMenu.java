package ua.kyiv.mykhailoivanov.ironcontinent.menus.training_menu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ua.kyiv.mykhailoivanov.ironcontinent.R;

/**
 * Created by MykhailoIvanov on 5/15/2016.
 */
public class TrainingMenu {
    Activity activity;
    List<Training> trainingHistory;
    Button button;
    LinearLayout trainingsListView;
    Training training;
    TrainingHistoryListener trainingHistoryListener;

    public TrainingMenu(Activity activity){
        this.activity = activity;
        trainingHistory = new ArrayList<>();
        trainingHistoryListener = new TrainingHistoryListener(this.activity, this, training);
    }

    public void show()
    {
        appendTraining();
        appendListener();
    }

    private LinearLayout trainMenuLay;
    private LinearLayout holeLay;
    public void appendTraining() {
        trainingHistory.add(new Training(activity, this));
        //
        holeLay = (LinearLayout) activity.findViewById(R.id.contentMenusID);
        holeLay.removeAllViews();

        trainMenuLay = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.trainings_layout, null);
        holeLay.addView(trainMenuLay);

        trainingsListView = (LinearLayout) activity.findViewById(R.id.trainingsHistoryList);
        for (int i = 0; i < trainingHistory.size(); i++) {
            LinearLayout block = new LinearLayout(activity);
            block.setOrientation(LinearLayout.HORIZONTAL);

            LinearLayout.LayoutParams blockParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT);
            block.setLayoutParams(blockParams);

            TextView exerciseInfo = new TextView(activity);
            exerciseInfo.setText(trainingHistory.get(i).getDate());
            exerciseInfo.setTextSize(24);


            ViewGroup.LayoutParams textParams = new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);

            exerciseInfo.setLayoutParams(textParams);
            block.addView(exerciseInfo);
            trainingsListView.addView(block);
        }
    }

    public void appendListener(){
        button = (Button) activity.findViewById(R.id.newTrainingButton);
        button.setOnClickListener(trainingHistoryListener);
    }
}