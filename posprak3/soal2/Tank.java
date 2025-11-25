public class Tank extends Hero {
    // TODO: Buat atribut: armor, shield
    private int armor;
    private int shield;

    // TODO: Buat constructor yang menerima name, hp, attackPower, armor, shield
    // Gunakan super() untuk panggil constructor parent dengan role "Tank"
    public Tank(String name, int hp, int attackPower, int armor, int shield){
        super(name, hp, attackPower, "Tank");
        this.armor = armor;
        this.shield = shield;
    }

    // TODO: Override method specialSkill()
    // Tank menggunakan "Shield Wall", tampilkan format:
    // "<name> activates Shield Wall! Shield: <shield>"
    // Contoh: "Tigreal activates Shield Wall! Shield: 100"
    @Override
    public void specialSkill(){
        System.out.println(name+" activates Shield Wall! Shield: "+ shield);
    }   

    // TODO: Buat method levelUp() yang override parent
    // Panggil super.levelUp() dulu, lalu tambah armor +5, shield +30, hp bonus +30
    // Tampilkan pesan bonus: "Bonus Tank: +5 armor, +30 shield, +30 bonus HP!"
    @Override
    public void levelUp(){
        super.levelUp();
        this.armor += 5;
        this.shield+=30;
        this.hp += 30;
        System.out.println("Bonus Tank: +5 armor, +30 shield, +30 bonus HP!");
    }           

    // TODO: Buat method taunt() untuk menarik perhatian musuh
    // Format: "<name> berteriak dan menarik perhatian semua musuh! Armor: <armor>"
    // Contoh: "Tigreal berteriak dan menarik perhatian semua musuh! Armor: 25"
    public void taunt(){
        System.out.println(name+" berteriak dan menarik perhatian semua musuh! Armor: "+ armor);
    }

    // TODO: Buat method takeDamage(int damage)
    // Armor mengurangi damage terlebih dahulu, lalu shield menyerap sisa damage
    // Format: "<name> menerima <effectiveDamage> damage! HP: <hp>, Shield: <shield>"
    // Contoh: "Tigreal menerima 35 damage! HP: 415, Shield: 55"
    public void takeDamage(int damage){
        int afterArmor = Math.max(0, damage-armor);
        armor = Math.max(0,armor-damage);

        int absorbedByShield = Math.min(shield,afterArmor);
        shield-=absorbedByShield;

        int damageToHp = afterArmor-absorbedByShield;
        hp-=damageToHp;
        if (hp<0){
            hp = 0;
        }
        System.out.println(name+ " menerima "+damageToHp+" damage! HP: "+hp+", Shield: "+shield);
    }

    // TODO: Buat getter dan setter untuk armor dan shield
    public int getArmor(){
        return this.armor;
    }

    public int getShield(){
        return this.shield;
    }

    public void setArmor(int armor){
        this.armor = armor;
    }

    public void setShield(int shield){
        this.shield = shield;
    }
}