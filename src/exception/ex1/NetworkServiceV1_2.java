package exception.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(data); //추가


        String connectResult = client.connect(); //여기가 success로 들어옴
        //결과가 성공이 아니다. -> 오류다.
        if(isError(connectResult)){ //connectResult가 에러면 아래코드 실행
            System.out.println("[네트워크 연결 오류 발생] 오류 코드 : " + connectResult);
            return; //에러 발생시 메서드진행하지않고, sendMessage 메서드밖으로 나가버림
        }

        String sendResult = client.send(data);
        System.out.println(sendResult);
        //여길타야한다.
        if(isError(connectResult)){
            System.out.println("[네트워크 전송 오류 발생] 오류 코드 : " + sendResult);
            return; //에러 발생시 메서드진행하지않고, sendMessage 메서드밖으로 나가버림
        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }


}
