import java.util.Random;

public class Health {
    public static int hp1, hp2;
    public static boolean A1;
    public static boolean B1;
    public static String logs;

    public Health(int hp1,int hp2,boolean A1,boolean B1,boolean sex)
    {
        int attack;
        if (sex==true)
        {attack=20;}
        else
        {attack=30;}
        int A=20;//Снимает очки за успешную атаку
        int B=5;//Снимает очки за блок
        boolean A2;
        boolean B2;
        Random rand = new Random();
        A2 = rand.nextBoolean();
        B2 =rand.nextBoolean();
        if(A1==true)//Удар в голову Герой
        {
            if(B2==A1)
            {
                hp2=hp2-B;
                logs=" Черный повелитель заблокировал вашу атаку в голову";
            }
            else
            {
                hp2=hp2-attack;
                logs=" Ваша атака в голову прошла успешно";
            }

        }else
        {
            if(B2==A1)
            {
                hp2=hp2-B;
                logs=" Черный повелитель заблокировал вашу атаку в живот";
            }
            else
            {
                hp2=hp2-attack;
                logs=" Ваша атака в живот прошла успешно";
            }
        }





        if(A2==true)//Удар в голову Враг
        {
            if(B1==A2)
            {
                hp1=hp1-B;
                logs=logs+" , Вы заблокировали атаку в голову.";
            }
            else
            {
                hp1=hp1-A;
                logs=logs+" , Черный повелитель успешно атаковал в голову.";
            }

        }else
        {
            if(B1==A2)
            {
                hp1=hp1-B;
                logs=logs+" , Вы заблокировали атаку в живот.";
            }
            else
            {
                hp1=hp1-A;
                logs=logs+" , Черный повелитель успешно атаковал в живот.";
            }
        }

        this.hp1=hp1;
        this.hp2=hp2;
        this.logs=logs;


    }
}
