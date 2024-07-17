package poly.ex4.ex3;

public class PayService {

    public void processPay(String option, int amount){

        Pay pay;

        boolean result;
        System.out.println("결제를 시작합니다.: option=" + option + ", amount=" + amount);

        Pay naverPay = new NaverPay();
        Pay kakaoPay = new KakaoPay();

        if(option.equals("naver")){
            naverPay.pay(amount);
            System.out.println();
        }else if(option.equals("kakao")){
            kakaoPay.pay(amount);
            System.out.println();
        }else{
            result = false;
        }










//        if(option.equals("kakao")){
//            KakaoPay kakao = new KakaoPay();
//            result = kakao.pay(amount);
//        }else if(option.equals("naver")){
//            NaverPay naver = new NaverPay();
//            result = naver.pay(amount);
//        }else {
//            System.out.println("결제 수단이 없습니다.");
//            result = false;
//        }

//        if (result){
//            System.out.println("결제가 성공했습니다.");
//        }else{
//            System.out.println("결제가 실패했습니다.");
//        }
    }

}
