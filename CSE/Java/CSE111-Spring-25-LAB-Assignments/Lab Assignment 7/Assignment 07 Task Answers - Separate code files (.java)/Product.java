class Product {
private int id;
private String title;
private int price;
public Product(int id, String title, int price) {
this.id = id;
this.title = title;
this.price = price;
}
public String getIdTitlePrice() {
return "ID: " + id + " Title: " + title + " Price: " + price;
}
} 