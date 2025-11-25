public final class PairComparator {
    private PairComparator() {}

    // TODO:
    // 1. Lengkapi parameter generik method yang merupakan kelas-kelas yang
    // menerapkan interface Comparable
    // 2. Lengkapi parameter generik dari pair yang dibandingkan
    public static <P extends Comparable<? super P>, Q extends Comparable<? super Q>> boolean isGreater(Pair<? extends P, ? extends Q> p1, Pair<? extends P, ? extends Q> p2) {
        return p1.getFirst().compareTo(p2.getFirst()) > 0 && p1.getSecond().compareTo(p2.getSecond()) > 0;
    }
}
