package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else

        int hour = 10;

        if (hour < 14) { // 오후 2시 이전이면
            System.out.println("아이스 아메리카노 +1");
        } else { // 그 외의 경우이면
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료 #1");
    }
}
