//package conversor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class coversor extends Frame implements ActionListener{
    JTextField textPulgadas,textCentimetros ; JLabel l,l2 ; JButton b;
    coversor(){
        l=new JLabel();
        l.setBounds(25,50, 120,20);
        l.setText("Centimetros:");
        l2=new JLabel();
        l2.setBounds(25,80, 120,20);
        l2.setText("Pulgadas:");
        
        textPulgadas=new JTextField();
        textPulgadas.setBounds(110,50, 150,20);
        textCentimetros=new JTextField();
        textCentimetros.setBounds(110,80, 150,20);
        
        b=new JButton("Convertir");
        b.setBounds(270,60,95,30);
        b.addActionListener(this);
        add(b);add(textPulgadas);add(textCentimetros);add(l);add(l2);
        setSize(390,130);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        try{
            String host=textPulgadas.getText();
            String ip=java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of "+host+" is: "+ip);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        new coversor();
    }
}
