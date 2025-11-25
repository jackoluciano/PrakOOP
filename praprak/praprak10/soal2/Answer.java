public class Answer {
    public static void runUrAnswer(){
        Resource cpu = new Resource("CPU");
        Resource io0 = new Resource("IO0");
        Resource io1 = new Resource("IO1");

        ProcessTask P0 = new ProcessTask("P0", cpu, io0);
        ProcessTask P1 = new ProcessTask("P1", cpu, io1);
        ProcessTask P2 = new ProcessTask("P2", cpu, io0);

        try{
            P0.start();
            P0.join();

            P1.start();
            P1.join();

            P2.start();
            Thread.sleep(120);

            P2.interrupt();
            P2.join();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    /*
     * Implementasikan skenario berikut pada metode runUrAnswer():
     * 
     * Sistem operasi memiliki tiga proses: P0, P1, dan P2.
     * Dengan satu CPU:"CPU" dan dua perangkat I/O: "IO0" dan "IO1".
     * Setiap proses memerlukan akses ke sumber daya CPU dan sumber daya I/O untuk menyelesaikan tugasnya.
     * Proses P0 dan P2 berbagi sumber daya I/O yang sama (IO0), 
     *      sedangkan P1 menggunakan sumber daya I/O yang berbeda (IO1).
     * Proses dieksekusi secara berurutan: P0, diikuti oleh P1, dan akhirnya P2.
     * Namun, selama eksekusi P2, proses ini diinterupsi saat mencoba mengakses sumber daya I/O.
     * Tugas Anda adalah mensimulasikan skenario ini menggunakan kelas ProcessTask dan Resource.
     * Contoh output yang diharapkan ada pada file output.txt
     */
}
