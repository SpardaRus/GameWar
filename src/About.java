import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Инженер on 19.11.2015.
 */
public class About {
    public void createdabout(){
        JFrame aboutF=new JFrame("О программе");
        aboutF.setSize(400,400);
        aboutF.setLocationRelativeTo(null);
        aboutF.setResizable(false);
        aboutF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aboutF.setLayout(new BorderLayout());


        JLabel abouttext=new JLabel();
        String at="<html>Версия игры - 1.0<br>"+"Эта программа была создана<br>"+" Алексеем Ясаковым</html>";
        abouttext.setText(at);
        abouttext.setHorizontalAlignment(JLabel.CENTER);
        abouttext.setFont(new Font("Verdana",Font.BOLD,20));


        JButton ret=new JButton("Назад");


        aboutF.add(abouttext, BorderLayout.CENTER);
        aboutF.add(ret, BorderLayout.SOUTH);
        aboutF.setVisible(true);




        ret.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aboutF.setVisible(false);
                Menu menu=new Menu();
                menu.createdmenu();
            }
        });
    }
}
