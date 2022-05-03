package com.company;

public class Main {

    public static void main(String[] args) {
        elStringo(new String[]{"vamos!!", "quiero dormir", "si y no", ""});
    }

    /**
     * lesson practice
     * @param strings
     * @return true - if array contain strings with more than 1 word or the word finshed with ! or a
     */
    public static boolean elStringo(String[] strings) {
        for (String str: strings) {
            if(str == null)
                return false;
            if(str.charAt(str.length()-1) == '!' || str.charAt(str.length()-1) == 'a')
                return true;
            //missing another check of the words in the array
        }
        //
        return true;
    }
}
