import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0 && n%3==0){
            flag = false;
        }
        if(flag){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
        sc.close();
    }
}
