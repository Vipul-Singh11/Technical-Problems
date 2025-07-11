/*Stephan is a vampire. And he is fighting with his brother Damon. Vampires get energy from human bloods, so they need to feed on human blood, killing the human beings. Stephan is also less inhuman, so he will like to take less life in his hand. Now all the people’s blood has some power, which increases the powers of the Vampire. Stephan just needs to be more powerful than Damon, killing the least human possible. Tell the total power Stephan will have after drinking the bloods before the battle.
Note : Damon is a beast, so no human being will be left after Damon drinks everyone’s blood. But Stephan always comes early in the town.
Input Format:
First line with the number of people in the town, n.
Second line with a string with n characters, denoting the one digit power in every blood.
Output Format:
Total minimum power Stephan will gather before the battle.
Constraints:
1 <= n <= 10^4
Sample input:
6   
093212
Sample output
9*/

import java.util.*;
public class problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
        	arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int num : arr) {
        	sum += num;
        }
        Arrays.sort(arr);
        int power = 0;
        for(int i=n-1; i>=0; i--) {
        	power += arr[i];
        	if(power > sum/2) {
        		System.out.print(power);
        		return;
        	}
        }
    }
}
