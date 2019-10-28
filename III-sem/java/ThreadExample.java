import java.util.Scanner;

class MyThread extends Thread
{
    String threadName;
    static int no = 1;

    MyThread()
    {
        threadName = "TRD" + no++;
    }

    public void run()
    {
        for(int i = 1 ; i <= 50 ; i++) 
        {
            System.out.println(threadName + " => " + i + ".");
            try
            {
                if(threadName.equals("TRD1"))
                    sleep(300);
                else
                    sleep(1200);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            } 
        }    
    } 
}

public class ThreadExample
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        t.start();

        MyThread t2 = new MyThread();
        t2.start();
    }
}