package _99_extra;

import java.util.Random;

public class HiddenTypes {
	static Random rand = new Random();
	static int unknown1 = rand.nextInt(101);
	static double unknown2 = rand.nextDouble()*100;
	static String unknown3 = ""+(char)(rand.nextInt(26)+65)+(char)(rand.nextInt(26)+97)+(char)(rand.nextInt(26)+65)+(char)(rand.nextInt(26)+97)+(char)(rand.nextInt(26)+65);
	static char unknown4 = (char)(rand.nextInt(26)+65);
	static boolean unknown5 = rand.nextBoolean();
}

