package Algorithms;

/**
 * https://leetcode.com/problems/masking-personal-information/
 * MaskingInformation
 */
public class MaskingInformation {

    public static void main(String[] args) {
        maskInfo("AlohasnaCkbar@gmail.com");
        maskInfo("456 789 1011");
        maskInfo("1888 999 7074");
        maskInfo("62 (888)-999-7074");
        maskInfo("62 (888)-999-701(74)");
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
            String phoneMask=null;
            String phoneNumber = str.replaceAll("\\D", "");
            System.out.println(phoneNumber);
            
            if (phoneNumber.length()>=10 && phoneNumber.length()<=13) {
                System.out.println("Valid phone number");
                if (phoneNumber.length()==10) {
                    phoneMask="***-***-"+phoneNumber.substring(6);
                    System.out.println(phoneMask);
                }
                else if (phoneNumber.length()==11) {
                    phoneMask="+*-***-***-"+phoneNumber.substring(7);
                    System.out.println(phoneMask);
                }
                else if (phoneNumber.length()==12) {
                    phoneMask="+**-***-***-"+phoneNumber.substring(8);
                    System.out.println(phoneMask);
                }
                else if (phoneNumber.length()==13) {
                    phoneMask="+***-***-***-"+phoneNumber.substring(9);
                    System.out.println(phoneMask);
                }
                return phoneMask;
            } else {
                System.out.println("Invalid Phone number");
                return null;
            }
        }
    }
}