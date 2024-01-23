package strings;

public class CheckRotation {

    public static void main(String[] args) {
        String input1 = "JavaJ2eeStrutsHibernate";
        String input2 = "StrutsHibernateJavaJ2ee";
        if(areRotations(input1,input2))
            System.out.println("The two strings are Rotated ");
        else
            System.out.println("Not rotated ");
    }
    public static boolean areRotations(String str1, String str2) {
        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        // Concatenate the first string with itself
        String concatenatedStr = str1 + str1;

        return concatenatedStr.contains(str2);
    }
}