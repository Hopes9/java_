import java.util.regex.*;

public class first {
    public static void main(String[] args) {
        Auth pety = new Auth();
        Coder code = new Coder();
        pety.fillLogin("hopes916@mail.com", code);


        String polsovatel = "asd0";
        System.out.println(pety.sendCode(code, polsovatel));


//        pety.checkCode(12312);
    }

}

class Auth {
    String phone;
    String email;
    String code;

    void fillLogin(String login, Coder n) {
        Pattern p = Pattern.compile("\\w*@\\w*.\\w*");
        Matcher pattern = p.matcher(login);
        if (pattern.matches() == true) {
            this.email = login;
            System.out.println("Yes email");
            n.sendCode();
        } else if (pattern.matches() == false) {
            Pattern num = Pattern.compile("\\+\\d{1,12}");
            Matcher pa = num.matcher(login);
            n.sendCode();
            if (pa.matches() == true) {
                this.phone = login;

                System.out.println("Yes number");
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("error");
        }
    }
