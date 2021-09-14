import java.util.*;
class asu 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();int c = 0; int ct = 0;
        for(int i = num+1 ;c!=5; i++)
        {
            ct=0;
         for(int j = 1 ; j<=i;j++){
             if(i%j==0)
             ct=ct+1;
         }
              if(ct==2){
              System.out.println(i);
              c=c+1; }
            
         }
        }
    }

