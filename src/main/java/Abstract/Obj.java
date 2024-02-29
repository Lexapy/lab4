package Abstract;

import Enum.Size;
import Interface.*;
import Exception.NotNameException;

import java.util.ArrayList;

public abstract class Obj implements Imaginable, Composite {
    protected String name;
    protected ArrayList<Size> size = new ArrayList<>();
    protected ArrayList<String> with = new ArrayList<>();
    public Obj(String name) {
        if (name.isEmpty()) {
            throw new NotNameException("Должно быть имя!");
        }
        this.name = name;
    }
    public void addSize(Size new_size) {
        size.add(new_size);
    }
    public String getName() {
        return this.name;
    }
    public ArrayList<Size> getSize() {
        return size;
    }
    public String toString() {
        String result = name;

        if (!this.size.isEmpty()) {
            result += " ";
            for(int i = 0; i < this.size.size(); i++) {
                if (i != this.size.size() - 1) {
                    result += this.size.get(i).toString() + ", ";
                } else {
                    result += this.size.get(i).toString();
                }
            }
        }
        return result;
    }
    @Override
    public void imagine(String idea) {
        System.out.println("Представьте себе, что есть " + name + idea);
    }
    @Override
    public void imagine() {
        System.out.println("Представьте себе, что есть " + name);
    }
    @Override
    public void contain(Obj some) {
        with.add(some.toString());
    }
}
