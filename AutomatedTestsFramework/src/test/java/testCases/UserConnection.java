package testCases;

import categoriesForGroupTesting.HighPriority;
import com.telerikacademy.finalproject.pages.UsersPage;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UserConnection {
    @Test
    @Category(HighPriority.class)
    public void SendConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.send_ConnectionRequest();
        usersPage.assert_ConnectionIsSent();
    }

    @Test
    @Category(HighPriority.class)
    public void ConfirmConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.confirm_ConnectionRequest();
        usersPage.assert_ConnectionIsConfirmed();
    }

    @Test
    @Category(HighPriority.class)
    public void RejectConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.reject_ConnectionRequest();
        usersPage.assert_ConnectionIsRejected();
    }

    //This Test Requires An Existing Established Connection Between Users
    @Test
    @Category(HighPriority.class)
    public void DisconnectFromUser() {
        UsersPage usersPage = new UsersPage();
        usersPage.disconnect_FromUser();
        usersPage.assert_UsersAreDisconnected();
    }
}
