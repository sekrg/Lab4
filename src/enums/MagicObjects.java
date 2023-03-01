package enums;

public enum MagicObjects {
    HAT("Волешбная шляпа"),
    SWORD("меч Годрика Гриффиндора"),
    PHOENIX("Фоукс"),
    STICK("Волебшная палочка"),
    BOTTLE("Сосуд"),
    CASE("Футляре"),
    WARDROBE("Шкафчику"),
    WEAPON("Серебрянный мечь");


    private String name;

    MagicObjects(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }



}
