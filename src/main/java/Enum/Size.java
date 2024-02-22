package Enum;

public enum Size {
    UNDERSIZED("низкорослые(-ая)"),
    TINY("крошечные(-ая)"),
    NOEARTH("совсем не такие(-ая), как на Земле"),
    SMALL("мелкие(-ая)"),
    LIKEABROOM("не больше веника"),
    MINI("миниатюрные"),
    EARTH("ничем не отличались от земных");
    private final String translation;
    Size (String translation){
        this.translation = translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
