package ua.kyiv.mykhailoivanov.ironcontinent.menus.gym_menu;

import android.app.ActionBar;
import android.app.Activity;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import ua.kyiv.mykhailoivanov.ironcontinent.R;
import ua.kyiv.mykhailoivanov.ironcontinent.SaveNLoad;
import ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners.GymPickListener;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class GymMenu {

    private Activity activity;
    private LinearLayout gymMenuLay;
    private LinearLayout holeLay;
    private LinearLayout listLay;
    public static Button currentGymButton;
    public static String currentGymName;

    public GymMenu(Activity activityIn)
    {
        activity = activityIn;

    }

    public void show()
    {

        holeLay = (LinearLayout) activity.findViewById(R.id.contentMenusID);
        holeLay.removeAllViews();

        gymMenuLay = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.gyms_menu, null);




        holeLay.addView(gymMenuLay);
        uploadList();
    }

    private LinearLayout.LayoutParams paramsButton;
    private String gymName;
    public void uploadList()
    {
        int gymsNum = SaveNLoad.getGymNumber();
        listLay = (LinearLayout) activity.findViewById(R.id.gymListLayoutID);
        while(gymsNum!=0)
        {
            Button gymButton = new Button(activity); // @TODO: SET BUTTON BACKGROUND
            paramsButton = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            gymButton.setLayoutParams(paramsButton);
            gymName = SaveNLoad.getGymName(gymsNum);
            gymButton.setBackgroundResource(R.drawable.gymbtnpics);

            gymButton.setText(gymName);
            gymButton.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT));


            gymButton.setTextSize(TypedValue.COMPLEX_UNIT_PX, 25);
            listLay.addView(gymButton);
            gymButton.setOnClickListener(new GymPickListener(activity, gymName, gymButton));
            gymsNum--;
        }
    }
}
