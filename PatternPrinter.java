import java.util.Scanner;
class PatternPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        patternPrinter(n);
    }
    static void patternPrinter(int n) {
        // write your code here
        for(int i=n;i>=1;i--){
            for(int j=n;j>=1;j--){
                int k=0;
                while(k<i) {
                    System.out.print(j);
                    k++;
                }
            }
            System.out.println();
        }
    }
}
