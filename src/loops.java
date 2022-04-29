import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        for (int counter=1; counter < 11;counter=counter+1){
//            System.out.println(counter);
//        }
//        int i=1;
////        while (i< 11){
////            System.out.println(i);
////            i++;
//////        }
//        do {
//            System.out.println(i);
//            i++;
//        }while (i<11);
//    }
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i=1;i<=n;i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
////            else System.out.println();
//        }
//        for(; ;) {
//            System.out.println("Apna College");
//        }
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            int marks = sc.nextInt();
            if (marks <= 100 && marks >= 91) {
                System.out.println("This is good");
            } else if (marks >= 60 && marks <= 90) {
                System.out.println("This is also good");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("This is also good");
            } else {
                System.out.println("Invalid marks");
            }
                System.out.println("Want to continue if yes press 1\n if no press 0\n");
                input=sc.nextInt();
            }
            while (input == 1) ;






//        for (int i = 1; i <= 10; i++) {
//
//            System.out.println(n+"x"+i+"="+n*i);
//        }
//        System.out.println("Total:");
//        System.out.println(sum);
    }
}
