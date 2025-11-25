public class Mammal extends Animal {
    public enum FurType {
        SHORT,
        LONG,
        THICK,
        NONE
    }

    private FurType furType;

    /**
     * Konstruktor untuk kelas Mammal.
     * 
     * @param name
     * @param species
     * @param habitat
     * @param sound
     * @param furType jika null maka di-set ke FurType.SHORT
     */
    public Mammal(String name, String species, String habitat, String sound, FurType furType) {
        // TODO: lengkapi method ini
        super(name,species,habitat,sound,AnimalType.MAMMAL);
        this.furType=(furType == null) ? FurType.SHORT: furType;
    }

    public FurType getFurType() {
        return furType;
    }

    @Override
    public String sound() {
        return super.sound();
    }
}
