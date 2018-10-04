import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnerName {
    public static String namep="";
    public static boolean sexs=true;
    public void entername()
    {
        sexs=true;
        JFrame start=new JFrame("Игра");

        start.setSize(400,400);
        start.setLocationRelativeTo(null);
        start.setResizable(false);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setLayout(new BorderLayout());



        JLabel top=new JLabel("Введите ваше имя");
        top.setVerticalAlignment(JLabel.TOP);
        top.setFont(new Font("Verdana",Font.BOLD,25));

        JTextField name=new JTextField(10);

        name.setText("Герой");

        JRadioButton sexM=new JRadioButton("Мужчина");
        JRadioButton sexW=new JRadioButton("Женщина");

        JLabel sexML=new JLabel("(Здоровье=150, Атака=20)");
        JLabel sexWL=new JLabel("(Здоровье=100, Атака=30)");

        JLabel Mimg = new JLabel(new ImageIcon("res/HeroM.png"));
        JLabel Wimg = new JLabel(new ImageIcon("res/HeroW.png"));

        JPanel Sexpanel=new JPanel();
        Sexpanel.setLayout(new GridBagLayout());

        Sexpanel.add(top, new GridBagConstraints(0,0,2,1,1,1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),0,0));
        Sexpanel.add(name, new GridBagConstraints(0,1,2,1,1,1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),0,0));

        Sexpanel.add(sexM, new GridBagConstraints(0,2,1,1,1,1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),0,0));
        Sexpanel.add(sexW, new GridBagConstraints(1,2,1,1,1,1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),0,0));

        Sexpanel.add(sexML, new GridBagConstraints(0,3,1,1,1,1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),0,0));
        Sexpanel.add(sexWL, new GridBagConstraints(1,3,1,1,1,1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),0,0));

        Sexpanel.add(Mimg, new GridBagConstraints(0,4,1,1,1,1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),0,0));
        Sexpanel.add(Wimg, new GridBagConstraints(1,4,1,1,1,1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),0,0));


       /* JPanel panel=new JPanel();

        panel.setLayout(new GridLayout(8,1));*/

        JButton next=new JButton("Дальше");

        sexM.setSelected(true);
        start.add(Sexpanel, BorderLayout.CENTER);
      /*  panel.add(top);
        panel.add(name);
        panel.add(Sexpanel);*/
        start.add(next, BorderLayout.SOUTH);


        sexM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                   sexM.setSelected(true);

                sexW.setSelected(false);sexs=true;
            }
        });

        sexW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    sexW.setSelected(true);

                sexM.setSelected(false);sexs=false;
            }
        });


        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namep=name.getText();
                boolean sex=true;
                if(sexM.isSelected())
                    sex=true;
                if(sexW.isSelected())
                    sex=false;

                start.setVisible(false);
                Game game=new Game();
                game.startgame();
            }
        });

        start.setVisible(true);
    }
}
