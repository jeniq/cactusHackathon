package ua.kyiv.mykhailoivanov.ironcontinent;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.LabeledIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingHandler;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.animation.SlidingThread;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.left_toolbar_menu.LeftToolbarMenu;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.news_menu.NewsMenu;
import ua.kyiv.mykhailoivanov.ironcontinent.menus.statistics_menu.StatisticsMenu;
import ua.kyiv.mykhailoivanov.ironcontinent.onClickListeners.SliderButtonListener;

public class IronContinent extends Activity {

    private Button sliderButton;
    private SliderButtonListener sliderButtonListener;
    private TheLayout theLayout;
    private LeftToolbarMenu leftToolbarMenu;
    private SlidingHandler slidingHandler;
    private SlidingThread slidingThread;

    private NewsMenu newsMenu;
    private StatisticsMenu statisticsMenu;

    public NewsMenu getNewsMenu()
    {
        return newsMenu;
    }

    public StatisticsMenu getStatisticsMenu()
    {
        return statisticsMenu;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        newsMenu = new NewsMenu(this);
        statisticsMenu = new StatisticsMenu(this);

        theLayout = (TheLayout) getLayoutInflater().inflate(R.layout.main, null);
        theLayout.setActivity(this, getWindowManager().getDefaultDisplay().getWidth());
        setContentView(theLayout);

        sliderButton = (Button) findViewById(R.id.sliderButton);

        sliderButtonListener = new SliderButtonListener();

        sliderButton.setOnClickListener(sliderButtonListener);
        leftToolbarMenu = new LeftToolbarMenu(this, this);

        slidingHandler = new SlidingHandler(theLayout, this.getWindowManager().getDefaultDisplay().getWidth());
        slidingThread  = new SlidingThread(slidingHandler);
        slidingThread.start();





    }
}
