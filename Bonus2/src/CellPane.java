import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class CellPane extends JPanel {


         Color defaultBackground;
         int numbersclicked =3 ;
         boolean evererytingIsOkay = false;
         boolean thereIsNoWay = false;
         boolean thereIsAWay = false;


        public CellPane() {
            addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                	if(numbersclicked>0) {
                	numbersclicked--;} else {
                		if(evererytingIsOkay) {setBackground(Color.green);}
                		if(thereIsNoWay) {setBackground(Color.black);}
                		if(thereIsAWay && getBackground()==Color.blue) {setBackground(Color.green);}
                			
                		if(thereIsAWay && getBackground()==Color.red) {setBackground(Color.blue);}
                		
                	}
                	
                	
                	
                	


                }

                @Override
                public void mousePressed(MouseEvent e) {
                //	this.defaultBackground = Color.BLACK;
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //setBackground(defaultBackground);
                 

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    //setBackground(defaultBackground);
                }

                @Override
                public void mouseExited(MouseEvent e) {


                }
            });
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(50, 50);
        }
    }
