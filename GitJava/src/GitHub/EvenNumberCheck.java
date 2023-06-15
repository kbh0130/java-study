package GitHub;

public class EvenNumberCheck {

	public String EvenCheck(int num) {
		String st = "";
		if (num % 2 == 0) {
			st = "짝수";
		} else {
			st = "홀수";
		}
		String answer = st;
		return answer;
	}

	public static void main(String[] args) {
		EvenNumberCheck ev = new EvenNumberCheck();
//    	구하는 숫자 값
		int i = 6;

		System.out.println(ev.EvenCheck(i));
//    	깃허브 업데이트 확인용 입니다    	
//    	github practice!!
	}
}
//