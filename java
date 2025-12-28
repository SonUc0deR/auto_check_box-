# auto_check_box-
in this program be java code GUI by using Swing in this code be have make a frame as how to using auto check and written auto change label if click the check box with java logic by using ternary operators with simple language explain the line by explanation .
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Swing16 extends JFrame implements ActionListener {//class declaration
    JCheckBox cb,cb2; //check ka variable
    JLabel l;//label ka variable
    Swing16(){//constructor
        setTitle("auto checkbox");//frame ka name
        l=new JLabel();//object creation of Label
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBounds(100,100,300,50);
        cb=new JCheckBox("Java");//check box creation
        cb2=new JCheckBox("C++");//check box 2 creation
        cb.setBounds(100,200,150,50);
        cb2.setBounds(100,250,150,50);
        add(cb);//frame me add kiya gya check box
        add(cb2);//frame me add kiya gya check box 2
        add(l);//frame me add kiya gya label
        cb.addActionListener(this);//current method me action perform
        cb2.addActionListener(this);//2nd current method me action perform
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        //ternery operator logic
         String msg= "Java: " + (cb.isSelected() ? "Checked" : "Unchecked")
                + " | C++: " + (cb2.isSelected() ? "Checked" : "Unchecked");
            l.setText(msg);}
    public static void main(String[] args){
        new Swing16();

    }

}
/* isSelected()=true or false action perform karta hai
JCheckBox multiple selection allow karta hai
✔️ isSelected() boolean return karta hai
✔️ ActionListener checkbox event handle karta hai
>>JFrame extend kiya = window banane ke liye
 >>ActionListener implement kiya
 = checkbox click ka event handle karne ke liye*/
