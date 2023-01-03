package com.example.seven_wonder.models;

public class Cards {
    private int id;
    private String color;
    private String type;
    private boolean hasSymbol;
    private int victoryPoint;
    private String typeofSymbol;
    private String product;
    private String urlImage;
    private String effect;

    public Cards(int id, String color, String type, boolean hasSymbol, int victoryPoint, String typeofSymbol, String product,String effect, String urlImage) {
        this.id = id;
        this.color = color;
        this.type = type;
        this.hasSymbol = hasSymbol;
        this.victoryPoint = victoryPoint;
        this.typeofSymbol = typeofSymbol;
        this.product = product;
        this.effect = effect;
        this.urlImage = urlImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasSymbol() {
        return hasSymbol;
    }

    public void setHasSymbol(boolean hasSymbol) {
        this.hasSymbol = hasSymbol;
    }

    public int getVictoryPoint() {
        return victoryPoint;
    }

    public void setVictoryPoint(int victoryPoint) {
        this.victoryPoint = victoryPoint;
    }

    public String getTypeofSymbol() {
        return typeofSymbol;
    }

    public void setTypeofSymbol(String typeofSymbol) {
        this.typeofSymbol = typeofSymbol;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
