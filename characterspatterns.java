package patterns;

public class characterspatterns {

	public static void main(String[] args) {
		int n=4;
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
		}
		System.out.println("-------------left upper--------------------");

		for(int i=1;i<=n;i++) {
			char ch1='A';
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.print(ch1+" ");
					ch1++;
				}
			}

			System.out.println();
		}
		System.out.println("-------------right upper--------------------");

		for(int i=1;i<=n;i++) {
			char ch1='A';
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1) {
					System.out.print(ch1+" ");
					ch1++;
				}
				else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}

		System.out.println("-------------left down--------------------");

		for(int i=1;i<=n;i++) {
			char ch2='E';
			for(int j=1;j<=n;j++) {
				if(i+j<=n+1) {
					System.out.print(ch2+" ");
					ch2++;
				}
			}

			System.out.println();
		}

		System.out.println("-------------right down--------------------");

		for(int i=1;i<=n;i++) {
			char ch1='Z';
			for(int j=1;j<=n;j++) {
				if(i<=j) {
					System.out.print(ch1+" ");
					ch1--;
				}
				else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
		System.out.println("-------------pyramid--------------------");
		char ch1='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i+j>=n+1 && j-i<=n-1) {
					System.out.print(ch1+" ");
				}
				else {
					System.out.print("  ");
				}
			}
            ch1++;
			System.out.println();
		}
		
		System.out.println("-------------diamond--------------------");
		
		char c='A';
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i+j>=n+1 && j-i<=n-1 && i-j<=n-1 && i+j<=n*3-1) {
					System.out.print(c+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			if(i<n) {
				c++;
			}
			else {
				c--;
			}
			System.out.println();
		}

	}

}
