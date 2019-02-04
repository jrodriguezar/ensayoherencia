package javaapplication1;

/**
 *
 * @author jrodriguezar
 */
public class Cliente {
    private int id;
    private String email;
    private String name;
    private String lastName;
    private Asset[] assets;

    public Cliente(int id, String email, String name, String lastName, Asset[] asset) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.assets = new Asset[10];
    }

    public Cliente(int id, String email, String name, String lastName) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.lastName = lastName;
    }
    
    public boolean addAsset(Asset asset){
        //implementar asignacion
        return false;
    }

    public Asset[] getAssets() {
        return assets;
    }
}