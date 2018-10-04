import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu {


        public void createdmenu() {

            JFrame menu=new JFrame("Меню");

            menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menu.setLayout(new GridLayout(5,1));
            menu.setSize(400,400);
            menu.setLocationRelativeTo(null);
            menu.setBackground(Color.ORANGE);
            menu.setResizable(false);


            JLabel top=new JLabel("Меню");

            top.setFont(new Font("Verdana",Font.CENTER_BASELINE,25));
            top.setHorizontalAlignment(JLabel.CENTER);


            JButton start=new JButton("Играть");
            JButton settings=new JButton("Настройки");
            JButton about=new JButton("О программе");
            JButton exit=new JButton("Выход");




            menu.add(top);
            menu.add(start);
            menu.add(settings);
            menu.add(about);
            menu.add(exit);

            menu.setVisible(true);




            settings.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    menu.setVisible(false);
                Settings settings=new Settings();
                    settings.createdsettings();
                }
            });

            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    System.exit(0);
                }
            });

            start.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    menu.setVisible(false);
                    Start start=new Start();
                    start.createstart();
                }
            });





            about.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    menu.setVisible(false);
                    About about =new About();
                    about.createdabout();
                }
            });
        }
    }

