import java.util.Scanner;
class FirstLetterPrinter {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(firstLetterPrinter(input));
    }
    static String firstLetterPrinter(String str) {
        // write your code here
        String res="";
        String[] s=str.split(" ");
        for(String i:s){
            res+=i.charAt(0);
        }
        return res;

    }
}
