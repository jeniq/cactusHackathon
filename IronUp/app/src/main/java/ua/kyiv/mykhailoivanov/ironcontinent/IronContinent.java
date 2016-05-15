package ua.kyiv.mykhailoivanov.ironcontinent;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingHandler;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingThread;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.entry_menu.Entry;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.gym_menu.GymMenu;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.left_toolbar_menu.LeftToolbarMenu;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.news_menu.NewsMenu;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.notifications_fragment.NotificationFragment;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.statistics_menu.StatisticsMenu;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.training_menu.TrainingMenu;
import ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners.NotificationButtonListener;
import ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners.SliderButtonListener;

public class IronContinent extends Activity {

    private Button button;
    private SliderButtonListener sliderButtonListener;
    private TheLayout theLayout;
    private LeftToolbarMenu leftToolbarMenu;
    private SlidingHandler slidingHandler;
    private SlidingThread slidingThread;

    private NewsMenu newsMenu;
    private StatisticsMenu statisticsMenu;
    private GymMenu gymMenu;
    private TrainingMenu trainMenu;

    private NotificationFragment notificationFragment;
    private NotificationButtonListener notificationButtonListener;

    public NewsMenu getNewsMenu()
    {
        return newsMenu;
    }

    public StatisticsMenu getStatisticsMenu()
    {
        return statisticsMenu;
    }

    public GymMenu getGymMenu()
    {
        return gymMenu;
    }

    public TrainingMenu getTrainMenu()
    {
        return trainMenu;
    }


    private Entry entry;
    public static boolean isAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.entry_menu);
        entry = new Entry(this, this);



    }

    public void startApp()
    {

        // TEST SAVING
        SaveNLoad.activity = this;
//        SaveNLoad.saveGym("SportLife");
        //
        newsMenu = new NewsMenu(this);
        statisticsMenu = new StatisticsMenu(this);
        gymMenu = new GymMenu(this);
        trainMenu = new TrainingMenu(this);


        theLayout = (TheLayout) getLayoutInflater().inflate(R.layout.main, null);
        theLayout.setActivity(this, getWindowManager().getDefaultDisplay().getWidth());
        setContentView(theLayout);

        button = (Button) findViewById(R.id.sliderButton);

        sliderButtonListener = new SliderButtonListener();

        button.setOnClickListener(sliderButtonListener);
        leftToolbarMenu = new LeftToolbarMenu(this, this);

        slidingHandler = new SlidingHandler(theLayout, this.getWindowManager().getDefaultDisplay().getWidth());
        slidingThread  = new SlidingThread(slidingHandler);
        slidingThread.start();


        // notifocations
        button = (Button) findViewById(R.id.notificationsButton); // testing the notification
        button.setBackgroundResource(R.drawable.notificationpicture_one_notification);
        NotificationButtonListener.isNotification = true;
        notificationFragment = new NotificationFragment();
        notificationButtonListener = new NotificationButtonListener(this, notificationFragment);
        button = (Button) findViewById(R.id.notificationsButton);
        button.setOnClickListener(notificationButtonListener);
        if (isAdmin)
        {
            button.setVisibility(View.GONE);
        }


    }
}
