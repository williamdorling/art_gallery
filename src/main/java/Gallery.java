import java.util.ArrayList;

public class Gallery {
//Properties
    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name, double till, ArrayList<Artwork> stock){
        this.name = name;
        this.till = till;
        this.stock = stock;
    }
    
//    methods
    public void remove(Artwork artwork){
        this.stock.remove(artwork);
    }
    
    public double stock_take(){
        double stockValue = 0;
        for (Artwork artwork : stock) {
            stockValue += artwork.getPrice();
        }
        return stockValue;
    }
    
//Setters and getters
    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Artwork> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Artwork> stock) {
        this.stock = stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTill(double till) {
        this.till = till;
    }
}
