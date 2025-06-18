/*Given an unsorted array, remove duplicates from the array.
Test Case :
Input: arr[]={2,3,1,9,3,1,3,9}
Output:  {2,3,1,9}*/

import java.util.*;
public class Problem8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of arr elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter the array element :");
			arr[i] = sc.nextInt();
		}
		Set<Integer> set = new LinkedHashSet<>();
		for(int num: arr) {
			set.add(num);
		}
		int i=0;
		int[] res = new int[set.size()];
		for(int num: set) {
			res[i++] = num;
		}
		System.out.println("Arr : " + Arrays.toString(res));
	}
}
