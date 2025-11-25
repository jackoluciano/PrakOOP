// TODO:
// Lengkapi parameter generik dari kelas Pair.
// Note: disarankan parameter generik dalam kelas ini tidak perlu menggunakan bounded generic
public final class Pair<P,Q> {
    P first;
    Q second;

    public Pair(P first, Q second) {
    // TODO:
    // 1. Simpan parameter first dan second
        this.first = first;
        this.second = second;
    }

    public P getFirst() {
        // TODO:
        // 1. Kembalikan nilai elemen pertama dari pair.
        // ...
        return first;
    }

    public Q getSecond() {
        // TODO:
        // 1. Kembalikan nilai elemen kedua dari pair.
        // ...
        return second;
    }
}
