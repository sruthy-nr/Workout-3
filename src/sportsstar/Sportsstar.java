package sportsstar;
import java.util.Scanner;
class Footballer
{
    void income(int avg)
    {
        int i=avg*100000;
        System.out.println("Individual income of footballer is "+i);
    }
}
class Cricketer
{
    void income(int avg)
    {
        int i=avg*100000;
        System.out.println("Individual income of cricketer is "+i);
    }
}
public class Sportsstar {
    public static void main(String[] args) {
        System.out.println("Sports star");
        Footballer f = new Footballer();
        System.out.println("Enter the number of football players:");
        Scanner sc = new Scanner(System.in);
        int fc = sc.nextInt();
        int[] g = new int[fc];
        int tg = 0;
        System.out.println("Enter the number of goals scored or saved by each footballer:");
        for (int i = 0; i < fc; i++) {
            g[i] = sc.nextInt();
            tg += g[i];
        }
        int avgg = tg / fc;
        f.income(avgg);
        Cricketer c = new Cricketer();
        System.out.println("Enter the number of cricket players");
        int cc = sc.nextInt();
        int[] bb = new int[cc];
        int tc = 0;
        System.out.println("Enter the bating or bowling average of each cricketer");
        for (int i = 0; i < cc; i++) {
            bb[i] = sc.nextInt();
            tc += bb[i];
        }
        int avgb = tc / cc;
        c.income(avgb);
    }
}
