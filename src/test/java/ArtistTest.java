import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    @BeforeEach

    public void setUp(){
        artist = new Artist ("leonardo");
    }

    @Test
    public void hasName(){
        assertThat(artist.getName()).isEqualTo("leonardo");
    }



}
