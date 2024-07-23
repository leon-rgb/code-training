import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the code:");
        String s = sc.nextLine(), rs="", res = ""; 
        //example s = 104101108108111
        //reversed rs = 111801801101401
        //104101108108111032119111114108100

        
        // A-Z 65-90, a-z 97-122, 32 = space
        char ch;
        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            rs = ch + rs;
        }

        int idx = 0;
        while(idx < rs.length()){
            //String sub = (idx+2>=rs.length())?  s.substring(idx, idx+1): s.substring(idx, idx+2);
            String sub = rs.substring(idx, idx+2);
            System.out.println(sub);
            if(sub.equals(new String("32"))){
                res += " ";
            }
            else if(Integer.parseInt(sub) >=65 && Integer.parseInt(sub) <91 
                || Integer.parseInt(sub) >=97 && Integer.parseInt(sub) <100) {
                res += (char) Integer.parseInt(sub);
            }
            else if((idx+2)<rs.length()){
                res += (char) Integer.parseInt(rs.substring(idx, idx+3));
                idx++;
            }
            idx+=2;
        }
        System.out.println(res);
        sc.close();
    }
}
