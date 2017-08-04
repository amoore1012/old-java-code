//Caesar Cypher grapic fun! (in honor of him I made a sword)
//Written by Audrey Moore, due Jan 16, 2017

//import all the gui stuff
import javax.swing.*;
import java.awt.*;

//set up the color panel class
public class ColorPanel extends JPanel{
  //set up the main class with all of the gui stuff
  public static void main(String [] args){
    JFrame theGUI = new JFrame();
    //set the title
    theGUI.setTitle("Caesar Cypher Graphics");
    //set the size
    theGUI.setSize(200,200);
    //set the exit capability
    theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //set the color panel
    ColorPanel panel = new ColorPanel(Color.pink);
    Container pane = theGUI.getContentPane();
    pane.add(panel);
    theGUI.setVisible(true);
  }
  //set up the background panel
  public ColorPanel(Color backColor){
    setBackground(backColor);
  }
  //do all the drawing!
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    //the handle
    g.setColor(Color.green);
    g.drawLine(100,10,100,50);
    //the rectangles connecting the handle to the main sword
    g.setColor(Color.green);
    g.drawRect(80,50,40,10);
    g.setColor(Color.green);
    g.drawRect(82,52,36,6);
    //the sword
    g.setColor(Color.green);
    g.drawLine(90,60,90,150);
    g.setColor(Color.green);
    g.drawLine(110,60,110,150);
    g.setColor(Color.green);
    g.drawLine(100,60,100,180);
    g.setColor(Color.green);
    g.drawLine(90,150,100,180);
    g.setColor(Color.green);
    g.drawLine(110,150,100,180);
    //the oval detail on the handle
    g.setColor(Color.green);
    g.drawOval(95,10,10,20);
    //Caesar Rules!
    g.setColor(Color.green);
    g.drawString("Caesar Rules!", 5, 20);
  }
}