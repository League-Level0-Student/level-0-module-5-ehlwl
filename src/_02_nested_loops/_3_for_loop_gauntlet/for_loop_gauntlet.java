package _02_nested_loops._3_for_loop_gauntlet;

public class for_loop_gauntlet {
	public static void main(String[] args) {
		for (int i=1;i<101;i++) {
			System.out.println(i);
		}
		for (int j=100;j>0;j--) {
			System.out.println(j);
		}
		for (int e=2;e<101;e++) {
			if(e%2==0) {
				System.out.println(e);
			}
		}
		for (int o=1;o<101;o++) {
			if(o%2==1) {
				System.out.println(o);
			}
		}
		for (int f=1;f<501;f++) {
			if (f%2==0) {
				System.out.println(f + " is even");
			}
			else {
				System.out.println(f + " is odd");
			}
		}
		for (int s=1;s<778;s++) {
			if (s%7==0) {
				System.out.println(s);
			}
		}
		for (int y=0;y<16;y++) {
			int t= y +2005;
			System.out.println("In "+t+", I was "+y+" years old");
		}
		
		for (int d=0;d<3;d++) {
			for (int a=0;a<3;a++) {
				System.out.println(d+" "+a);
			}
		}
		int r=0;
		for (int q=0;q<3;q++) {
			for (int w=0;w<3;w++) {
				r = r + 1; 
				System.out.print(r);
			}
			System.out.println();
		}
		int h=0;
		for (int u=0;u<10;u++) {
			for (int g=0;g<10;g++) {
				h = h + 1; 
				System.out.print(h);
			}
			System.out.println();
		}
		for (int k=2;k<8;k++) {
			for (int l=1;l<k;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
