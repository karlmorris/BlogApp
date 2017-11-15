
package blogapp;

public class BlogApp {

    
    public static void main(String[] args) {
        Savable savable = new SavableProxy();
        savable.save(5, "Hey, I am posting again! Whaddup Fam!!!");
    }
    
}
