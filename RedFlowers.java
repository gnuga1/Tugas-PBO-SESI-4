package polimorfismo;
public class RedFlowers extends Flowers {
    String type = "Red Flower";
    
    RedFlowers (String nama){
        super(nama);
        
    }
    
 
    void display (){
            super.display();
            System.out.println ("Type \t: " + this.type);
    }
     
}
