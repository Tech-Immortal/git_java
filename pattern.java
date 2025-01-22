import java.util.Scanner;  
public class pattern {
        public static void main(String[] args) {
            Scanner myobj = new Scanner(System.in);
            System.out.print("enter the input: ");
            int n = myobj.nextInt();
            for( int i = 1 ; i <= n; i++ ){
                for (int j = 0; j < i; j++){
                    System.out.print(+i);
                }
                System.out.println();
            }
            // for( int i = 1 ; i <= n; i++ ){
            //     for (int j = 1; j <= i; j++){
            //         System.out.print(+j);
            //     }
            //     System.out.println();
            // } 
            //     1
            //     12
            //     123
            //     1234
            //     12345
        }
}
