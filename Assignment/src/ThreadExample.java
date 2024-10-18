//
//class EvenThread extends Thread
//{
//    public void run() {
//
//        for(int i=2;i<=5000;i+=2)
//        {
//            try{
//                System.out.println(i);
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//            }
//
//
//        }
//    }
//}
//public class ThreadExample extends Thread
//{
//    public static void ThreadExample(String[] args) {
//        ThreadExample tEven = new ThreadExample();
//        tEven.start();
//        ThreadExample tOdd = new ThreadExample();
//        tOdd.start();
//        System.out.println("This code is outside of the thread");
//    }
//    public void run() {
//
//        System.out.println("This code is running in a thread");
//    }
//}
//
