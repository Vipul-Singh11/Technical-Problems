/*An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :
Input :
200  -> Value of V
540   -> Value of W
Output :
TW =130 FW=70*/

import java.util.*;
public class problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter v:");
        int v = sc.nextInt();
        System.out.println("enter w:");
        int w = sc.nextInt();
        int fw = (w-2*v)/2;
        int tw = v-fw;
        System.out.println("No of two wheelers: " + tw);
        System.out.println("No. of four wheelers:" + fw);
    }
}
