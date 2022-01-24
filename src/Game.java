import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    public static JFrame frame = new JFrame();
    public static JPanel panel = new JPanel();
    public static JButton buttonFullscreen = new JButton();
    public static Boolean isFullScreen = true;

    public static void main(String[] args) {
        initialLoad();


    }

    public static void fullSize() {
        frame.dispose();
        if (isFullScreen) {
            frame.setUndecorated(true);
            frame.setVisible(true);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            isFullScreen = false;
        } else {
            frame.setExtendedState(JFrame.NORMAL);
            frame.setUndecorated(false);
            frame.setSize(750, 750);
            frame.setVisible(true);
            isFullScreen = true;
        }
    }

    public static void initialLoad(){

        buttonFullscreen.addActionListener(new ActionListener() {//criar um método pra facilitar a chamada
            @Override
            public void actionPerformed(ActionEvent e) {
                fullSize();
            }
        });


        panel.setBackground(Color.cyan);
        panel.setSize(frame.getSize());


        buttonFullscreen.setBounds(200,200,400,400);
        buttonFullscreen.setVisible(true);
        panel.setLayout(null);
        panel.add(buttonFullscreen);

        frame.add(panel);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
