package polimorfismo;
public class YellowFlowers extends Flowers{
    String type = "Yellow Flower";
    
    YellowFlowers (String nama){
        super (nama);
    }
    
     
   
    void display (){
            super.display();
            System.out.println ("Type \t: " + this.type);
    }
}
