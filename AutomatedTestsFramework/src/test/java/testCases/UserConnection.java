package testCases;

import categoriesForGroupTesting.HighPriority;
import com.telerikacademy.finalproject.pages.UsersPage;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UserConnection {
    @Test
    @Category(HighPriority.class)
    public void test_014_sendConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.send_Connection_Request();
        usersPage.assert_Connection_Is_Sent();
    }

    @Test
    @Category(HighPriority.class)
    public void test_015_confirmConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.confirm_Connection_Request();
        usersPage.assert_Connection_Is_Confirmed();
    }

    @Test
    @Category(HighPriority.class)
    public void test_016_rejectConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.reject_Connection_Request();
        usersPage.assert_Connection_Is_Rejected();
    }

    @Test
    @Category(HighPriority.class)
    public void test_017_disconnectFromUser() {
        UsersPage usersPage = new UsersPage();
        usersPage.disconnect_Connection_Request();
        usersPage.assert_Users_Are_Disconnected();
    }
}
