package oop1;

public class MusicPlayer {
    private int volume = 5;
    private boolean isOn = false;


    public void getVolume() {
        System.out.println("volume is " + volume);
    }

    public void setVolume(int volume) {
        System.out.println("volume is " + volume);
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    //음악 플레이어 끄기
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료 합니다.");
    }

    //음악 플레이어 켜기
    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void volumeUp(){
        volume++;
        System.out.println("음악플레이어 볼륨 : " + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("음악플레이어 볼륨 : " + volume);
    }

   void showStatus(){
        if (isOn){
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        }else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
