package Agorithms.CTCIChap1;

/**
 * OneAway
 */
public class OneAway {
    public static void main(String[] args) {
        System.out.println(isOneOrZeroEditsAway("Saad", "Saad"));   // returns true because strings are same
        System.out.println(isOneOrZeroEditsAway("Saadss", "Saads"));   // returns false because diff of abs of their lengths is >1
    }

    public static boolean isOneOrZeroEditsAway(String a, String b) {
        String shorter, longer;

        if(a.equals(b)){
            return true;
        } else if(Math.abs(a.length()-b.length())>1){
            System.out.println("off by > 1");
            return false;
        }

        return false;
    }
}