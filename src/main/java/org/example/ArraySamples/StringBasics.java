package org.example.ArraySamples;

public class StringBasics {
    public static void main(String[] args) {
        String name = " haaangyifh khu";
        System.out.println(name.trim());
        char arr[]=name.toCharArray();
        String namings="my name is kuhu";
        String words[]=namings.split(" ");
        for(String word:words){
            System.out.println(word);
        }
        int num=124;
        String str=String.valueOf(num);
        System.out.println(str);
        //print each character
        String prac="ammiaki";
        printEachChar(prac);
        countLengthStr(prac);
        palindromeCheck(prac);
        System.out.println("count of conso :"+ contConsonants(prac));
        frequencyOfCharac(prac);
        onlyDigitOrNot();
        System.out.println("number of words : "+ countWords());
    }

    private static void palindromeCheck(String prac) {
        //reverse String;
        String rev="";
        for(int i = 0; i< prac.length(); i++){
            rev= prac.charAt(i)+rev;
        }
        System.out.println("reverse name: "+ rev);
        String result= prac.equals(rev)? "yes Pal" : "no pal";
        System.out.println(result);
    }

    private static void countLengthStr(String prac) {
        //count length of string;
        int count=0;
        for(int i = 0; i< prac.length(); i++){
            if(prac.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("count of str: "+ count);
    }

    private static void printEachChar(String prac) {
        for(int i = 0; i< prac.length(); i++){
            char ch= prac.charAt(i);
            System.out.println(ch);
        }
    }
    public static int contConsonants(String prac){
        int count=0;
        for(int i=0;i<prac.length();i++){
            char ch=prac.charAt(i);
            if(ch!='a'&& ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
                count++;
            }
        }
        return count;
    }
    public static void frequencyOfCharac(String prac){
        char ch='i';
        int count=0;
        for(int i=0;i<prac.length();i++){
            if(prac.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("i occured "+count+" times");
    }
    public static void onlyDigitOrNot(){
        boolean isDigit=true;
        String value="12345";
        for(int i=0;i<value.length();i++){
            char ch=value.charAt(i);
            if(ch<'0' || ch>'9'){
                isDigit=false;
                break;
            }
//            if(Character.isDigit(ch)){
//                isDigit = false;
//                break;
//            }
        }
        System.out.println(isDigit);
    }
    public static int countWords(){
        String place = "domkal ram kol";
        String words[]=place.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++){
            count++;
        }
        return count;
    }
}
