import java.util.*;
public class patterns{
    public static void main(String[] args) {
        int n=5;
        //solid square
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //right angled triangle (left aligned)
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //inverted right angled triangle
        for(int i=n; i>=0; i--){
            for(int j=i; j>=0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        //right angled triangle (right aligned)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //half pyramid with numbers
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //Floyd's triangle
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        //Full pyramid
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Inverted full pyramid
        for(int i=n; i>=1; i--){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Diamond Pattern = sum of full pyramid + iverted pyramid
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Butterfly pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
