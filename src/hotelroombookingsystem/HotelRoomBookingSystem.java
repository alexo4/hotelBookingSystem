
package hotelroombookingsystem;

import java.awt.Color;
import java.awt.Toolkit;

public class HotelRoomBookingSystem {

    public static void main(String[] args) {
        
        bookingSystem game = new bookingSystem();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        int xSize = (int)tk.getScreenSize().getWidth();
        int ySize = (int)tk.getScreenSize().getHeight();
        game.setSize(xSize,ySize);
        game.getContentPane().setBackground(Color.decode("#05F9ED"));
        
        game.setVisible(true); 
        
    }
    
}
