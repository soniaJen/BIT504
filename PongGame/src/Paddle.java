import java.awt.Color;

public class Paddle extends Sprite {
	/* Add static final variables (constants) for the width, height, colour and distance from edge.
	 *  Set values for each of these, following the suggestions below.
	 */
	final static Color PADDLE_COLOUR = Color.YELLOW;
	final static int PADDLE_WIDTH = 10;
	final static int PADDLE_HEIGHT = 100;
	final static int DISTANCE_FROM_EDGE = 40;
	
	 public Paddle(Player player, int panelWidth, int panelHeight) {
         setwidth(PADDLE_WIDTH);
         setheight(PADDLE_HEIGHT);
         setColour(PADDLE_COLOUR);
         int xPos;
         if(player == Player.One) {
             xPos = DISTANCE_FROM_EDGE;
         } else {
             xPos = panelWidth - DISTANCE_FROM_EDGE - getwidth();
         }
         setInitialPosition(xPos, panelHeight / 2 - (getheight() / 2));
         resetToInitialPosition();
     }

}
