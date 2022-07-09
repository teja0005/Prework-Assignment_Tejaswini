import java.util.Scanner;
class MissingNumberFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in .nextInt();
        int[] arr = new int[size-1];
        for(int i=0;i<size-1;i++)
            arr[i] = in.nextInt();
        System.out.println(missingNumberFinder(arr, size));
    }
    static int missingNumberFinder(int array[], int n) {
        // write your code here
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j:array){
                if(i==j){
                    count+=1;
                }
            }
            if(count==0 && n>1) return i; //if n=1, then we should return no missing number i.e. 0
        }
        return 0;
    }
}
