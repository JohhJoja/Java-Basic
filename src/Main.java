import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

      //  IFStatement.ComplexFunction(10,10,10);

       // new Interface();
        //IFStatement.ComplexFunction(10,10);

        ArrayList<String> fruits = new ArrayList();

        fruits.add("banana");
      //  fruits.add(1);

        ArrayList everything = new ArrayList();

        everything.add(1);
        everything.add("string");
        everything.add(true);


        generic<String> box = new generic<>();

        box.setItem("banana");

        System.out.println(box.getItem());

    }
}