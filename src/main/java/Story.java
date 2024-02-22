import Class.*;
import Enum.Size;

public class Story {
    public static void main(String[] args) {
        Shorties shorties = new Shorties("Коротышки");
        shorties.Shout("ура", 3);

        Plant grass = new Plant("травка");
        grass.addSize(Size.TINY);
        grass.addSize(Size.UNDERSIZED);
        grass.addSize(Size.NOEARTH);
        Plant flowers = new Plant("цветочки");
        flowers.equate_size(grass);

        shorties.suppose(grass.toString());
        shorties.see(flowers);
        shorties.laught();

        Plant trees = new Plant("Деревья");
        trees.addSize(Size.SMALL);
        trees.addSize(Size.LIKEABROOM);
        trees.addSize(Size.EARTH);
        System.out.println(trees.toString());

        Plant oak = new Plant("Лунный дуб");
        Acorn acorn = new Acorn("желуди");
        acorn.addSize(Size.TINY);
        Leave leave = new Leave("листочки");
        leave.addSize(Size.TINY);
        Trunk trunk = new Trunk("растрескавшийся, морщинистый ствол");
        Twigs twigs = new Twigs("узловатые веточки");
        oak.contain(acorn);
        oak.contain(leave);
        oak.contain(trunk);
        oak.contain(twigs);
        oak.imagine();
        System.out.println(oak.toString());
        oak.imagine(" который растет в комнате на окне в цветочном горшке вместо комнатного цветка");
        Plant birch = new Plant("березки");
        birch.addSize(Size.MINI);
        Plant pine = new Plant("сосны");
        pine.equate_size(birch);
        Plant willows = new Plant("плакучие ивы");
        willows.equate_size(birch);
    }
}
