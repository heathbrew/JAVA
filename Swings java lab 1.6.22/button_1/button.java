import javax.swing.*;    
public class button {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    JButton b=new JButton("Click Here");  
    int width = 400;
    int height = 400;
    b.setBounds(width/2-50,150,100,30);  
    f.add(b);  
    f.setSize(width,height);  
    f.setLayout(null);  
    f.setVisible(true);   
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
}  
}  