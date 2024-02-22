package Class;

import Enum.Size;

import java.util.ArrayList;

public class Shorties {
    private String name;
    public Shorties (String name) {
        this.name = name;
    }

    public void Shout(String text, int count) {
        System.out.println(this.name + " прокричали:");
        for (int i = 0; i < count; ++i) {
            System.out.println(text.toUpperCase()+"!!!");
        }
    }

    public void suppose(String reason) {
        System.out.println(this.name + " удивились, что " + reason);
    }
    public void see(Plant plant) {
        System.out.print("Для того чтобы разглядеть " + plant.getName() + " надо ");
        ArrayList<Size> tmp = plant.getSize();
        if (tmp.contains(Size.TINY) || tmp.contains(Size.SMALL) || tmp.contains(Size.UNDERSIZED)) {
            System.out.println("пригнуться или присесть на корточки");
        } else {
            System.out.println("просто приглядеться");
        }
    }

    public void laught() {
        System.out.println(this.name + " смеялись из-за этого");
    }



}
