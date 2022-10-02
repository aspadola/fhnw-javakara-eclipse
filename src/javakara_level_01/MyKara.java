package javakara_level_01;


import kara.gamegrid.Kara;
import kara.gamegrid.KaraWorld;


/**
 * MyKara is a subclass of Kara. Therefore, it inherits all methods of Kara: <p>
 *  * 
 * Actions:     move(), turnLeft(), turnRight(), putLeaf(), removeLeaf() <b>
 * Sensors:     onLeaf(), treeFront(), treeLeft(), treeRight(), mushroomFront()
 */
public class MyKara extends Kara {
	
    /**
     * In the 'act()' method you can write your program for Kara <br>
     */
	public void act() {
		move();
		turnRight();
		move();
		stop();
	}
	
	/**
	 * The main-method is the start of the program where the Kara world is loaded <br>
	 */
	public static void main(String[] args) {
		KaraWorld world = new KaraWorld("WorldSetup.txt", MyKara.class);
		world.show();
	}
}
