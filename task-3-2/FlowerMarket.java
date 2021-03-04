import java.util.ArrayList;
import java.util.List;

public class FlowerMarket {
    public static void main(String[] args) {

        Price price = new Price();
        int archideaPrice = price.getArchidea().getPrice();
        int rosePrice = price.getRose().getPrice();
        int chamomilePrice = price.getChamomile().getPrice();
        int liliyaPrice = price.getLiliya().getPrice();


        Archidea archidea = new Archidea();
        archidea.setPrice(archideaPrice);

        Rose rose = new Rose();
        rose.setPrice(rosePrice);

        Chamomile chamomile = new Chamomile();
        chamomile.setPrice(chamomilePrice);

        Liliya liliya = new Liliya();
        liliya.setPrice(liliyaPrice);


        Bouquet bouquet = new Bouquet();
        bouquet.setRose(rose);
        bouquet.setArchidea(archidea);
        bouquet.setChamomile(chamomile);
        bouquet.setLiliya(liliya);

        List<Flower> flowers = new ArrayList<>();
        flowers.add(archidea);
        flowers.add(rose);
        flowers.add(chamomile);
        flowers.add(liliya);

        printBouquetPrice(flowers);
    }

    private static void printBouquetPrice(List<Flower> flowers){
        int sum = 0;
        for (Flower flower : flowers) {
            sum = sum + flower.getPrice();
        }
        System.out.println("Стоимость букета: " + sum);
    }
}
