import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        for(int i  = X ; i <= Y ; i++){
        for(int j = 1 ; j <= 10 ; j++){
            System.out.print(i*j+ "\t"); }
            System.out.println();
        }
        }
    }
