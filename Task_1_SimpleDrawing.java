import javax.swing.*;
import java.awt.*;

public class Drawing extends JPanel {
    public void paint (Graphics graphics){
        super.paint(graphics);
        this.setBackground(Color.gray);
        graphics.setColor(Color.blue);
        graphics.fillRect(50,50,100,100);




    }


}
