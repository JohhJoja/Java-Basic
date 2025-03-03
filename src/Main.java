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

        box.setter("banana");

        System.out.println(box.getter());


        enums myPlanets = enums.EARTH;
        canILiveHere(myPlanets);
    }

    static void canILiveHere(enums planet){
        switch (planet){
            case MARS -> System.out.println("U can live here" + " And it's a #" + planet.number);
            case EARTH -> System.out.println("Of course"+ " And it's a #" + planet.number);
            case PLUTO -> System.out.println("NO!"+ " And it's a #" + planet.number);
            case VENUS -> System.out.println("May be..."+ " And it's a #" + planet.number);
            case SATURN -> System.out.println("Yes))))");
            case URANUS -> System.out.println("Obviously no"+ " And it's a #" + planet.number);
            case JUPITER -> System.out.println("nonono"+ " And it's a #" + planet.number);
        }
    }
}