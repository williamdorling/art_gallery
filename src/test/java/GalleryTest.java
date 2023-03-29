import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artwork monaLisa;
    Artist leonardo;
    ArrayList<Artwork> stock;

    @BeforeEach
    public void setUp(){
        leonardo = new Artist("Leonardo");
        monaLisa = new Artwork("Mona Lisa", leonardo, 1000000000, 100);
        stock = new ArrayList<>();
        stock.add(monaLisa);
        gallery = new Gallery("Louvre", 10000000, stock);
    }

    @Test
    public void canRemoveArtwork(){
        gallery.remove(monaLisa);
        ArrayList emptyArray = new ArrayList<Artwork>();
        assertThat(gallery.getStock()).isEqualTo(emptyArray);
    }

    @Test
    public void canStockTake(){
        assertThat(gallery.stock_take()).isEqualTo(1000000000);
    }


}
