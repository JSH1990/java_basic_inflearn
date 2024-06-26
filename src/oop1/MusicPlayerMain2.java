package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 on
        on(data);

        //볼륨증가
        volumeUp(data);

        //볼륨증가
        volumeUp(data);

        //볼륨감소
        volumeDown(data);

        //음악 플레이어 상태
        off(data);

    }

    //음악 플레이어 끄기
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료 합니다.");
    }

    //음악 플레이어 켜기
    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악플레이어 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악플레이어 볼륨 : " + data.volume);
    }

    static void showStatus(MusicPlayerData data){
        if (data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        }else {
            System.out.println("음악 플레이어 OFF");
        }
    }


}
