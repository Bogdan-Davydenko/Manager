import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Product smart = new Smartphone(100,"iphone",2000,"apple",15, 20);
        Product smart1 = new Smartphone(100,"galaxy",2000,"samsung",15, 20);
        Product smar2 = new Smartphone(100,"experia",2000,"sony",15, 20);
        Product smar3 = new Smartphone(100,"experia2",2000,"sony",15, 20);

        ProductRepository repository = new ProductRepository();

        ProductManager manager = new ProductManager(repository);

        manager.add(smart);
        manager.add(smart1);
        manager.add(smar2);
        manager.add(smar3);

        Product[] search = manager.searchBy("sony");

        for (int i=0;i<search.length;i++){
            System.out.println(search[i].toString());
        }

        //System.out.println(smart.toString());

    }

}
