/*
 * Buatlah kelas Resource dengan attribut String name dan Object lock
 * Inisiasi kelas dengan konstruktor menerima parameter String name
 * Object lock diinisiasi dengan object baru
*/
public class Resource{
    private String name;
    private final Object lock;

    public Resource(String name){
        this.name = name;
        this.lock = new Object();
    }

    public String getName(){
        return name;
    }

    public Object getLock(){
        return lock;
    }
}
