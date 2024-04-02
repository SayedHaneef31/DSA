package Arrays_05;
import java.util.*;
public class ValidSquare
{
    public static void main(String[] args)
    {
       int[] p1 = {0,0};
        int[] p2 = {1,1};
        int[] p3 = {0,0};
        int[] p4 = {0,0};

        System.out.println(validSquare(p1,p2,p3,p4));
//       , p2 = [1,1], p3 = [1,0], p4 = [0,12]

    }

    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4)
    {
        HashSet<Double> possible = new HashSet<Double>();
        possible.add(DistanceFinder(p1,p2));
        possible.add(DistanceFinder(p1,p3));
        possible.add(DistanceFinder(p1,p4));
        possible.add(DistanceFinder(p2,p3));
        possible.add(DistanceFinder(p2,p4));
        possible.add(DistanceFinder(p3,p4));

        System.out.println(possible);
        if(possible.contains(0.0) || possible.size()>2) return false;
        return true;
//        double dist1=DistanceFinder(p2,p1);
//        double dist2=DistanceFinder(p2,p3);
//        double dist3=DistanceFinder(p3,p4);
//        double dist4=DistanceFinder(p4,p1);
//        double side=0.0;
//        double diag=0.0;
//        if(dist1==dist2)
//        {
//            side=dist1;
//            diag=DistanceFinder(p2,p4);
//        }
//        else
//        {
//            side=Math.min(dist1,dist2);
////            diag=Math.max(dist1,dist2);
//            diag=side* 1.;
//        }
//
//        if((dist1==side ||dist1==diag) && (dist2==side ||dist2==diag) && (dist3==side ||dist3==diag) && (dist4==side ||dist4==diag) ) return true;
//        return false;
////
////        if(!(dist1 !=side || dist1!=diag)) return false;
//        if(!(dist2 !=side || dist2!=diag)) return false;
//        if(!(dist3 !=side || dist3!=diag)) return false;
//        if(!(dist4 !=side || dist4!=diag)) return false;


//        if(!(dist1 ==side || dist1==diag)) return false;
//        if(!(dist2 !=side || dist2!=diag)) return false;
//        if(!(dist3 !=side || dist3!=diag)) return false;
//        if(!(dist4 !=side || dist4!=diag)) return false;
//        //double slope=Math.sqrt(5);
        // if(Math.sqrt( Math.pow((p3[0]-p2[0]),2) + Math.pow((p3[1]-p2[]),2)) != slope) return false;
        // if(Math.sqrt( Math.pow((p4[0]-p3[0]),2) + Math.pow((p4[1]-p3[]),2)) != slope) return false;
        // if(Math.sqrt( Math.pow((p1[0]-p4[0]),2) + Math.pow((p1[1]-p4[]),2)) != slope) return false;
//        return true;
    }
    static double DistanceFinder(int[] X,int[] Y)
    {
        //Underroot of {(x2-x1)^2+(y2--y1)^2}
        double powX=Math.pow((Y[0]-X[0]),2);
        double powY=Math.pow((Y[1]-X[1]),2);
        System.out.println(powX+powY);
        return powX+powY;

    }

}


