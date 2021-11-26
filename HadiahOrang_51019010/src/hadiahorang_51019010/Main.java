/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hadiahorang_51019010;
import java.awt.*;

/**
 *
 * @author helnat
 */
public class Main extends Panel {

    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g) {
        //wajah
        g.drawOval(300,200,100,100);
        //mata dan hidung
        g.setColor(Color.BLACK);
        g.fillOval(330,229,10,10);
        g.fillOval(360,229,10,10);
        g.drawLine(350,250,350,269);
        //senyum
        g.setColor(Color.PINK);
        g.drawArc(330,270,40,10,10,-180);
        //topi
        int Vx[]={300,350,397};
        int Vy[]={220,100,220};
        int np=Vx.length;
        g.setColor(Color.MAGENTA);
        g.fillPolygon(Vx,Vy,np);
        //badan
        g.setColor(Color.YELLOW);
        g.fillRoundRect(305,301,90,200,10,10);
        //rok
        int Zx[]={230,300,400,480};
        int Zy[]={540,400,400,540};
        int jp=Zx.length;
        g.setColor(Color.PINK);
        g.fillPolygon(Zx,Zy,jp);
        //tangan
         g.setColor(Color.black);
        g.fillOval(280,382,20,20);
        g.fillOval(399,382,20,20);
        g.setColor(Color.YELLOW);
        g.fillRoundRect(285,307,9,80,9,10);
        g.fillRoundRect(405,307,9,80,9,10);
        g.fillOval(380,300,30,20);
        g.fillOval(285,300,30,20);
        //kaki
        g.setColor(Color.BLACK);
        g.fillRoundRect(390,540,20,120,10,10);
        g.fillRoundRect(296,540,20,120,10,10);
        //sepatu
        g.fillOval(280,650,50,30);
        g.fillOval(375,650,50,30);
        
    }
    
     public static void main (String[] args){
       Frame f = new Frame ("HadiahPBO");
       Main hadiah= new Main();   
       f.add(hadiah);
       f.setSize(900,900);
       f.setVisible(true);
    }

}
