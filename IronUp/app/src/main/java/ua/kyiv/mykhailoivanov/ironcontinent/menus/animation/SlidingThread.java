package ua.kyiv.mykhailoivanov.ironcontinent.menus.animation;

/**
 * Created by MykhailoIvanov on 5/14/2016.
 */
public class SlidingThread extends Thread {

    public static boolean slideLeft;
    public static boolean slideRight;
    public static boolean stopThread;
    public SlidingHandler slidingHandler;

    public SlidingThread(SlidingHandler handlerInput)
    {
        slideLeft = false;
        slideRight = false;
        stopThread = false;
        slidingHandler = handlerInput;
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
                slideLeft = false;
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
                slideRight = false;
            }
        }
    }
}
