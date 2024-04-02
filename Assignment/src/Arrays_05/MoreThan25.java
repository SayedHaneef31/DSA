package Arrays_05;

public class MoreThan25
{
    public static void main(String[] args)
    {
        int[] arr={1,2,2,2,2,2,2,2,2,2,3,4,5,6,7,8,9,10,11,12,12,12,12};

        int max=1;int maxfinal=1;int maxi=0;
        int i;
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                max++;
            }
            else
            {
                if(max>=maxfinal)
                {
                    maxfinal=max;
                    maxi=i;

                }

                max=1;
            }

        }
        if(max>=maxfinal)
        {
            maxfinal=max;
            maxi=i;

        }

        System.out.println("max i is="+maxi);
        System.out.println(arr[maxi]);






//
//        if(arr.length<=2) System.out.println(arr[0]);
//        int percent=(int)Math.ceil((double)arr.length/4);
//        percent++;
//        System.out.println(percent);
//        int max=1;
//        for(int i=0;i<arr.length-1;i++)
//        {
//            if(arr[i]==arr[i+1])
//            {
//                max++;
//                if(max>=percent)
//                {
//                    System.out.println(arr[i]);
//                    break;
//                }
//
//            }
//             else
//             {
//                 max=1;
//
//             }
//
//
//        }
//        System.out.println(-1);


    }

}





