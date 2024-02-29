package Class;

import Abstract.Obj;

public class Planet extends Obj {
    protected int CountOfRocket = 0;
    public Planet(String name) {
        super(name);
    }
    public boolean SeatAble() {
        return CountOfRocket < 10;
    }
}
