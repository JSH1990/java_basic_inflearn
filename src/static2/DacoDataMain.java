package static2;

public class DacoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적호출");
        DecoData.staticCall();

        DecoData data = new DecoData();
        System.out.println("2, 인스턴스 호출1");
        data.instanceCall();

    }
}
