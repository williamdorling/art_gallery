import java.util.ArrayList;

public class Customer {

//    properties

    private String name;
    private double wallet;
    private ArrayList<Artwork> artCollection;


    public Customer(String name, double wallet){
        this.name =  name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();
    }

    // Method
    public void buyArtwork(Artwork artwork, Gallery gallery){
        boolean foundArtwork = false;
        for (Artwork stock : gallery.getStock()) {
            if (artwork.getName().equals(stock.getName())){
                foundArtwork = true;
                double oldTill = gallery.getTill();
                gallery.setTill(oldTill + stock.getPrice());
                this.wallet -= stock.getPrice();
            }
        }
        if (foundArtwork == true){
            gallery.remove(artwork);
            artCollection.add(artwork);
        }

    }



//    Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<Artwork> getArtCollection() {
        return artCollection;
    }

    public void setArtCollection(ArrayList<Artwork> artCollection) {
        this.artCollection = artCollection;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
