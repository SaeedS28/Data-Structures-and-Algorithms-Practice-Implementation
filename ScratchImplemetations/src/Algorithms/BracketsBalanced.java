package Algorithms;
import DS.StackAndQueue.ArrayedStack;   // My own implementation

/**
 * BracketsBalanced
 */
public class BracketsBalanced {

    public static void main(String[] args) {
        String str1 = "{[Saad]][[(({";
        isBalanced(str1);
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
            int iter = open.indexOf(stc[i]);
            if(iter != -1){
                container.push(stc[i]);
            }
        }

        System.out.println(container.toString());

        return false;
    }
}