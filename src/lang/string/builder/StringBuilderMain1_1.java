package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        //StringBuilder는 변하는문자열
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");
        System.out.println(sb);

        sb.insert(4, "java");
        System.out.println(sb);

        sb.delete(4,8);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String string = sb.toString();
        System.out.println(string);

    }
}
