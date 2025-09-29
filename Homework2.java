import java.util.Scanner;

class Student {
    int studentId;
    String name;
    String major;
    long phoneNumber;

   void setStudentId(int studentId) {
       this.studentId = studentId;
   }

   void setName(String name) {
       this.name = name;
   }

   void setMajor(String major) {
       this.major = major;
   }

   void setPhoneNumber(long phoneNumber) {
       this.phoneNumber = phoneNumber;
   }

   int getStudentId() {
       return studentId;
   }

   String getName() {
       return name;
   }

   String getMajor(){
       return major;
   }

   String getPhoneNumber() {
       String phone = Long.toString(phoneNumber);
       phone = "0" + phone;
       return phone.substring(0,3) + "-" + phone.substring(3,7) + "-" + phone.substring(7,11);
    }

}


public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for(int i = 0 ; i < 3; i++) {
            students[i] = new Student();
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phone = sc.nextLong();

            students[i].setStudentId(id);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhoneNumber(phone);
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for(int i = 0; i < 3; i++) {
            System.out.printf("%d번째 학생: %d %s %s %s\n", i+1, students[i].getStudentId(), students[i].getName(), students[i].getMajor(), students[i].getPhoneNumber());
        }


    }
}
