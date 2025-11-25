public abstract class Animal implements IAnimal {

    private String name;
    private String species;
    private String habitat;
    protected String sound;

    enum AnimalType {
        MAMMAL,
        AVES,
        REPTILE
    }

    private AnimalType animalType;

    /**
     * Fungsi untuk membersihkan input teks.
     * 
     * Jika teks null atau hanya berisi spasi, kembalikan nilai fallback.
     * 
     * @param text
     * @param fallback
     * @return
     */
    private static String sanitizeText(String text, String fallback) {
        if (text == null) {
            return fallback;
        }
        String trimmed = text.trim();
        return trimmed.isEmpty() ? fallback : trimmed;
    }

    /**
     * Konstruktor untuk kelas Animal.
     * 
     * @param name
     * @param species
     * @param habitat
     * @param animalType
     */
    protected Animal(String name, String species, String habitat, String sound, AnimalType animalType) {
        this.name= sanitizeText(name,"Unknown");
        this.species= sanitizeText(species,"Unknown");
        this.habitat= sanitizeText(habitat,"Unknown");
        this.sound= sanitizeText(sound,"-");
        this.animalType= animalType;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    @Override
    public String toString() {
        return "Animal Info:\n"+
                "--------------------\n"+
                "Name: "+name+ "\n"+
                "Species: "+species+"\n"+
                "Habitat: "+habitat+"\n"+
                "--------------------";
    }

    public String sound() {
        return sound;
    }
}
