package ex1;

public class MaxCounter {
    private int count = 0; //내부에서 사용하는 숫자. 초기값은 0

    private int max; //최대값. 생성자를 통해 입력한다.

    public MaxCounter(int max) {
        this.max = max;
    }


    //숫자를 하나 증가시키는 메서드
    public void increment(){
        if(count >= max){
            System.out.println("최대값을 초과할수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount(){
        return count;
    }
}
