package src.start.labs.funcs;


public class funcString {
    public static void main(String[] args) {

        String original = "abcde FGHIJK ABC abc DEFG    ";
        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2);
        String s5 = original.substring(2, 11);
        String s6 = original.replace('a', 'T');
        String s7 = original.replace("abc", "tudo");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");


        System.out.println(original);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(i);
        System.out.println(j);


    }
}
