package GitHub;

public class PrintStar {

	public static void main(String[] args) {

//		String s = " ";
//		h = 별 피라미드를 몇층 쌓을 것인가!
		int h = 5;
		int star = 1;
//		mm = 맨 밑의 줄 별의 갯수
		int mm = h * 2 - 1;

		mm = mm / 2;
//		int mmb = mm - 2;
//
		for (int i = 0; i < h; i++) {

			for (int i2 = 0; i2 < mm - i; i2++) {
				System.out.print(" ");
//		System.out.print(i2);
			}
			for (int i3 = 0; i3 < star; i3++) {
				System.out.print("★");
			}
			System.out.println("");
			star = star + 2;
		}

	}

}
