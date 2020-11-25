package testCases;

import categoriesForGroupTesting.CriticalPriority;
import com.telerikacademy.finalproject.pages.CategoriesAdminPage;
import com.telerikacademy.finalproject.pages.PostsPage;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.IOException;

public class Administration extends BaseTest {


    @Test
    @Category(CriticalPriority.class)
    public void test_005_delete_User_Post_As_Admin() {
        PostsPage postsPage = new PostsPage();
        postsPage.admin_Delete_Post_Of_An_User();
        postsPage.assert_Post_Is_Deleted();
    }

    @Test
    @Category(CriticalPriority.class)
    public void test_006_delete_Comment_Of_An_User_As_Admin() {
        PostsPage postsPage = new PostsPage();
        postsPage.admin_Delete_Comment_Of_An_User();
        postsPage.assert_Comment_Is_Deleted();
    }

    @Test
    @Category(CriticalPriority.class)
    public void test_007_create_Category_As_Admin(){
        CategoriesAdminPage categoryPage = new CategoriesAdminPage();
        categoryPage.create_Category_Admin();
        categoryPage.assert_Category_Is_Created();
    }
}
