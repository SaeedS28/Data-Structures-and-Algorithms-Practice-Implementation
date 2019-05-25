package Agorithms.CTCIChap1;

/**
 * OneAway
 */
public class OneAway {
    public static void main(String[] args) {
        System.out.println(isOneOrZeroEditsAway("Saad", "Saad"));   // returns true because strings are same
        System.out.println(isOneOrZeroEditsAway("Sasd", "Snad"));   // returns false because 2 edits, even though same length
        System.out.println(isOneOrZeroEditsAway("Saadss", "Saads"));   // returns false because diff of abs of their lengths is >1
    }

    public static boolean isOneOrZeroEditsAway(String a, String b) {
        String shorter, longer;
        int differences=0;
        int j=0;

        if(a.equals(b)){    //equal
            return true;
        } else if(a.length()==b.length()){  //same length
            System.out.println("Same length");
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i)!=b.charAt(i)) {
                    ++differences;
                    System.out.println("Differences incremented to: "+differences);
                    if(differences>1) return false;
                }
            }
            return true;
        }

        return false;
    }
}