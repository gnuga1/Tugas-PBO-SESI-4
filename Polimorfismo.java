package polimorfismo;
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Flowers flowers1 = new Flowers ("Tulip");
        RedFlowers flowers2 = new RedFlowers ("Rose");
        YellowFlowers flowers3 = new YellowFlowers ("Sunflower");
        
        flowers1.display();
        flowers2.display();
        flowers3.display();

    }

