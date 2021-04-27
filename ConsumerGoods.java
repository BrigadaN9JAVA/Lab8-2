public class ConsumerGoods extends Goods {
    private double weight;

    public ConsumerGoods(){
        super();
        this.weight = 0;
    }

    public ConsumerGoods(double price, String name, int id, double weight){
        super(price, name, id);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nweight=" + weight + " kg";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ConsumerGoods && super.equals(obj) && this.weight == ((ConsumerGoods) obj).weight;
    }
}
