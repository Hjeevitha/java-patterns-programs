package patterns;

public class combine_left_right_upper_traingle {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if((i>=j && j<=n) || (i+j>=n*2 && j>n)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}

	}
}
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	System.out.println("-----------1.combination of upper traingles---------------------------------------------");
//	int n=10;
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=n*2-1;j++) {
//			if(i>=j||i+j>=n*2) {
//				System.out.print("* ");
//			}
//			else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//	}
//}