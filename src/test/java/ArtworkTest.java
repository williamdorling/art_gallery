import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork;
    Artist leonardo;


    @BeforeEach

    public void setUp(){
        leonardo = new Artist ("Leonardo");
        artwork = new Artwork ("Mona Lisa", leonardo, 1000000000, 100);
    }

    @Test
    public void artworkHasName(){
        assertThat(artwork.getName()).isEqualTo("Mona Lisa");
    }

    @Test
    public void artworkHasArtist(){
        assertThat(artwork.getArtist()).isEqualTo(leonardo);
    }

}
