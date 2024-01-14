package patterns;

public class numberpatterns {

	public static void main(String[] args) {
		System.out.println("-----------------------------------  ");
		int num=1;
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(num+"  ");
				num++;
			}
			System.out.println();
		}

		System.out.println("------left upper ------------------  ");
		for(int i=1;i<=n;i++) {
			int num1=1;
			for(int j=1;j<=n;j++) {
				if(i>=j) {
				System.out.print(num1+"  ");
				num1++;
				}
			}
			System.out.println();
		}
		
		System.out.println("------right upper ------------------  ");
		for(int i=1;i<=n;i++) {
			int num1=1;
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1) {
				System.out.print(num1+"  ");
				num1++;
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		System.out.println("------left down ------------------  ");
		int num1=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j<=n+1) {
				System.out.print(num1+"  ");
				}
			}
			num1++;
			System.out.println();
		}
		
		System.out.println("------right down ------------------  ");
		int num2=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=i) {
				System.out.print(num2+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			num2--;
			System.out.println();
		}
		System.out.println("------pyramid ------------------  ");
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i+j>=n+1 && j-i<=n-1) {
				System.out.print(i+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
System.out.println("------diamond ------------------  ");
		int num3=1;
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i+j>=n+1 && j-i<=n-1) {
				System.out.print(num3+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			num3++;
			System.out.println();
		}
	}

}

