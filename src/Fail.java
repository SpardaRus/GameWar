import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Fail {
    EnerName name=new EnerName();

    public void createdfail(){
        JFrame aboutF=new JFrame("Поражение");
        aboutF.setSize(400,400);
        aboutF.setLocationRelativeTo(null);
        aboutF.setResizable(false);
        aboutF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aboutF.setLayout(new BorderLayout());

        JLabel abouttext=new JLabel();

        String at="<html>"+name.namep+" Проиграл</html>";
        if(name.sexs==false)
        {
            at="<html>"+name.namep+" Проиграла</html>";
        }
        abouttext.setText(at);
        abouttext.setHorizontalAlignment(JLabel.CENTER);
        abouttext.setFont(new Font("Verdana",Font.BOLD,20));


        JButton again=new JButton("Меню");


        aboutF.add(abouttext, BorderLayout.CENTER);
        aboutF.add(again, BorderLayout.SOUTH);
        aboutF.setVisible(true);

        again.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aboutF.setVisible(false);
                Menu n = new Menu();
                n.createdmenu();

            }
        });
    }
}
