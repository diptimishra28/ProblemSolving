class Main {
    static boolean areRotations(String s1, String s2){
        int n = s1.length();
        for(int i = 0; i < n; i++){
            String rotatedString = s1.substring(i + 1) + s1.substring(0 , i + 1);
            
            if(rotatedString.equals(s2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        if(areRotations(s1,s2)){
            System.out.println("Strings are rotations of each other");
        }
        else{
            System.out.println("Strings are not rotations of each other");
        }
        /**
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        if (areRotations(s1, s2)) {
            System.out.println("Strings are rotations of each other");
        } else {
            System.out.println("Strings are not rotations of each other");
        }

        sc.close();
         */
    }
}