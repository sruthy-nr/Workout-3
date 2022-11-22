package sports;
abstract class OutdoorGames
{
    abstract void display();
}
class Football extends OutdoorGames
{
    void display()
    {
        System.out.println("Football Team");
        System.out.println("Argentina");
    }
}
class Cricket extends OutdoorGames
{
    void display()
    {
        System.out.println("Cricket Team");
        System.out.println("India");
    }
}
public class OutdoorGame {
    public static void main(String args[])
    {
        System.out.println("Sports");
        Football f=new Football();
        f.display();
        Cricket c=new Cricket();
        c.display();
    }
}
