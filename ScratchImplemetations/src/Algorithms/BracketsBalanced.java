package Algorithms;
import DS.StackAndQueue.ArrayedStack;   // My own implementation

/**
 * BracketsBalanced
 */
public class BracketsBalanced {

    public static void main(String[] args) {
        String str1 = "{Saad}";
        System.out.println(isBalanced(str1));
        System.out.println(isBalanced("{}{}()[]"));
        System.out.println(isBalanced("{Saad}{Saeed}(is)[weird]"));
        System.out.println(isBalanced("mismatch right here []{]"));
    }

    public static boolean isBalanced(String str) {
        if (str.length()==0) {
            return true;
        }
        
        if (str==null) {
            return false;
        }

        String open = "([{";
        String close = ")]}";
        ArrayedStack<Character> container = new ArrayedStack<>();
        char[] stc = str.toCharArray();

        for (int i = 0; i < stc.length; i++) {

            // pushes an opening bracket into the stack
            int opener = open.indexOf(stc[i]);
            int closer = close.indexOf(stc[i]);
            if(opener != -1){
                container.push(stc[i]);
            }
            else if (closer != -1) {
                // closing bracket encountered but nothing in the stack
                if(container.isEmpty()){
                    System.out.println("Empty container");
                    return false;
                }
                char popped = container.pop();
                
                // mismatch
                if (open.indexOf(popped) != closer) {
                    return false;
                }
            }
        }
        if (!container.isEmpty()) {
            return false;
        }

        return true;
    }
}