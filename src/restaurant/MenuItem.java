package restaurant;

import java.text.NumberFormat;

public class MenuItem {
    // price, description, and category (appetizer, main course, or dessert)
    private Double price;
    private String description;
    private String category;
    private Boolean isItemNew;

    // constructor
    public MenuItem (String description,String category,Double price) {

        this.description = description;
        this.price = price;
        this.category = category;
        this.isItemNew =isItemNew;
    }

    NumberFormat numForm = NumberFormat.getCurrencyInstance();

    //setter and getter
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public Boolean getIsItemNew() {
        return isItemNew;
    }

    public void setisItemNew(Boolean isItemNew) {
        this.isItemNew = isItemNew;
    }

    //to String

    public String toString() {
        return description +"\t"+ numForm.format(price);
    }
}
