package Class;

import Abstract.Obj;
import Exception.NoPlaceException;
public class Rocket extends Obj {
    public Rocket(String name) {
        super(name);
    }

    public static class Tail{
        public void sitDown() {
            System.out.println("Ракета оперлась хвостовой частью и остановилась.");
        }
    }

    public void seat(Planet planet) throws NoPlaceException {
        if (planet.seatAble()) {
            System.out.println("Посадка была удачной.");
        } else {
            throw new NoPlaceException("больше нет места для ракет");
        }
    }

}
