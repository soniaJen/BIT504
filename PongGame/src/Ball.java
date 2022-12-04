import java.awt.Color;
	
	 public class Ball extends Sprite {
	       private static final int BALL_WIDTH = 20;
	       private static final int BALL_HEIGHT = 20;
	       private static final Color BALL_COLOUR = Color.GREEN;
	   
	       public Ball(int panelWidth, int panelHeight) {
	           setwidth(BALL_WIDTH);
	          setheight(BALL_HEIGHT);
	          setColour(BALL_COLOUR);
	          setInitialPosition(panelWidth / 2 - (getwidth() / 2), panelHeight / 2 - (getheight() / 2));
	          resetToInitialPosition();
	      }

}
