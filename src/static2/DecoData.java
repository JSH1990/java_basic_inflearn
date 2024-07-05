package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        //intstanceValue++ //인스턴스 변수 접근 x
        //instanceMethod(); //인스턴스 메서드 접근 x
        staticValue++;
        staticMethod();
    }

    public void instanceCall(){
        instanceValue++; //인스턴스 변수 접근 x
        instanceMethod(); //인스턴스 메서드 접근 x
        staticValue++;
        staticMethod();
    }



    private void instanceMethod(){
        System.out.println("int value = " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("static int value = " + staticValue);
    }
}
