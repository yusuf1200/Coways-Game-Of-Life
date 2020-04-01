
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Life extends JPanel implements ActionListener
{
    static int y;
    static int x;
    static String d;
   
    static int l;
    
        public static void main(String[] args)
{
    int n = Integer.parseInt(args[0]);
    int r = Integer.parseInt(args[1]);
    //int l = Integer.parseInt(args[2]);
    String b = args[2];
   
    y = n*10;
    x = r*10;
    d = b; 
    System.out.println(d);
    
    
  
    Frame f = new Frame();
    f.setSize(y, y);
    f.setState(Frame.NORMAL);
    
    f.setLocationRelativeTo(null);
    

}
    

    
    int xPanel = y;
    int yPanel = y;
    int size = 10;
    int xWidth = xPanel/size;
    int yH = yPanel/size;
    int[][] array = new int[xWidth][yH];
    int[][] before = new int[xWidth][yH];
    boolean starts = true;

    
    public Life()
    {
        setSize(y, y);
        setLayout(null);
        setVisible(true);
        new Timer(80,this).start();
        
        
    }
    public void paint(Graphics g)
    {
        int i = 0;
        while(i<2){
        super.paintComponent(g);
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        grid(g);
        spawn();
        display(g);
        i++;}
    }
    private void grid(Graphics g)
    {
        for(int i= 0;i<array.length;i++)
        {
            g.drawLine(0,i*size,xPanel,i*size);
            g.drawLine(i*size,0,i*size,yPanel);
            
        }
        
    }
    private String print()
    {
        return d;
    }
    
    private void spawn()
    {
        
        int j = 0;
       
        
        
        if(starts){
         
        
        
        if(d.equals("r") || d.equals("R"))
        {
        
            for(int x = 0; x<array.length;x++)
            {
                for(int y = 0;y<(yH);y++)
                {
                   
        
                    if((int)(Math.random() * 5) == 0)
                    {
                        before[x][y] = 1;
                    }
                    
                
            }
        }
            
        
    }
    
    
    else
    
    {
        System.out.println(d);
   
        for(int x = 0; x<array.length;x++)
            {
                for(int y = 0;y<(yH);y++)
                {
                    before[x][y] = 0;
                    
                }
    }
before[26][2] = 1;
before[24][3] = 1;
before[26][3] = 1;
before[14][4] = 1;
before[15][4] = 1;
before[22][4] = 1;
before[23][4] = 1;
before[36][4] = 1;
before[37][4] = 1;
before[13][5] = 1;
before[17][5] = 1;
before[22][5] = 1; 
before[23][5] = 1;
before[36][5] = 1;
before[37][5] = 1;
before[2][6] =  1;
before[3][6] =  1;
before[12][6] = 1;
before[18][6] = 1;
before[22][6] = 1;
before[23][6]  = 1;
before[2][7] = 1;
before[3][7] = 1;
before[12][7] = 1; 
before[16][7] =1;
before[18][7] = 1;
before[19][7] = 1;
before[24][7] = 1;
before[26][7] = 1;
before[12][8] = 1;
before[18][8] = 1;
before[26][8] = 1;
before[13][9] = 1;
before[17][9] = 1;
before[14][10] = 1;
before[15][10] = 1;



}
starts = false;
}}
    private void display(Graphics g)
    {
        int i = 0;
       
        g.setColor(Color.BLACK);
        copyArray();
        i++;
    
        for(int x = 0; x<array.length;x++)
            {
                for(int y = 0;y<(yH);y++)
                {
                    if(array[x][y] == 1)
                    {
                    g.fillRect(x * size, y*size, size,size);
                }
                }
            }
           
        
    }
    private void copyArray()
    {
        for(int x = 0; x<array.length;x++)
            {
                for(int y = 0;y<(yH);y++)
                {
                     array[x][y] = before[x][y];
                }
                }
            }
        
    
    private int check(int x,int y)
    {
        
        int life = 0;
        int i = 0;
        //while(i<l)
        //{
        life += array[(x+xWidth-1) % xWidth][(y+yH-1)%yH];
        life += array[(x+xWidth) % xWidth][(y+yH-1)%yH];
        life += array[(x+xWidth+1)%  xWidth][(y+yH-1)%yH];
        life += array[(x+xWidth-1)%  xWidth][(y+yH)%yH];
        life += array[(x+xWidth+1) % xWidth][(y+yH)%yH];
        life += array[(x+xWidth-1) % xWidth][(y+yH+1)%yH];
        life += array[(x+xWidth) % xWidth][(y+yH+1)%yH];
        life += array[(x+xWidth+1) % xWidth][(y+yH+1)%yH];
        //i++;
    
    //}
        return life;
        
        
        
    }
    public void actionPerformed(ActionEvent e)
    {
        int life;
        int i = 0;
        //while(i<l)
        //{
        for(int x = 0; x < array.length;x++)
        {
            for(int y = 0;y < (yH);y++)
            {
                life = check(x,y); 
                if(life == 3)
                {
                    before[x][y] = 1;
                }
                else if(life == 2 && array[x][y] == 1)
                {
                    before[x][y] = 1;
                }
                else
                {
                    before[x][y] = 0;
                }
            }
        }
        
        repaint();
        //i++;
        
        
    //}
}

    
    
    
}