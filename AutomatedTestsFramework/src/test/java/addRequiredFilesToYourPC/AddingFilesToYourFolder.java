package addRequiredFilesToYourPC;

import org.junit.Test;

import java.io.IOException;

public class AddingFilesToYourFolder {

    @Test
    public void adding_CategoryImage() throws IOException {
        ImagesToBeAdded image = new ImagesToBeAdded();
        image.add_RequiredImagesToYourFolder();
    }
}
