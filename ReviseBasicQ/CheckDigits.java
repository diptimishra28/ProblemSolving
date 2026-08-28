public class CheckDigits {
    public static boolean onlyDigits(String s){
        // for(int i = 0; i < s.length(); i++){
        //     if(!Character.isDigit(s.charAt(i))){
        //         return false;
        //     }
        // }
        // return true;
        int digit = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                digit++;
            }
        }
        return digit == s.length();
    }
    public static void main(String[] args) {
        System.out.println(onlyDigits("1234"));
        System.out.println(onlyDigits("123d"));
    }
}
