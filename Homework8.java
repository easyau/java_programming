import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Login {
    private Map<String, String> IdPwd = new HashMap<>();

    public void loginData() {
        IdPwd.put("myId", "myPass");
        IdPwd.put("myId2", "myPass2");
        IdPwd.put("myId3", "myPass3");
    }

    public void checkLogin(Scanner sc) {

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String id = sc.nextLine().trim();

            if (!IdPwd.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password: ");
            String pwd = sc.nextLine().trim();

            if(!IdPwd.get(id).equals(pwd)){
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }


    }
}

public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();
        login.loginData();
        login.checkLogin(sc);

    }
}
