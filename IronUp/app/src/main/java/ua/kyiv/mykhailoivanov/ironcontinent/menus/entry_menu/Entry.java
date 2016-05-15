package ua.kyiv.mykhailoivanov.ironcontinent.menus.entry_menu;

import android.app.Activity;
import android.widget.Button;

import ua.kyiv.mykhailoivanov.ironcontinent.IronContinent;
import ua.kyiv.mykhailoivanov.ironcontinent.R;

/**
 * Created by MykhailoIvanov on 5/15/2016.
 */
public class Entry {
    static String login;
    static String password;
    Activity activity;
    EntryListener entryListener;
    Button enter;
    private IronContinent ironContinent;

    public Entry(Activity activity, IronContinent ironContinentIn){
        ironContinent = ironContinentIn;
        login = "admin";
        password = "admin";
        this.activity = activity;
        entryListener = new EntryListener(this.activity, this);
        appendLister();
    }

    void enterToApp(){
        ironContinent.startApp();
    }

    public void appendLister(){
        enter = (Button) activity.findViewById(R.id.enterButton);
        enter.setOnClickListener(entryListener);
    }

}