
public class piramid {
    public static void main(String[] args)
     {
        for(int i = 5 , c = 1; i >= 1 ; i-- , c++)
        {
            for(int j = i ; j> 1 ; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=c  ;k++ ){
                System.out.print("* ");

            }
            System.out.println();


        
        }
    }
}
