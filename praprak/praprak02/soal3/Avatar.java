class Avatar {
    // TODO: Deklarasi atribut: namaSkin (String), level (int)
    String namaSkin;
    int level;

    // TODO: Constructor set namaSkin dan level
    Avatar(String namaSkin, int level) {
        // HINT: this.namaSkin = namaSkin; dst.
        this.namaSkin = namaSkin;
        this.level = level;
    }

    // TODO: Naikkan level (level++) dan cetak:
    // "Skin <namaSkin> naik ke level <level>."
    void upgradeLevel() {
        // HINT: Urutan: tingkatkan level, lalu cetak
        this.level += 1;
        System.out.println("Skin "+namaSkin+" naik ke level "+level+".");
    }
}