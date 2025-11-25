public class Aves extends Animal {
    private boolean canFly;

    /**
     * Konstruktor untuk kelas Aves.
     * 
     * @param name
     * @param species
     * @param habitat
     * @param sound
     * @param canFly
     */
    public Aves(String name, String species, String habitat, String sound, boolean canFly) {
        super(name, species, habitat, sound, AnimalType.AVES);
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    @Override
    public String sound() {
        return super.sound();
    }
}
