package ua.kyiv.mykhailoivanov.ironcontinent.menus.topmembers_dialogfragment;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.kyiv.mykhailoivanov.ironcontinent.R;

/**
 * Created by MykhailoIvanov on 5/15/2016.
 */
public class NotificationMakingFragmentDialog  extends DialogFragment implements View.OnClickListener
{

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle)
    {
        this.getDialog().setTitle("Notification");
        View v = inflater.inflate(R.layout.notificationmaking_dialog,  null);
        return v;
    }

    public void onResume()
    {
        super.onResume();

    }

    public void onClick(View v)
    {
        // @TODO: SEND MESSAGE IF BUTTON SEND
        this.dismiss();
    }
}
