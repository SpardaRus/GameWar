import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start {
    public void createstart(){
        JFrame start=new JFrame("Игра");

        start.setSize(400,400);
        start.setLocationRelativeTo(null);
        start.setResizable(false);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setLayout(new BorderLayout());



        String text="<html><h2>Добро пожаловать в мир тьмы и разрушения</h2><br><br>" +
                "В сегодняшнее время нелегко выжить в жестоком мире.<br> "+
                "Каждый проходит мимо несправедливости, потому что боятся.<br>" +
                "Но в тебе пылает кровь, ты не можешь все так оставить.<br>" +
                "В твоем роду всегда боролись с несправедливостью.<br>" +
                "Ты можешь дать отпор!!! </html>";
        JLabel top=new JLabel(text);

        top.setVerticalAlignment(JLabel.TOP);
        top.setFont(new Font("Verdana",Font.BOLD,15));


        JButton next=new JButton("Дальше");


        start.add(top, BorderLayout.CENTER);
        start.add(next, BorderLayout.SOUTH);



        start.setVisible(true);


        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setVisible(false);
                EnerName name=new EnerName();
                name.entername();

            }
        });

    }
}
