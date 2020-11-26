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
        usersPage.send_ConnectionRequest();
        usersPage.assert_ConnectionIsSent();
    }

    @Test
    @Category(HighPriority.class)
    public void test_015_confirmConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.confirm_ConnectionRequest();
        usersPage.assert_ConnectionIsConfirmed();
    }

    @Test
    @Category(HighPriority.class)
    public void test_016_rejectConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.reject_ConnectionRequest();
        usersPage.assert_ConnectionIsRejected();
    }

    //This Test Requires An Existing Established Connection Between Users
    @Test
    @Category(HighPriority.class)
    public void test_017_disconnectFromUser() {
        UsersPage usersPage = new UsersPage();
        usersPage.disconnect_FromUser();
        usersPage.assert_UsersAreDisconnected();
    }
}
