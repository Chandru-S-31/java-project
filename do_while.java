import java.util.Scanner;
class do_while {
    public static void main(String args[]){
     Scanner sca = new Scanner(System.in);
     int count=0;
     do{
        System.out.print("enter the number >10 :" );
        count=sca.nextInt();
     }
     while(count<10);
    }
}
