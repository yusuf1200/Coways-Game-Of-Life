
import javax.swing.JFrame;

public class Frame extends JFrame
{
    public Frame()
    {
        add(new Life());
        pack();
        //setSize(700, 700);
        setTitle("Game Of Life - Yusuf Alam");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    



}