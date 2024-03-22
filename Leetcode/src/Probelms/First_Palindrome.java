package Probelms;

public class First_Palindrome {

	public static void main(String[] args) {
		String[] temp = {"abc","car","ada","racecar","cool"};
		System.out.println(firstPalindrome(temp));
	}
	public static String firstPalindrome(String[] words) {
//        for(String i: words){
//            StringBuilder temp = new StringBuilder(i).reverse();
////            System.out.println(temp);
//            if(i.equals(temp.toString())){
//                return i;
//            }
//        }
//        return "dummy";
		
		for(String i: words){
            StringBuilder temp= new StringBuilder();
            byte len = (byte)i.length();
            for(int j = len -1 ;j>=0;j--){
                temp.append(i.charAt(j));
            }
            if((temp.toString()).equals(i)){
                return i;
            }
        }
        return "dummy";
    }
}
