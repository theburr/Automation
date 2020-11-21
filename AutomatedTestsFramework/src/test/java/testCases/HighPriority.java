package testCases;

import com.telerikacademy.finalproject.pages.PostsPage;
import com.telerikacademy.finalproject.pages.UsersPage;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class  HighPriority extends BaseTest {

    @Test
    public void test_001_delete_Post_As_User(){
        PostsPage postsPage = new PostsPage();
        postsPage.registered_User_Can_Delete_His_Post();
        postsPage.assert_The_Post_Is_Deleted();
    }

    @Test
    public void test_002_edit_Post_As_User(){
        PostsPage postsPage = new PostsPage();
        postsPage.registered_User_Can_Edit_His_Post();
        postsPage.assert_The_Post_Is_Edited();
    }

    @Test
    public void test_003_user_Can_Delete_His_Comment(){
        PostsPage postPage = new PostsPage();
        postPage.registered_User_Can_Delete_His_Comment();
        postPage.assert_The_Comment_Is_Deleted();
    }

    @Test
    public void test_004_send_ConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.send_Connection_Request();
        usersPage.assert_Connection_Is_Sent();
    }

    @Test
    public void test_005_confirm_ConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.confirm_Connection_Request();
        usersPage.assert_Connection_Is_Confirmed();
    }

    @Test
    public void test_006_reject_ConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.reject_Connection_Request();
        usersPage.assert_Connection_Is_Rejected();
    }

    @Test
    public void test_007_disconnect_FromUser() {
        UsersPage usersPage = new UsersPage();
        usersPage.disconnect_Connection_Request();
        usersPage.assert_Users_Are_Disconnected();
    }
}
