public class doorcode {

    public static void main(String[] args) {
        int code =1234; // the corrrect door code
        int attempts =0;
        int maxattempts =3;
        
        java.util.Scanner scanner =new java.util.Scanner(System.in);

        while (attempts < maxattempts) {
            System.out.print("Enter the code: ");
            int input = scanner.nextInt();
            
            if (input==code) {
                System.out.println("Door is opened.");
                return;
            }else {
                attempts++;
                System.out.println("Incrrect code. Try again.");
                }
            }
               System.out.println("Maximam attepts reached. Door is locked.");
               scanner.close(); 
        
        }
    }