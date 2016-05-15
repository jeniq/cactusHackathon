package ua.kyiv.mykhailoivanov.ironcontinent.menus.entry_menu;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ua.kyiv.mykhailoivanov.ironcontinent.IronContinent;
import ua.kyiv.mykhailoivanov.ironcontinent.R;

/**
 * Created by MykhailoIvanov on 5/15/2016.
 */
public class EntryListener implements View.OnClickListener {

    Activity activity;
    Button enterBtn;
    EditText email;
    EditText password;
    Entry entry;

    public EntryListener(Activity activity, Entry entry){
        this.activity = activity;
        this.entry = entry;
    }

    @Override
    public void onClick(View view){
        email = (EditText) activity.findViewById(R.id.emailInput);
        password = (EditText) activity.findViewById(R.id.passwordInput);

        if (entry.login.equals(email.getText().toString())
                && entry.password.equals(password.getText().toString())){

            entry.enterToApp();
        }else{
            Toast.makeText(activity, "Wrong email or password!", Toast.LENGTH_SHORT).show();
        }
    }
}