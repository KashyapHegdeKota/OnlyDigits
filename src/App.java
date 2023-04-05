import java.util.ArrayList;

public class App {
    /*
     * Write a program that checks whether the given string
     * contains only digits.
     */
    public static boolean onlyDigits(String s){
        ArrayList<Character> list = new ArrayList<Character>();
        boolean isDigit = true;
        //Adding characters to an ArrayList
        for(int i=0;i<s.length();i++){
            if(!(s.charAt(i)==' ')){
                list.add(s.charAt(i));
            }
        }
        
        //Iterating through the ArrayList and checking if it is digit
        for(int j = 0;j<list.size();j++){
            char test = ' ';
            test = list.get(j);
            if(!(Character.isDigit(test))){
                isDigit=false;
            }
        }
        return isDigit;
    }
    public static void main(String[] args) throws Exception {
        String s = "1234567a89";
        System.out.println(onlyDigits(s));
    }
}
