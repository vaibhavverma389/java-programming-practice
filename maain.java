interface Playable
{
    void play();
}
class Guitor implements Playable
{
    public void play()
    {
        System.out.println("Playing Guitor");
    }
}
class Piano implements Playable
{
    public void play()
    {
        System.out.println("Playing Piano");
    }
}
public class maain {
    public static void main(String[] args) {
        Guitor g= new Guitor();
        Piano p= new Piano();
        g.play();
        p.play();
        
    }
    
}
