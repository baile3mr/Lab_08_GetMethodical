
   import java.util.Scanner;

    public class Reggie {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            String ssn = SafeInput.getRegExString(in,
                    "Enter SSN (xxx-xx-xxxx)",
                    "^\\d{3}-\\d{2}-\\d{4}$");

            String mNum = SafeInput.getRegExString(in,
                    "Enter UC M number (M#####)",
                    "^(M|m)\\d{5}$");

            String menu = SafeInput.getRegExString(in,
                    "Enter menu choice (O/S/V/Q)",
                    "^[OoSsVvQq]$");

            System.out.println("SSN: " + ssn);
            System.out.println("M#: " + mNum);
            System.out.println("Menu choice: " + menu);
        }
    }


