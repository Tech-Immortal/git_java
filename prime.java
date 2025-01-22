import java.util.Scanner;
public class prime {
    public static void main(String[] args){
    int count = 0;
    Scanner myobj = new Scanner(System.in);
    System.out.print("enter the value of lower limit : ");
    int x = myobj.nextInt();
    System.out.print("enter the value of upper limit: ");
    int y = myobj.nextInt();
    System.out.print("enter the number of prime numbers you want: ");
    int n = myobj.nextInt();

        myobj.close();
    if ( x < 0 | y < 0 | y-x < 1) {
        System.out.println("invalid input");
        count++;
    } 
    else {
    for (int i=x ; i < y; i++){
        if ( i == 2 | i == 3 | i == 5 | i == 7 | i == 11){
            System.out.println("prime no.s are "+i);
            count++;
        }
        if( i % 2 == 0 | i % 3 == 0 | i % 5 == 0 | i % 7 == 0 | i % 11 == 0 | i % 17 == 0){
           continue; 
        } 
        else {
            if (count == n){
            break;
        }
            System.out.println("prime no.s are "+i);
            count++;
            }
        }
    }
    if (count == 0 ){
        System.out.println("no prime no.s in between ");
    }
}
    }


