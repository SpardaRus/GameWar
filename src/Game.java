import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    Settings s=new Settings();
    public  int hp1=100,hp2=s.hp2;
    EnerName n=new EnerName();
    String namep=n.namep;



    boolean Att,Blo;




    public void startgame()
    {
        Att=true;
        Blo=true;
        String seximg="";
        if (n.sexs==true)
        {hp1=150;seximg="res/HeroM.png";}
        if (n.sexs==false)
        {hp1=100;seximg="res/HeroW.png";}




        JFrame start=new JFrame("Игра");

        start.setSize(800,400);
        start.setLocationRelativeTo(null);
        start.setResizable(false);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setLayout(new BorderLayout());



        JLabel top=new JLabel("Битва");
        top.setHorizontalAlignment(JLabel.CENTER);
        top.setVerticalAlignment(JLabel.TOP);
        top.setFont(new Font("Verdana",Font.BOLD,25));

        JLabel A=new JLabel("Атака");
        A.setHorizontalAlignment(JLabel.CENTER);
        A.setVerticalAlignment(JLabel.TOP);
        A.setFont(new Font("Verdana",Font.BOLD,15));

        JLabel B=new JLabel("Блок");
        B.setHorizontalAlignment(JLabel.CENTER);
        B.setVerticalAlignment(JLabel.TOP);
        B.setFont(new Font("Verdana",Font.BOLD,15));


        JTextArea log=new JTextArea();


        JPanel IM=new JPanel();
        IM.setLayout(new BorderLayout());
        JPanel Black=new JPanel();
        Black.setLayout(new BorderLayout());
        JPanel IMN=new JPanel();
        IMN.setLayout(new FlowLayout());
        JPanel BlackN=new JPanel();
        BlackN.setLayout(new FlowLayout());
        JLabel IMname=new JLabel(n.namep+" :");
        JLabel Blackname=new JLabel("Властелин:");
        JProgressBar IMHP=new JProgressBar();
        IMHP.setStringPainted(true);
        IMHP.setString(""+hp1);
        IMHP.setMinimum(0);
        IMHP.setMaximum(hp1);
        IMHP.setValue(hp1);
        JProgressBar BlackHP=new JProgressBar();
        BlackHP.setStringPainted(true);
        BlackHP.setString(""+hp2);
        BlackHP.setMinimum(0);
        BlackHP.setMaximum(hp2);
        BlackHP.setValue(hp2);


        JLabel IMimg = new JLabel(new ImageIcon(seximg));


        JLabel Blackimg = new JLabel(new ImageIcon("res/Black.png"));


        IMN.add(IMname);
        IMN.add(IMHP);

        BlackN.add(Blackname);
        BlackN.add(BlackHP);



        IM.add(IMN, BorderLayout.NORTH);
        IM.add(IMimg, BorderLayout.CENTER);

        Black.add(BlackN, BorderLayout.NORTH);
        Black.add(Blackimg, BorderLayout.CENTER);



        JRadioButton headA=new JRadioButton("Голова");
        headA.setSelected(true);
        JRadioButton chestA=new JRadioButton("Живот");
        JRadioButton headB=new JRadioButton("Голова");
        headB.setSelected(true);
        JRadioButton chestB=new JRadioButton("Живот");

        JButton game=new JButton("Удар");

        JPanel panelA=new JPanel();//Панель (Радиобаттоны и название)
        panelA.setLayout(new GridLayout(5,2));


        JPanel panel=new JPanel();//Панель (картинка-панель действий-картинка)
        panel.setLayout(new GridLayout(1,3));


        JPanel panelgo=new JPanel();//Панель (Панель радиобатонов и кнопка деуйствия)
        panelgo.setLayout(new BorderLayout());

        JPanel panelgame=new JPanel(); //Панель  (Панель и нижний лог)
        panelgame.setLayout(new GridLayout(2,1));

        panelgame.add(panel);
        panelgame.add(log);

        panelA.add(A);
        panelA.add(B);
        panelA.add(headA);
        panelA.add(headB);
        panelA.add(chestA);
        panelA.add(chestB);


        panelgo.add(panelA, BorderLayout.CENTER);
        panelgo.add(game, BorderLayout.SOUTH);



        start.add(top, BorderLayout.NORTH);
        start.add(panelgame, BorderLayout.CENTER);

        panel.add(IM);
        panel.add(panelgo);
        panel.add(Black);

        log.setText("Здоровье "+namep+" = "+hp1+", "+"Здоровье Черного повелителя = "+hp2);


        start.setVisible(true);


        headA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                headA.setSelected(true);chestA.setSelected(false);Att=true;
            }
        });

        headB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                headB.setSelected(true); chestB.setSelected(false);Blo=true;
            }
        });
        chestA.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            chestA.setSelected(true);headA.setSelected(false);Att=false;
        }
    });
        chestB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chestB.setSelected(true);headB.setSelected(false);Blo=false;
            }
        });


        game.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String logs="";
                String text="";

                Health h=new Health(hp1,hp2,Att,Blo,n.sexs);
                hp1=h.hp1;
                hp2=h.hp2;
                logs=h.logs;
                BlackHP.setValue(hp2);
                IMHP.setValue(hp1);
                BlackHP.setString(""+hp2);
                IMHP.setString(""+hp1);

                String hps="Здоровье "+namep+" = "+hp1+", "+"Здоровье Черного повелителя = "+hp2;
                if(hp2<=0)
                {
                    start.setVisible(false);
                    Winner w=new Winner();
                    w.createdwin();

                }
                if(hp1<=0||(hp1<=0&&hp2<=0))
                {
                    start.setVisible(false);
                    Fail w=new Fail();
                    w.createdfail();

                }


                text=hps+'\n'+logs;
                log.setText(text);


            }
        });
    }
}
