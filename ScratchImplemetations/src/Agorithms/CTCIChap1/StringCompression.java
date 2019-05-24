package Agorithms.CTCIChap1;

/**
 * StringCompression
 */
public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compressThiString("acbbcccccc"));
    }

    public static String compressThiString(String str){
        char[] strArray=str.toCharArray();

        StringBuilder sb = new StringBuilder();

        int j=1;

        for (int i = 1; i < strArray.length; i++) {
            if (strArray[i]==strArray[i-1]) {
                j++;
            } else{
                sb.append((char)strArray[i-1]+""+j);
                j=1;
            }
        }
        sb.append((char)strArray[strArray.length-1]+""+j);
        //System.out.println(sb.toString());
        if(strArray.length<=sb.length()){
            return str;
        }
        return sb.toString();

    }
}