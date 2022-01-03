import  java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The value of n: ");
        int n = sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        //enter your code here
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}