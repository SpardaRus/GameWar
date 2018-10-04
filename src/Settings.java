import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Settings {
     public static int hp2=100;
    public void createdsettings(){



        JFrame sett=new JFrame("Настройки");
        sett.setSize(400,400);
        sett.setLocationRelativeTo(null);
        sett.setResizable(false);
        sett.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sett.setLayout(new BorderLayout());


        JLabel top=new JLabel("Сложность");
        top.setHorizontalAlignment(JLabel.CENTER);
        top.setFont(new Font("Verdana",Font.BOLD,25));

        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(5,1));


        JButton easy=new JButton("Легко");
        JButton hard=new JButton("Средне");
        JButton expert=new JButton("Тяжело");
        JButton ret=new JButton("Назад");



        panel.add(top);
        panel.add(easy);
        panel.add(hard);
        panel.add(expert);
        sett.add(panel, BorderLayout.CENTER);
        sett.add(ret, BorderLayout.SOUTH);


        sett.setVisible(true);

        ret.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sett.setVisible(false);
                Menu n=new Menu();
                n.createdmenu();
            }
        });

        easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               hp2=100;
                    JOptionPane.showMessageDialog(sett, "Вы выбрали легкий режим. Здоровье Черного повелителя=100");
            }
        });
        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hp2=150;
                JOptionPane.showMessageDialog(sett, "Вы выбрали средний режим. Здоровье Черного повелителя=150");
            }
        });
        expert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hp2=200;
                JOptionPane.showMessageDialog(sett, "Вы выбрали тяжелый режим. Здоровье Черного повелителя=200");
            }
        });






    }

}
