public class Artwork {

    private  String name;
    private Artist artist;
    private int price;
    private int nft;

// Constructor
        public Artwork(String name, Artist artist, int price, int nft) {
            this.name = name;
            this.artist = artist;
            this.price = price;
            this.nft = nft;
        }

    public String getName() {
        return name;
    }

    public Artist getArtist() {
        return artist;
    }

    public int getPrice() {
        return price;
    }

    public int getNft() {
        return nft;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNft(int nft) {
        this.nft = nft;
    }
}
