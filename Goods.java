import java.util.Comparator;

abstract public class Goods {
    private double price;
    private String name;
    private int id;

    public Goods(){
        this.price = 0;
        this.id = 0;
        this.name = "Undefined";
    }

    public Goods(double price, String name, int id){
        this.price = price;
        this.id = id;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "name=" + name +
                ", price='" + price + " $" +'\'' +
                ", id=" + id;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Goods && this.price == ((Goods) obj).price
                && this.id == ((Goods) obj).id
                && this.name.equals(((Goods) obj).name);
    }

    static class GoodsNameComparator implements Comparator<Goods>{
        @Override
        public int compare(Goods good1, Goods good2) {
            if(good1 == null){
                return -1;
            }
            if(good2 == null){
                return 1;
            }
            return good1.name.compareTo(good2.name);
        }
    }

    public static Comparator<Goods> GoodsPriceComparator = new Comparator<Goods>() {
        @Override
        public int compare(Goods good1, Goods good2) {
            return Double.compare(good1.price, good2.price);
        }
    };
}
