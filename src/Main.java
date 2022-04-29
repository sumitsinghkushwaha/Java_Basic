import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        -------------------------------------------------------
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Press 1 : + (Addition) a + b\n" +
                "Press 2 : - (Subtraction) a - b\n" +
                "Press 3 : * (Multiplication) a * b\n" +
                "Press 4 : / (Division) a / b\n" +
                "Press 5 : % (Modulo or remainder) a % b\n");
        int operation= sc.nextInt();

        switch (operation){
            case 1: int sum=a+b;
                System.out.println(sum);
                break;
            case 2:int diff=a-b;
                System.out.println(diff);
                break;
            case 3:int multi=a*b;
                System.out.println(multi);
                break;
            case 4:int div=a/b;
                System.out.println(div);
                break;
            case 5:int rem=a%b;
                System.out.println(rem);
                break;
            default:
                System.out.println("Invalid operation");
        }
//        int button= sc.nextInt();
//        if (button==1){
//            System.out.println("Hello");
//        } else if (button == 2) {
//            System.out.println("Namaste");
//        } else if (button == 3) {
//            System.out.println("Bonjour");
//        }
//        else {
//            System.out.println("Invalid button");
//        }

//        switch (button){
//            case 1:
//                System.out.println("Hello");
//                break;
//            case 2:
//                System.out.println("namaste");
//                break;
//            case 3:
//                System.out.println("Bonjour");
//                break;
//            default:
//                System.out.println("Invalid button");
//        }

//        int b= sc.nextInt();
//        if (a==b){
//            System.out.println("equal");
//        } else if (a > b) {
//            System.out.println("a is greater");
//        }
//        else {
//            System.out.println("a is less");
//        }
//        if(a>=18){
//            System.out.println("Adult");
//        }
//        else System.out.println("Not adult");
//        System.out.println(name);

//        System.out.println("Hello world!....");
    }
}