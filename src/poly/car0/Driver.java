package poly.car0;

public class Driver {
    private K3Car k3Car; // 초기값은 null이고, 메인에서 만든 k3Car(0x200)번지를 넣기위해 만듦.
    private Model3Car model3Car;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car; //위에 k3Car 변수를 0x200 번지를 넣어 K3Car와 연결시킴
    }

    public void setKModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car; //위에 k3Car 변수를 0x200 번지를 넣어 K3Car와 연결시킴
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        if( k3Car != null){
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        }else if(model3Car != null){
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }

    }


}
