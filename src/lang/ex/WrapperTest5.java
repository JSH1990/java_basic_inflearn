package lang.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
로또 번호 자동 생성기

문제설명
1. 로또 번호를 자동으로 만들어주는 자동 생성기를 만들자
2. 로또 번호는 1~45 사이의 숫자를 5개 뽑아야한다.
3. 각 숫자는 중복되면 안된다.
4. 실행할때 마다 결과가 달라야한다.

로또번호 : 11 19 29 13 20 10

필요한 클래스
로또 생성기

 */
public class WrapperTest5 {
    public static void main(String[] args) {
        GeneratorLotto generatorLotto = new GeneratorLotto();
        int[] lottoNumbers = generatorLotto.generate();

        for (long l : lottoNumbers) {
            System.out.print(l + " ");

        }


    }
}
