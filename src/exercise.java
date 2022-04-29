import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m =sc.nextInt();
//        for (int i =1;i<=n;i++){
//            for (int j=1;j<=m;j++){
//                if (i==1 || j==1 || i==n || j==m){
//                    System.out.print("*");
//                }else
//                    System.out.print(" ");
//            }
//            System.out.println();
//
//        }
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=5;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=1;i<=4;i++){
//            for (int j=1;j<=4-i;j++){
//                System.out.print("_");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=1;i<=5;i++){
//
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//
//        }
//        for (int i=5;i>=1;i--){
//
//            for (int j=1;j<=i;j++ ){
//                System.out.print(j);
//            }
//            System.out.println();
//
//        }
//        int number=1;
//        for(int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//
//        }
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                int sum =i+j;
                if ( sum % 2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }


    }
}
