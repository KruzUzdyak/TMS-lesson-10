package strings;

public class StringBuilderMain {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("{");
        String[] array = {"cat", "dog", "bird", "fish"};

        String sum = "";
        for (String s: array) {
            sum += s;
            sb.append(s);
            sb.append(", ");
        }
        sb.replace(sb.length()-2, sb.length(), "}");

        System.out.println(sum);
        System.out.println(sb);
        System.out.println(sb.reverse());

        sb.reverse();
        System.out.println(sb.insert(6, "cow, "));
        System.out.println("char at 0: " + sb.charAt(0));
        sb.setCharAt(0, '/');
        System.out.println("setCharAt 0: " + sb);

        System.out.println(sb.delete(6, 11));

        StringBuilder reversed = new StringBuilder(sb);
        reversed.reverse();
        System.out.println("old " + sb);
        System.out.println("reversed " + reversed);

        method(reversed);
        System.out.println("reversed 2nd: " + reversed);
    }

    private static void method(StringBuilder sb) {
        sb.reverse();
    }


}
