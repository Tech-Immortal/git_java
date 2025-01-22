
import java.util.Scanner;
public class pattren3 {
    public static void main(String[] args) {
    Scanner myobj = new Scanner(System.in);
    System.out.print("enter the input: ");
    int n = myobj.nextInt();
    myobj.close();
        for( int i = 1; i <= n; i++ ){
            if( i % 2 != 0){
                System.out.println("*");
                
                for( int j = 1; j <= i; j++){
                    System.out.print("*");
                    
                }
            }
            else{
                System.out.println();
            }
            }
            
        }
    }
// 1
// 2
// 3
// 444
// 5
// 66666
// 7
// 8888888

