package Class;
import Abstract.Obj;
public class Plant extends Obj {
    public Plant(String name) {
        super(name);
    }

    public void equate_size(Plant plant) {
        this.size = plant.getSize();
    }

    @Override
    public String toString() {
        String result = super.toString();
        if (!this.with.isEmpty()) {
            result += " на котором ";
            for(int i = 0; i < this.with.size(); i++) {
                //System.out.println(with.get(i));
                if (i != this.with.size() - 1) {
                    result += this.with.get(i) + ", ";
                } else {
                    result += this.with.get(i);
                }
            }
        }
        return result;
    }

}
