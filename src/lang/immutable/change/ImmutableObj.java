package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    //final은 변경을 못하기때문에 새로운객체를 만들어 값을 변경한다.
    public ImmutableObj add(int addValue){
        int result = value + addValue;
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }

}
