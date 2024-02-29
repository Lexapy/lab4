package Class;

import Abstract.Obj;

public class Planet extends Obj {
    protected int countOfRocket = 0;
    public Planet(String name) {
        super(name);
    }
    public boolean seatAble() {
        return countOfRocket < 10;
    }
}
