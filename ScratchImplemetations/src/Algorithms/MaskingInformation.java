package Algorithms;

/**
 * https://leetcode.com/problems/masking-personal-information/
 * MaskingInformation
 */
public class MaskingInformation {

    public static void main(String[] args) {
        maskInfo("AlohasnaCkbar@gmail.com");
        maskInfo("+123 456 789 1011");
        maskInfo("+11 456 789 1011");
    }

    public static String maskInfo(String str) {
        String emailRegex = "^[A-Za-z]{2,}@[A-Za-z]{2,}\\.[A-Za-z]{2,}$";
        

        if (str.matches(emailRegex)) {
            //System.out.println("Email detected");
            int lastChar = str.indexOf("@");
            String maskName = str.substring(0,1).toLowerCase()+"*****"+str.substring(lastChar-1, lastChar)
                                    +str.substring(lastChar).toLowerCase();
            System.out.println(maskName);
            return maskName;
        } else {
            String phoneMask;
            String phoneNumber = str.replaceAll("\\D", "");
            System.out.println(phoneNumber);
            
            if (phoneNumber.length()>=10 && phoneNumber.length()<=13) {
                System.out.println("Valid phone number");
            }
        }

        return null;
    }
}