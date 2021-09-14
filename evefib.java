public class evefib {
    public static void main(String[] args) {
        int a,b,c;
        a=0;b=1;c=0;
        for(int i = 1 ; i<11;){
            a=b;
            b=c;
            c=a+b;
            
            if(c%2==0){
                System.out.println(c);
                 i++;
            }
            
        }
    }
}
