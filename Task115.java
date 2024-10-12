public class Task115 {
    public static void main(String[] args) {
        String a = "Wow";
        String b = "Wow";
        String c = "Wow";
        String d = "Wow";

        boolean b1 = a == b; // true, because both refer to the same string literal
        boolean b2 = d.equals(b); // true, because both strings are "Wow"
        boolean b3 = !c.equals(a + "!"); // true, because "Wow" is not equal to "Wow!"

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
