public class Main
{
    public static String removefirstChar(String str, String start)
    {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (str.startsWith(start)) {
            return str.substring(1);
        }
        return str;
    }
    public static void main(String[] args)
    {
        String str = "ABC";
        String start = "A";

        System.out.println(removefirstChar(str, start));
    }
}