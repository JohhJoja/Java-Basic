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


}
