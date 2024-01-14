package patterns;

public class record3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------1.combination of upper traingles---------------------------------------------");
		int n=10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i>=j||i+j>=n*2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------2.left pyramid---------------------------------------------");
		int n2=4;
		for(int i=1;i<=n2*2-1;i++) {
			for(int j=1;j<=n2;j++) {
				if(i>=j && i+j<=n2*2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------3.down pyramid---------------------------------------------");
		int n3=4;
		for(int i=1;i<=n3;i++) {
			for(int j=1;j<=n3*2-1;j++) {
				if(i<=j && i+j<=n3*2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------4.right pyramid---------------------------------------------");
		int n4=4;
		for(int i=1;i<=n4*2-1;i++) {
			for(int j=1;j<=n4;j++) {
				if(i-j<=n4-1 && i+j>=n4+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------------5.upper pyramid---------");
		int d=4;
		for(int i=1;i<=d;i++) {
			for(int j=1;j<=d*2-1;j++) {
				if(i+j>=d+1 && j-i<=d-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------------5.butterfly---------");
		int x=4;
		for(int i=1;i<=x*2-1;i++) {
			for(int j=1;j<=x*2-1;j++) {
				if((i>=j&&i+j<=x*2)||(i+j>=x*2&&j>=i)){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------------6.diamond---------");
		int m=4;
		for(int i=1;i<=m*2-1;i++) {
			for(int j=1;j<=m*2-1;j++) {
				if((i+j>=m+1&&j-i<=m-1)&&(i-j<=m-1&&i+j<=m*3-1)) {
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
