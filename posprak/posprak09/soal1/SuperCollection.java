import java.util.*;

// TODO: Buat constructor yang menerima List<Integer> sebagai parameter 
// Inisialisasi atribut collection dengan parameter yang diterima
public class SuperCollection {
    private List<Integer> collection;

    public SuperCollection(List<Integer> collection) {
        this.collection = new ArrayList<>(collection);
    }

// TODO: Buat method partitionByCondition(int threshold)
// Pisahkan collection menjadi dua grup: element <= threshold dan element > threshold 
// Return List<List<Integer>> dimana: 
// - Index 0 berisi element <= threshold 
// - Index 1 berisi element > threshold 
// 
// HINT: 
// - Perlu membuat struktur data untuk menampung dua kelompok element 
// - Gunakan loop untuk mengiterasi collection dan kondisi untuk memisahkan
    public List<List<Integer>> partitionByCondition(int threshold) {
        List<Integer> lessOrEqual = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (Integer value: collection) {
            if (value<=threshold) {
                lessOrEqual.add(value);
            } else {
                greater.add(value);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(lessOrEqual);
        result.add(greater);

        return result;
    }

    // TODO: Buat method findTopN(int n)
    // Return List<Integer> berisi n element terbesar dalam urutan descending
    // Jika n lebih besar dari ukuran collection, return semua element yang ada
    // Pastikan hasilnya terurut dari terbesar ke terkecil
    //
    // HINT:
    // - Collection asli tidak boleh dimodifikasi
    // - Pertimbangkan cara mengurutkan List dalam urutan terbalik
    // - Collections class memiliki method utility yang berguna

    public List<Integer> findTopN(int n) {
        List<Integer> copy = new ArrayList<>(collection);
    
        copy.sort(Collections.reverseOrder());

        if (n >= copy.size()) {
            return copy;
        } else {
            return new ArrayList<>(copy.subList(0, n));
        }
    }

    // TODO: Buat method runningSum()
    // Return List<Integer> berisi cumulative sum
    // Element ke-i berisi jumlah dari element index 0 sampai i
    // Contoh: [1, 2, 3, 4] -> [1, 3, 6, 10]
    //
    // HINT:
    // - Perlu menyimpan state (akumulasi) saat iterasi
    // - Setiap element dalam result adalah hasil penjumlahan sampai index tersebut

    public List<Integer> runningSum() {
        List<Integer> result = new ArrayList<>();
        int sum = 0;

        for (Integer value : collection) {
            sum += value;
            result.add(sum);
        }

        return result;
    }

    // TODO: Buat method findPairsWithSum(int targetSum)
    // Cari semua pasangan element yang jika dijumlahkan = targetSum
    // Return List<String> dengan format "a+b=sum"
    // Hindari duplikat pasangan (a,b) dan (b,a) dianggap sama
    // Urutkan hasil berdasarkan nilai a
    //
    // HINT:
    // - Perlu mengecek setiap kemungkinan pasangan element
    // - Bagaimana cara menghindari duplikat seperti "3+5" dan "5+3"?
    // - Pertimbangkan struktur data yang otomatis mengurutkan dan menghindari duplikat
    // - TreeSet adalah Set yang sorted
    // - Gunakan .addAll untuk menambahkan seluruh elemen dari set ke List hasil kalian
    public List<String> findPairsWithSum(int targetSum) {
        Set<String> pairSet = new TreeSet<>();

        for (int i = 0; i < collection.size(); i++) {
            for (int j = i + 1; j < collection.size(); j++) {
                int a = collection.get(i);
                int b = collection.get(j);

                if (a + b == targetSum) {
                    int first = Math.min(a, b);
                    int second = Math.max(a, b);
                    String pairString = first + "+" + second + "=" + targetSum;
                    pairSet.add(pairString);
                }
            }
        }

        return new ArrayList<>(pairSet);
    }
    

    private static class ValueFrequency {
        int value;
        int frequency;

        ValueFrequency(int value, int frequency) {
            this.value = value;
            this.frequency = frequency;
        }
    }

    // TODO: Buat method getMostFrequentElements(int n)
    // Return List<Integer> berisi n element yang paling sering muncul
    // Jika ada element dengan frekuensi sama, pilih yang nilainya lebih besar
    //
    // HINT:
    // - Langkah 1: Identifikasi semua element unik
    // - Langkah 2: Hitung berapa kali setiap element muncul
    // - Langkah 3: Urutkan berdasarkan frekuensi (tinggi ke rendah), lalu nilai (tinggi ke rendah)
    // - Pertimbangkan membuat helper class untuk menyimpan pasangan (value, frequency)
    // - Untuk sorting custom, gunakan Comparator
    public List<Integer> getMostFrequentElements(int n) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer value : collection) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        List<ValueFrequency> vfList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            vfList.add(new ValueFrequency(entry.getKey(), entry.getValue()));
        }

        vfList.sort(new Comparator<ValueFrequency>() {
            @Override
            public int compare(ValueFrequency o1, ValueFrequency o2) {
                if (o1.frequency != o2.frequency) {
                    return Integer.compare(o2.frequency, o1.frequency); // freq tinggi dulu
                } else {
                    return Integer.compare(o2.value, o1.value); // value besar dulu
                }
            }
        });

        List<Integer> result = new ArrayList<>();
        int limit = Math.min(n, vfList.size());
        for (int i = 0; i < limit; i++) {
            result.add(vfList.get(i).value);
        }

        return result;
    }

    // TODO: Buat method getCollection()
    // Return collection yang sedang digunakan (type: List<Integer>)

    // TODO: Buat method setCollection(List<Integer> newCollection)
    // Set atribut collection dengan newCollection

    public List<Integer> getCollection() {
        return collection;
    }

    public void setCollection(List<Integer> newCollection) {
        this.collection = new ArrayList<>(newCollection);
    }
}
