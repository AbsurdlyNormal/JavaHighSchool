import java.util.*;
public class dowhile {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt(); int val = 0;
        int temp = num; int n = 0;
do{
val=num%10; //121
num=num/10;
n = n *10 + val;
}while(num>0);
if(temp==n){
    System.out.println("yes");
}
    }
}
