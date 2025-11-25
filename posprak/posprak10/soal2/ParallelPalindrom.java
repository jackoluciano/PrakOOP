public class ParallelPalindrom {
    static final int NUM_OF_THREAD = 10;
    
    public boolean isPalindrom(int n) {
        if (n < 0) return false;
        int original = n;
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }
    
    // TODO: Lengkapi method ini untuk mencari bilangan palindrom dari [0, N]
    // WAJIB menggunakan concurrency dengan NUM_OF_THREAD threads!

    // Di dalam method run() dalam runnable WAJIB panggil ThreadTracker.mark();
    // Misal :
    // new Thread(() -> {
    //     ThreadTracker.mark(); <- tambahkan ini ketika ingin submit jawaban
    //     //kode lainnya
    // });
    //
    // Atau
    //
    // run(){
    //   ThreadTracker.mark(); <- tambahkan ini ketika ingin submit jawaban
    //   //kode lainnya
    // }

    public int hitungPalindrom(int N) throws InterruptedException {
        if (N<0) {
            return 0;
        }

        Thread[] threads = new Thread[NUM_OF_THREAD];
        int[] partialCounts = new int[NUM_OF_THREAD];

        int chunkSize = (N+ NUM_OF_THREAD)/NUM_OF_THREAD; 

        for (int i= 0; i<NUM_OF_THREAD; i++) {
            final int index = i;
            final int start = i * chunkSize;
            final int end = Math.min(N, start+chunkSize-1);

            threads[i] = new Thread(()->{
                ThreadTracker.mark();
                int count=0;
                for (int x=start; x<=end;x++) {
                    if (isPalindrom(x)) {
                        count++;
                    }
                }
                partialCounts[index]=count;
            });
            threads[i].start();
        }

        for (int i=0; i<NUM_OF_THREAD; i++) {
            threads[i].join();
        }
        int total=0;
        for (int i=0; i<NUM_OF_THREAD; i++) {
            total+=partialCounts[i];
        }

        return total;
    }

}