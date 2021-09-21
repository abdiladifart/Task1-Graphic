import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame F =  new JFrame("Task 1");
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Drawing drawing = new Drawing();

        F.add(drawing);
        F.setSize(250,250);
        F.setVisible(true);




    }
}
