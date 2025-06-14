package Manager;

import java.util.ArrayList;
import Model.User;

public class LoginManager {

    public User login(String username, String password, ArrayList<User> users) {
        for (User user : users) {
          String tempUserName = user.getUsername();
String tempPassword = user.getPassword();

            if (tempUserName.equals(username) && tempPassword.equals(password)) {
                return user;
            }
        }
        return null;
    }
}
