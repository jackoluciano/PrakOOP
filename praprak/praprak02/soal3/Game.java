class Game {
    // TODO: Deklarasi atribut: namaGame (String), genre (String), developer
    String namaGame;
    String genre;
    Developer developer;

    int playerCount= 0;
    static int totalGame;
    // (Developer)
    // TODO: Deklarasi atribut: playerCount (int) awal 0
    // TODO: Deklarasi atribut statik: totalGame (int)

    // TODO: Constructor set semua field dan increment totalGame
    Game(String namaGame, String genre, Developer developer) {
        // HINT: this.namaGame = ...; dst.
        this.namaGame = namaGame;
        this.genre = genre;
        this.developer = developer;
        totalGame++;
    }

    // TODO: Saat player join, increment playerCount dan cetak:
    // "<username> bergabung ke game <namaGame>."
    void joinGame(Player p) {
        // HINT: Akses p.username
        playerCount+=1;
        System.out.println(""+p.username+" bergabung ke game "+namaGame+".");
    }

    // TODO: Kembalikan totalGame
    static int getTotalGame() {
        return totalGame; // ganti dengan nilai dari totalGame
    }
}