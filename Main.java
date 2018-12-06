public class Main {

    public static void main(String[] args) {

        int perfectSq[];
        perfectSq = new int[10];

        int i = 0;
        for (i = 0; i<10; i++){
            perfectSq[i] = (i+1)*(i+1);
        }

        System.out.println("First 10 Square Numbers: " + perfectSq[0] + " " + perfectSq[1] + " " + perfectSq[2] + " " + perfectSq[3] + " " + perfectSq[4] + " " + perfectSq[5] + " " + perfectSq[6] + " " + perfectSq[7] + " " + perfectSq[8] + " " + perfectSq[9]);

        int perfectCube[];
        perfectCube = new int[10];

        for (i = 0; i<10; i++){
            perfectCube[i] = (i+1)*(i+1)*(i+1);
        }
        System.out.println("First 10 Cube Numbers: " + perfectCube[0] + " " + perfectCube[1] + " " + perfectCube[2] + " " + perfectCube[3] + " " + perfectCube[4] + " " + perfectCube[5] + " " + perfectCube[6] + " " + perfectCube[7] + " " + perfectCube[8] + " " + perfectCube[9]);

        int fibonacciSeq[];
        fibonacciSeq = new int[10];

        int sum = 0;

        fibonacciSeq[0] = 1;
        fibonacciSeq[1] = 2;

        for (i = 2; i<10; i++){
            while (i == 10){
                break;
            }
            fibonacciSeq[i] = fibonacciSeq[i-1]+fibonacciSeq[i-2];
        }
        System.out.println("First 10 Fibonacci Numbers from 1: " + fibonacciSeq[0] + " " + fibonacciSeq[1] + " " + fibonacciSeq[2] + " " + fibonacciSeq[3] + " " + fibonacciSeq[4] + " " + fibonacciSeq[5] + " " + fibonacciSeq[6] + " " + fibonacciSeq[7] + " " + fibonacciSeq[8] + " " + fibonacciSeq[9]);

        System.out.print("First 10 Prime Numbers: ");
        for (int num = 2; num < 30; num++) {
            boolean flag = false;
            for (i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.printf("%d ", num);
        }

        int triangleNum[];
        triangleNum = new int[10];

        triangleNum[0] = 1;
        System.out.println();
        System.out.print("First 10 Triangle Numbers: ");

        for(i = 1; i < triangleNum.length; i++) {
            triangleNum[i] = triangleNum[i - 1] + 1 + i;
        }
        for(i = 0; i < triangleNum.length; i++) {
            System.out.printf("%d ", triangleNum[i]);
        }

    }
}
