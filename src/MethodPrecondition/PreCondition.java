package MethodPrecondition;
class User {
    void setPassword(String password) {
        if(password.length() < 8) {
            throw new IllegalArgumentException("Password must be 8 characters long ");
        }
        System.out.println("password set successfully ");
    }

}

class AdminUser extends User {
    @Override
    void setPassword(String password) {
        if(password.length() < 6 ) {
            throw new IllegalArgumentException("password length must be greater than 6 characters ");
        }
        System.out.println("password set successfully ");
    }
}
public class PreCondition {

}
