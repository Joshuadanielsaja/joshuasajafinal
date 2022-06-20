package com.example.saja;

public class Products {
    private String id, name, quantity, type, price,image;
public Products(){

}
    public Products(String id, String name, String quantity, String type, String price) {
        this.id = id;
        this.name = name;
        this.quantity= quantity;
        this.type = type;
        this.price = price;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity= quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}

