import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {
  //xPosition, yPosition, xVelocity, yVelocity, width and height as integer variables. Make them private.
	private int xPosition,yPosition;
	private int xVelocity,yVelocity;
	private int width,height;
	private Color colour;
	
	
	public int getxPosition() {
		return xPosition;
		
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public void setxPosition(int newX, int panelWidth) {
		this.xPosition = newX;
		  xPosition = newX;
	       if(xPosition < 0) {
	           xPosition = 0;
	       } else if(xPosition + width > panelWidth) {
	           xPosition = panelWidth - width;
	       }
	}
	public int getyPosition() {
		return yPosition;
		
	}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	public void setyPosition(int newY, int panelHeight) {
		this.yPosition = newY;
		if(yPosition < 0) {
	          yPosition = 0;
	      } else if(yPosition + height > panelHeight) {
	          yPosition = panelHeight - height;
	      }
	}
	public int getxVelocity() {
		return xVelocity;
	}
	public void setxVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}
	public int getyVelocity() {
		return yVelocity;
	}
	public void setyVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}
	public int getwidth() {
		return width;
	}
	public void setwidth(int width) {
		this.width = width;
	}
	public int getheight() {
		return height;
	}
	public void setheight(int height) {
		this.height = height;
	}
	 public Color getColour() {
         return colour;
     }
 public void setColour(Color colour) {
         this.colour = colour;
     }
 private int initialXPosition, initialYPosition;
 
 public void setInitialPosition(int initialX, int initialY) {
       initialXPosition = initialX;
       initialYPosition = initialY;
 }
       
 public void resetToInitialPosition() {
      setxPosition(initialXPosition);
       setyPosition(initialYPosition);
 }
 public Rectangle getRectangle() {
	         return new Rectangle(getxPosition(), getyPosition(), getwidth(), getheight());
	     }

}
