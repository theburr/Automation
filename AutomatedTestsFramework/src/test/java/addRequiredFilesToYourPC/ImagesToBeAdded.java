package addRequiredFilesToYourPC;

import com.telerikacademy.finalproject.pages.Elements.BaseElements;
import com.telerikacademy.finalproject.utils.UserActions;
import java.io.IOException;

public class ImagesToBeAdded implements BaseElements {
UserActions actions = new UserActions();

    public void add_CategoryImageToYourFolder() throws IOException {
        actions.copy_Image(CATEGORY_ORIGINAL_IMG, CATEGORY_COPIED_IMG);
        actions.copy_Image(NEW_POST_ORIGINAL_IMG, NEW_POST_COPIED_IMG);
    }
}
