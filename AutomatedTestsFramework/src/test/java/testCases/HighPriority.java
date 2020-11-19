package testCases;

import com.telerikacademy.finalproject.pages.UsersPage;
import org.junit.Test;

public class  HighPriority extends BaseTest {

    @Test
    public void send_ConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.send_Connection_Request();
        actions.assertElementPresent("");
    }

    @Test
    public void confirm_ConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.confirm_Connection_Request();
        actions.assertElementPresent("");
    }

    @Test
    public void reject_ConnectionRequest() {
        UsersPage usersPage = new UsersPage();
        usersPage.reject_Connection_Request();
        actions.assertElementPresent("");
    }

    @Test
    public void disconnect_FromUser() {
        UsersPage usersPage = new UsersPage();
        usersPage.disconnect_Connection_Request();
        actions.assertElementPresent("");
    }
}
