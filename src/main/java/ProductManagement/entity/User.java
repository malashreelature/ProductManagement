package ProductManagement.entity;


import javax.persistence.*;

@Entity
@Table(name = "userslist")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private Long wallet;


    private Integer productsBuyed;

    public User() {
        super();
    }


    public User(Long id, String name, String email, String password, String firstName, String lastName,
                Long wallet) {
        super();
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wallet = wallet;
    }

    public Integer getProductsBuyed() {
        return productsBuyed;
    }

    public void setProductsBuyed(Integer productsBuyed) {
        this.productsBuyed = productsBuyed;
    }

    public User(Integer productsBuyed) {
        this.productsBuyed = productsBuyed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getWallet() {
        return wallet;
    }

    public void setWallet(Long wallet) {
        this.wallet = wallet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", wallet=" + wallet +
                ", productsBuyed=" + productsBuyed +
                '}';
    }
}
