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

    void ComplexFunction(String mode){

    }

    static void ComplexFunction(int x, int y, int z){
        String mode = "";
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Select mode: EAE or QS ");
            mode = (scan.nextLine()).toLowerCase();

            if (mode.equals("eae")){
                System.out.println("EAE");
                break;
            } else if (mode.equals("qs")) {
                System.out.println("SQ");
                break;
            } else{
                System.out.println(":(");
            }
        }

    }
}
