public class Rectangle {
    public static void main(String[] args) {

    }
}
class Auth {
    int phone;
    String email;
    String code;

    void fillLogin(String login) {

    }

    void sendCode() {
        new Coder().sendCode();

    }

    boolean checkCode(String code) {
        if (code.length() < 6) {
            return false;
        } else {
            if (new Coder().checkCode(this.code)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
class Coder {
    String secret_code;
    void sendCode() {
        int v = (int) Math.random() * 1000;

    }

    boolean checkCode(String code) {
        if (code.equals(secret_code)) {
            return true;
        } else {
            return false;
        }
    }
}


