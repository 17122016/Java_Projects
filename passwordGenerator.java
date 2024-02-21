import java.util.Scanner;

public class passwordGenerator {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

      // step 1 : ask the user how many random password want to generator
        // and how many character want in your random password
        System.out.println(" enter the total number of random passwords to generator  ");
        int total = in.nextInt();
        System.out.println(" how many characters long  want in your random passwords to be ");
        int length = in.nextInt();
     
      // step 4: Store each random password you generate in an array.
      String[] randompwds = new String[total];
       
        // step 3 : Create a random password by looping through the
        // total number of passwords and looping through the length of the passwords.
        for (int i = 0; i < total; i++) {
            String randompwd = " ";
            for (int j = 0; j < length; j++) {
                randompwd += randomCharacter();
            }
            randompwds[i] = randompwd;
        }
        printpwd(randompwds);
      
         System.out.println("your strength of password is :" + getpwdStrength(length));
      
    // Close the Scanner object to release system resources
        in.close();

    }


    // create the fun to find out the strength of pwd
    public static String getpwdStrength(int length){
        if(length <5){
            return "weak";
        }
        else if( length <10){
            return "medium";
        }
        else{
            return "strong ";
        }

    }

// print the password 
    public static void printpwd(String[] arr){
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    // step 2: Create a function that generates a random character, which can be a
    // number a lowercase letter, or an uppercase letter

    public static char randomCharacter() {

        // There are 10 numbers, 26 lowercase letters, and 26 uppercase letters,
        // so there are 10 + 26 + 26 = 62 possibilities of characters.

        int rand = (int) (Math.random() * 62);

        // convert rand number into ascii value
        // ascii value According to our ASCII table, ‘0’ – ‘9’ is 48-57 in ASCII,
        // ‘A’ – ‘Z’ is 65-90 in ASCII, and ‘a’ – ‘z’ is 97-122 in ASCII.

        if (rand <= 9) {
            int ascii = rand + 48; // 0 to 9 => 48 to 57 => 48+0 = 0
            return (char) (ascii);

        } else if (rand <= 35) {
            int ascii = rand + 55; // 65 to 90 => uppercase => 55+ 10 = 65
            return (char) (ascii);

        } else {
            int ascii = rand + 61; // 97 to 122 => lower case => 36+61 = 97
            return (char) (ascii);
        }

    }

}
