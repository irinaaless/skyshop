package product;


import search.Searchable;

public abstract class Product implements Searchable {
    private String name;

    public Product (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();
    public boolean isSpecial(){
        return false;
    }

    @Override
    public String searchTerm() {
        return name;
    }

    @Override
    public String searchContent() {
        return "PRODUCT";
    }
}
