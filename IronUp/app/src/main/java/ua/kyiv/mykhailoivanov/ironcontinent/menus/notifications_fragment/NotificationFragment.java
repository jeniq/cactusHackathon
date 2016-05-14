package ua.kyiv.mykhailoivanov.ironcontinent.menus.notifications_fragment;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ua.kyiv.mykhailoivanov.ironcontinent.R;
import ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners.NotificationButtonListener;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class NotificationFragment  extends DialogFragment implements View.OnClickListener {


    private TextView textView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle)
    {
        this.getDialog().setTitle("Notifications");
        View v = inflater.inflate(R.layout.notification_dialog,  null);
        textView = (TextView) v.findViewById(R.id.notificationTextViewID);
        textView.setText(NotificationButtonListener.notificationText);
        return v;
    }

    public void onResume()
    {
        super.onResume();

    }

    public void onClick(View v) {
        NotificationButtonListener.isNotification = false;
        this.dismiss();
    }
}
