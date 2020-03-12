import java.util.*;
class lift{
    static Scanner scn = new Scanner(System.in);
    public static void main(String []args){
        int test = scn.nextInt();
        int top = 7;
        int bottom = 0;
        while(test!=0){
            int call = scn.nextInt();
            int n1 = call - bottom;
            int n2 = top - call;
            if(n1<n2){
                System.out.println("A");
                bottom = call;
            }else if(n1==n2){
                System.out.println("A");
                bottom = call;
            }else{
                System.out.println("B");
                top = call;
            }
            test--;
        }
    }
}