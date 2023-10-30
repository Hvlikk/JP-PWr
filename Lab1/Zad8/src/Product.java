public class Product implements Comparable<Product> {
    private String name;
    private Float price;

    public Product(String name, Float price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product o) {
        if (this.price < o.price)
            return -1;
        else if (this.price > o.price)
            return 1;
        else
            return 0;
    }
}
