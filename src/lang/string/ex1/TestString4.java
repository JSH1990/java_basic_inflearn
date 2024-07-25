package lang.string.ex1;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String fileName = str.substring(str.lastIndexOf("\\") + 1);
        String extName = fileName.substring(fileName.lastIndexOf(".") + 1);
        System.out.println(fileName);
        System.out.println(extName);
    }
}
