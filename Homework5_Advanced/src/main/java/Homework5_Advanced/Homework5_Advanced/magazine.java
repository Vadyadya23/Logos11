package Homework5_Advanced.Homework5_Advanced;

public class magazine {
    private int id;
    private String title;
    private String descript;
    private double price;

    // Конструктор без параметрів
    public magazine() {
    }

    // Конструктор з параметрами
    public magazine(int id, String title, String description, double price) {
        this.id = id;
        this.title = title;
        this.descript = descript;
        this.price = price;
    }

    // Getter і Setter методи для кожної властивості
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return descript;
    }

    public void setDescription(String description) {
        this.descript = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
