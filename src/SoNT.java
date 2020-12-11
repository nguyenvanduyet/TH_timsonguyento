import java.util.Scanner;

public class SoNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = sc.nextInt();
        boolean flag=true;

        if (number <= 1) {
            System.out.println(number + "không phải số nguyên tố");
        } else if (number == 2) {
            System.out.println(number+"là số nguyên tố");
        }else {
            for (int i=2; i<number-1;i++){
                if (number%i==0){
                    System.out.println(number+"không phải số nguyên tố");
                    flag=false;
                }
            }
            if (flag==true)
            System.out.println(number+"là số nguyên tố");
        }
    }
}
