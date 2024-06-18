public class java_proctice_3 {
    public static void main(String[] args) {
        String a = "abcd efg hij";
        a = a.replace(" ", "_");
        System.out.println(a);
        String letter = "Dear <|name|>, thanks alot!";
        System.out.println(letter.replace("<|name|>", "friend"));
        System.out.println(letter.indexOf(" "));
        System.out.println(letter.indexOf("  "));
    }
}
