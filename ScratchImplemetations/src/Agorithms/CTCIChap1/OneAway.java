package Agorithms.CTCIChap1;

/**
 * OneAway
 */
public class OneAway {
    public static void main(String[] args) {
        System.out.println(isOneOrZeroEditsAway("Saad", "Saad"));   // returns true because strings are same
        System.out.println(isOneOrZeroEditsAway("Sasd", "Snad"));   // returns false because 2 edits, even though same length
        System.out.println(isOneOrZeroEditsAway("Saadss", "Saads"));   // returns false because diff of abs of their lengths is >1
        System.out.println(isOneOrZeroEditsAway("duck", "ducas"));  // returns false because of a deletion and a modfication
    }

    public static boolean isOneOrZeroEditsAway(String a, String b) {
        String shorter, longer;
        int differences=0;
        int j=0;

        if(a.equals(b)){    //equal
            return true;
        } else if(a.length()==b.length()){  //same length
        //    System.out.println("Same length");
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i)!=b.charAt(i)) {
                    ++differences;
        //            System.out.println("Differences incremented to: "+differences);
                    if(differences>1) return false;
                }
            }
            return true;
        } else if(Math.abs(a.length()-b.length())==1){ // indel
            int i=0;

            if(a.length()<b.length()){
                shorter = new String(a);
                longer = new String(b);
            } else{
                shorter = new String(b);
                longer = new String(a);
            }

            while (j<shorter.length()) {
                if (shorter.charAt(j)!=longer.charAt(i)) {
                    ++differences;
                //    System.out.println("Differences incremented to: "+differences);
                    if(differences>1) return false;
                    ++i;
                }
                if (shorter.charAt(j)==longer.charAt(i)) {
                    i++;
                    j++;
                }
            }
            return true;
        }
        return false;
    }
}