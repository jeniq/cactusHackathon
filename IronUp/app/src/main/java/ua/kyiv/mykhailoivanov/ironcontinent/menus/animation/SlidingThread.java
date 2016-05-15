package ua.kyiv.mykhailoivanov.ironcontinent.menus.animation;

import ua.kyiv.mykhailoivanov.ironcontinent.TheLayout;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class SlidingThread extends Thread {

    public static boolean slideLeft;
    public static boolean slideRight;
    public static boolean stopThread;
    public SlidingHandler slidingHandler;

    public static int menuNum;

    public SlidingThread(SlidingHandler handlerInput)
    {
        slideLeft = false;
        slideRight = false;
        stopThread = false;
        slidingHandler = handlerInput;
        menuNum = 0;
    }


    public void run()
    {
        while(!stopThread)
        {
            if (slideLeft)
            {
                for (int i=0; i<30; i++)
                {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {}
                    slidingHandler.sendEmptyMessage(0);
                    if (stopThread)
                        return;
                }

                if (menuNum!=0)
                {
                    slidingHandler.sendEmptyMessage(menuNum+10);
                }

                slideLeft = false;
                menuNum = 0;
            }

            if (slideRight)
            {
                for (int i=0; i<30; i++)
                {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {}
                    slidingHandler.sendEmptyMessage(1);
                    if (stopThread)
                        return;
                }
                if (menuNum!=0)
                {
                    slidingHandler.sendEmptyMessage(menuNum+10);
                }

                slideRight = false;
                menuNum = 0;
            }

        }
    }
}
