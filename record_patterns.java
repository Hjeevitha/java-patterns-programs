package patterns;

public class record_patterns {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1|| j==1|| i==n) {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("-------2.--------------------------------------------");
		int n1=4;
		for(int i=1;i<=n1;i++) {
			for(int j=1;j<=n1;j++) {
				if( i==1|| i==n1) {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
		System.out.println("--------3.-------------------------------------------------");
		int n2=4;
		for(int i=1;i<=n2;i++) {
			for(int j=1;j<=n2;j++) {
				if(j==1|| j==n2) {
					System.out.print("*  ");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("-----------4.---------------------------------------------");
		int n3=4;
		for(int i=1;i<=n3;i++) {
			for(int j=1;j<=n3;j++) {
				if(i==1|| j==1|| i==n3 || j==n3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------5.---------------------------------------------");
		int n4=4;
		for(int i=1;i<=n4;i++) {
			for(int j=1;j<=n4;j++) {
				if( j==1|| i==n4) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------6.---------------------------------------------");
		int n5=4;
		for(int i=1;i<=n5;i++) {
			for(int j=1;j<=n5;j++) {
				if( j==n5|| i==n5) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------7.-------------------------");
		int z=4;
		for(int i=1;i<=z;i++) {
			for(int j=1;j<=z;j++) {
				if(i==1 || j==3)
				System.out.print("* ");
				else {
					for(int k=1;k<z;k++){
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println("-----------------8.----------------------");
		int y=5;
		for(int i=1;i<=y;i++) {
			for(int j=1;j<=y;j++) {
				if(i==1 || j==1)
				System.out.print("* ");
			}
			System.out.println();
		}


		
		

	}

}
