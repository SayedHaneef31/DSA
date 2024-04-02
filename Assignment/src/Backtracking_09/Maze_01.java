//package Backtracking_09;
//
//public class Maze_01
//{
//    public static void main(String[] args)
//    {
//        System.out.println(count(3,3));
//
//    }
//
//    static int count(int r,int c)
//    {
//        if(r==1 ||c==1)
//            return 1;
//
//        int left=count(r-1,c);
//        int right=count( r,c-1);
//
//        return left+right;
//    }
//
//    static void mazePathPrint(String p,int r,int c)
//    {
//        if(r==1 && c==1)
//        {
//            System.out.println(p);
//            return;
//        }
//
//
//        //left or down road
//        if(r==1 && c!=1)
//            mazePathPrint()
//        int right=count( r,c-1);
//
//        return left+right;
//
//    }
//}
