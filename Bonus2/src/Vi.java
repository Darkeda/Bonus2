import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Vi extends JFrame {

        public Vi() {

            setLayout(new GridBagLayout());


            GridBagConstraints gbc = new GridBagConstraints();
            for (int row = 0; row < 64; row++) {
                for (int col = 0; col < 64; col++) {
                    gbc.gridx = col;
                    gbc.gridy = row;
                    Random random = new Random();
                    int color = random.nextInt(3);
                    int state = random.nextInt(3);

                    CellPane cellPane = new CellPane();
                    Color tileColor = new Color(0);
                    
                    
                  if(state==0) {cellPane.evererytingIsOkay=true;}
                  if(state==1) {cellPane.thereIsAWay=true;}
                  if(state==2) {cellPane.thereIsNoWay=true;}

                   if(color==0) {tileColor=Color.red;}
                   if(color==1) {tileColor=Color.green;}
                   if(color==2) {tileColor=Color.blue;}
                     

                    cellPane.defaultBackground = tileColor;
                    cellPane.setBackground(tileColor);

                 
                    add(cellPane, gbc);


                }
            }
        }
    }