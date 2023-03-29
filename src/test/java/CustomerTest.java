import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Gallery gallery;
    Artwork monaLisa;
    Artist leonardo;
    ArrayList<Artwork> stock;
    Customer zsolt;

    @BeforeEach
    public void setUp() {
        zsolt = new Customer("Zsolt", 2000000000);
        leonardo = new Artist("Leonardo");
        monaLisa = new Artwork("Mona Lisa", leonardo, 1000000000, 100);
        stock = new ArrayList<>();
        stock.add(monaLisa);
        gallery = new Gallery("Louvre", 10000000, stock);
    }

    @Test
    public void canBuyArtworkCustomer(){
        zsolt.buyArtwork(monaLisa,gallery);
        assertThat(zsolt.getWallet()).isEqualTo(2000000000 - 1000000000);
    }
    @Test
    public void canBuyArtworkGallery(){
        zsolt.buyArtwork(monaLisa,gallery);
        assertThat(gallery.getTill()).isEqualTo(10000000 + 1000000000);
    }

    @Test
    public void canBuyArtworkCollection(){
    zsolt.buyArtwork(monaLisa,gallery);
    ArrayList<Artwork> collection = new ArrayList<>();
    collection.add(monaLisa);
    assertThat(zsolt.getArtCollection()).isEqualTo(collection);
    }

}