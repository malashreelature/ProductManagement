package ProductManagement.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
    @Table(name ="productslist")
    public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "manufacturer")
    private Date manufacturer;

    @Column(name = "price")
    private String price;

    @Column(name = "Description")
    private String Description;

    @Column(name = "stocks")
    private int stocks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Date manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    public Product(){}

    public Product(Long id, String name, Date manufacturer, String price, String description, int stocks) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        Description = description;
        this.stocks = stocks;
    }


}
