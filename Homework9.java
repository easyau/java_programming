import java.io.*;
import java.util.*;
class LoginFile {
    Map<String, String> idpwd = new HashMap<String, String>();

    public LoginFile() throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("C:/Temp/db.txt"));
        String line;
        while ((line = f.readLine()) != null) {
            String[] parts = line.split(",");
            idpwd.put(parts[0].trim(), parts[1].trim());
        }
        f.close();
    }

    public void checkLogin(Scanner sc) {
        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String id = sc.nextLine().trim();

            if (!idpwd.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password: ");
            String pwd = sc.nextLine().trim();

            if (!idpwd.get(id).equals(pwd)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }
    }
}
public class Homework9 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            LoginFile lf = new LoginFile();
            lf.checkLogin(sc);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}

