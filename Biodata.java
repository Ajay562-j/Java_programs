<<<<<<< HEAD

=======
>>>>>>> 1ec1fb55e7c22e64ac5495d5649087fea276f792
import java.util.Scanner;

class Biodata 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your reg.No ");
        int reg = obj.nextInt();
        System.out.println("your reg no is " + reg);

        obj.nextLine();
        System.out.println("Enter your name: ");
        String name = obj.nextLine();
        System.out.println("your name is " + name);

        System.out.println("Enter your initial: ");
        char ch = obj.next().charAt(0);
        System.out.println("your initial is " + ch);

        System.out.println("Enter your phone number: ");
        long phone = obj.nextLong();
        System.out.print("Enter your phone number: " + phone);

        obj.close();

    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 1ec1fb55e7c22e64ac5495d5649087fea276f792
