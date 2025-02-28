import java.util.Scanner;

public class IFStatement {
    int x,y,z;

    int[] arr1 = {x,y,z};

    void IFStatement(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void Sum(){
        z = x+y;
        System.out.println("x+y= "+z);
    }

    void Division(){
        z = x/y;
        System.out.println("x/y= "+z);
    }

    void Multipl(){
        z = x*y;
        System.out.println("x*y= "+z);
    }

    static void ComplexFunction(int x, int y){
        String mode = "";
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Select mode: EAE or QS ");
            mode = (scan.nextLine()).toLowerCase();

            if (mode.equals("eae")){

                System.out.println("Z=(A^-1)mod(N)");
                int inverse = modInverse(x,y);
                if (inverse == -1) {
                    System.out.println("Обратного элемента не существует");
                } else {
                    System.out.println("Обратный элемент: " + inverse);
                }

                break;

            } else if (mode.equals("qs")) {
                System.out.println("Enter N");
                System.out.println("(A^b) mod N= "+ fastExponentiation(x,y, (new Scanner(System.in).nextLong())));

                break;
            } else{
                System.out.println(":(");
            }
        }
    }

    public static int modInverse(int A, int N) {
        int[] result = extendedGCD(A, N);
        int gcd = result[0];
        int x = result[1];

        if (gcd != 1) {
            return -1; // Обратного элемента не существует
        } else {
            return (x % N + N) % N; // Приводим к положительному значению
        }
    }

    public static int[] extendedGCD(int a, int b) {
        if (b == 0) {
            return new int[]{a, 1, 0};
        }
        int[] result = extendedGCD(b, a % b);
        int gcd = result[0];
        int x1 = result[2];
        int y1 = result[1] - (a / b) * result[2];
        return new int[]{gcd, x1, y1};
    }
    public static long fastExponentiation(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
