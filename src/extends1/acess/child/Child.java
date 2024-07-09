package extends1.acess.child;

import extends1.acess.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 1; //상속관계 or 같은패키지
        //defaultValue = 1; //다른패키지접근불가, 컴파일 오류
        //privateValue = 1; //접근불가, 컴파일 오류
        publicMethod();
        protectedMethod(); //상속 관계 or 같은 패키지

    }
}
