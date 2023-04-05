import java.util.ArrayList;
public class Order {

    public  String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items;

    //Constructor

      public Order(){
        this.items = new ArrayList<Item>();
    }
    
    public Order(String name, double total, boolean ready){
        this.name = name;
        this.total = total;
        this.ready = ready;
        this.items = new ArrayList<Item>();
    }

       // methods

    public void displayStatus(){
        System.out.println("name: " + this.name);
        System.out.println("total: " + this.total);
        System.out.println("ready: " + this.ready);
        System.out.println("items: ");
        for(Item item : this.items){
            item.displayInfo();
        }
    }
    
    public void addItem(Item item){
        this.items.add(item);
    }

}