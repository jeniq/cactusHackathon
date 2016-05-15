package ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners;

import android.app.Activity;
import android.view.View;
import android.widget.Button;

import ua.kyiv.mykhailoivanov.ironcontinent.R;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.notifications_fragment.NotificationFragment;


/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class NotificationButtonListener implements View.OnClickListener {

    public static boolean isNotification;
    public static String notificationText;

    private Activity activity;
    private NotificationFragment notificationFragment;

    public NotificationButtonListener(Activity activityIn, NotificationFragment notificationFragmentIn)
    {
        notificationText = "Tomorrow we will test you, man";

        activity = activityIn;
        notificationFragment = notificationFragmentIn;
    }

    private Button button;
    @Override
    public void onClick(View v)
    {
        if (isNotification)
        {
            button = (Button) activity.findViewById(R.id.notificationsButton);
            button.setBackgroundResource(R.drawable.notificationpicture_no_notification);
            isNotification = false;
        }


        notificationFragment.show(activity.getFragmentManager(), "notificationFragment_tag");
    }
}