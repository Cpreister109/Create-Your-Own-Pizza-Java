package pizza;

public class AbstractMenuItem implements MenuItem, Comparable<MenuItem> {

    public Double getPrice() {
        return this.getPrice();
    }

    public int compareTo(MenuItem otherItem) {
        return this.getPrice() > otherItem.getPrice() ? 1 : ((this.getPrice() == otherItem.getPrice()) ? 0 : -1);
    }
}