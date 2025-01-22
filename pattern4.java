import java.util.Scanner;  
public class pattern4 {
        public static void main(String[] args) {
            Scanner myobj = new Scanner(System.in);
            System.out.print("enter the input: ");
            int n = myobj.nextInt();
            int count = 0;
            for( int i = 1 ; i <= n; i++ ){
                for( int j = 1 ; j <= n-count; j++ ){
                    System.out.print(+j);

            }
            System.out.println();
            count++;
        }
    }
}


