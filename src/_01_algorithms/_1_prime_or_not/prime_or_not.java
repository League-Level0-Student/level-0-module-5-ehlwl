package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("type any number");
		int v = (int) Integer.parseInt(a);
		int c = 0;
		for (int i=2;i<v;i++) {
			if(v%i==0) {
				c=1;
			}
			else {
				
			}
			
		}
		if(c==0) {
			JOptionPane.showConfirmDialog(null, "your number is prime number");
		}
	}
}
