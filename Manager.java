import java.util.Set;
import java.util.TreeSet;

public class Manager {
    Set<Goods> goodsSortedByName;
    Set<Goods> goodsSortedByPrice;

    public Manager(){
        goodsSortedByName = new TreeSet<>(new Goods.GoodsNameComparator());
        goodsSortedByPrice = new TreeSet<>(Goods.GoodsPriceComparator);
    }

    public void addConsumerGoods(ConsumerGoods g){
        try {
            if (g.getId() <= 0) throw new IllegalArgumentException("Id is not correct");
            if (g.getPrice() <= 0) throw new IllegalArgumentException("Price is not correct");
            if (g.getWeight() <= 0) throw new IllegalArgumentException("Weight is not correct");
            goodsSortedByName.add(g);
            goodsSortedByPrice.add(g);
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
    }

    public void display(){
        System.out.println("Sorted by Name:");
        for (var good: goodsSortedByName) {
            System.out.println(good);
        }
        System.out.println("==================================");
        System.out.println("Sorted by Price:");
        for (var good: goodsSortedByPrice) {
            System.out.println(good);
        }
    }

}
