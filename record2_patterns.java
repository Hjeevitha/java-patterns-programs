package patterns;

public class record2_patterns {

	public static void main(String[] args) {
		System.out.println("-----------1.primary diagonal---------------------------------------------");
		int n1=4;
		for(int i=1;i<=n1;i++) {
			for(int j=1;j<=n1;j++) {
				if( i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------2.secondary diagonal---------------------------------------------");
		int n2=4;
		for(int i=1;i<=n2;i++) {
			for(int j=1;j<=n2;j++) {
				if( i+j==n2+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------3.upward arrow---------------------------------------------");
		int n3=4;
		for(int i=1;i<=n3;i++) {
			for(int j=1;j<=n3;j++) {
				if( i==1||j==1||i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------4.downward arroe---------------------------------------------");
		int n4=4;
		for(int i=1;i<=n4;i++) {
			for(int j=1;j<=n4;j++) {
				if(i==j||j==n4||i==n4) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------5.---------------------------------------------");
		int n5=4;
		for(int i=1;i<=n5;i++) {
			for(int j=1;j<=n5;j++) {
				if(i==j||i==1||i==n5||j==1||j==n5) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------6.combinatinal diagonal---------------------------------------------");
		int n6=5;
		for(int i=1;i<=n6;i++) {
			for(int j=1;j<=n6;j++) {
				if(i==j||i+j==n6+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------7.box---------------------------------------------");
		int n7=5;
		for(int i=1;i<=n7;i++) {
			for(int j=1;j<=n7;j++) {
				if(i==j||i+j==n7+1||i==1||i==n7||j==1||j==n7) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------8.left upper traingle---------------------------------------------");
		int n8=5;
		for(int i=1;i<=n8;i++) {
			for(int j=1;j<=n8;j++) {
				if(i>=j) {
					System.out.print("* ");
				}
			
			}
			System.out.println();
		}
		
		
		System.out.println("-----------9.right upper traingle---------------------------------------------");
		int n9=5;
		for(int i=1;i<=n9;i++) {
			for(int j=1;j<=n9;j++) {
				if(i+j>=n9+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		
		System.out.println("-----------10.left down traingle---------------------------------------------");
		int a=5;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(i+j<=a+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------11.right down tringle---------------------------------------------");
		int a2=5;
		for(int i=1;i<=a2;i++) {
			for(int j=1;j<=a2;j++) {
				if(j>=i) {
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
