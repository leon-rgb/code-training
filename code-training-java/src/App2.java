import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
    
        //PPPPP@PPPP@PPP$PP
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string of people:");
        String s = sc.nextLine();

        String[] sa = s.split("\\$");
        int min = Integer.MAX_VALUE;
        for (String p : sa) {
            String[] tmp = p.split("\\@");
            for (String string : tmp) {
                if (string.length() < min){
                    min = string.length();
                }
            }
        }
        System.out.println(min);
    }
}
