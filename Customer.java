import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private int price;
    private String author;
    private int quantity;
    private String publication;
    private int datePublication;
    private int quanOrder;
    private int totalCost;

    // Constructor, getters, and setters
    public Customer() {
        // Default constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public int getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(int datePublication) {
        this.datePublication = datePublication;
    }

    public int getQuanOrder() {
        return quanOrder;
    }

    public void setQuanOrder(int quanOrder) {
        this.quanOrder = quanOrder;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
