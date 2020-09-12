package _04_practice._2_code_4_life;


import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Code4Life {
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	static boolean canPlaySounds = true;
	
	
	// 1. Ask the user how many hours they spent coding this week.

	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.

	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja

	// 4. If it is more than 5, call the playBatmanTheme  method, then 
	//    call the displayBatman method.



	
	private static void playBatmanTheme() {
	// NOTE: Download batman.wav from league-sounds on GitHub: https://github.com/jointheleague/league-sounds
	//	     Then put batman.wav into the "_2_code_4_life" project
	//       If you want to play a different audio, change the file name in the code below.
		if (canPlaySounds) {		
			File sound = new File("src/_04_practice/_2_code_4_life/batman.wav");
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		}
	}
	
	private static void displayBatman() {		
		ImageIcon icon = new ImageIcon("src/_04_practice/_2_code_4_life/batman.png");
		JOptionPane.showMessageDialog(null, "", "You must be Batman!", 0, icon);
	}
	

}
