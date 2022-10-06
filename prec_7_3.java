import java.util.*;

class AccountHolder {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int we;
    double inc;
    Boolean czs;

    static void Pr3() {
        System.out.println("*******Welcome to A.R.INTELLIGENCE*******");
        System.out.println(":: To Apply For Job Fill the Form ::");
    }

    void info() {
        System.out.println("Enter Your Name : ");
        name = sc.next();
        System.out.println("Enter Your Age : ");
        age = sc.nextInt();
        System.out.println("Enter Your Net Monthly Income : ");
        inc = sc.nextDouble();
        System.out.println("Enter Your Total Work Experince (In Year Format) : ");
        we = sc.nextInt();
        System.out.println("What is Your CitizenShip? (For Indian true otherwisw false) :- ");
        czs = sc.nextBoolean();

    }

    void check() {
        if (age >= 21 && age <= 60) {
            System.out.println("Your Age is : " + age);
        } else if (inc >= 15000) {
            System.out.println("Your Monthly Income is : " + inc);
        } else if (we >= 1) {
            System.out.println("Your Work Experience is : " + we);
        } else if (czs == true) {
            System.out.println("You Are A Indian Citizenship ......");
        }
    }
}

public class prec_7_3 extends AccountHolder {

    public static void main(String[] args) {
        int count = 0;
        ArrayList a = new ArrayList<>();
        ArrayList<AccountHolder> personHolder = new ArrayList<AccountHolder>();
        AccountHolder.Pr3();
        for (int i = 1; i <= 5; i++) {
            personHolder.add(new AccountHolder());
        }

        // If you want user input, do it in the loop below
        //USE FOR EACH LOOP (COPY OBJECT BY FOReACH LOOP)
        for (AccountHolder p : personHolder) {
            p.info();
            p.check();
            if (p.age >= 21 && p.age <= 60 && p.inc >= 15000 && p.we >= 1 && p.czs == true) {
                System.out.println("You are Elligeble**");
                System.out.println("Your Name is : " + p.name);
                count++;
                a.add(p.name);
            } else {
                System.out.println("You Are Not Elligeble!!!");
            }
        }
        System.out.println("The Number of Elligeble Candidates : " + count);
        System.out.println("The Number of Not Elligeble Candidates : " + (5 - count));
        System.out.println("All Eligible Candidates Are : " + a);
    }
}
