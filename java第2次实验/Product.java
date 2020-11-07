//Product类用来描述公司出售的产品，其中记录了产品的ID、名字和当前的库存。
//Product类中定义了increaseQuantity方法来提高该产品的库存级别。
//SellOne方法通过将其库存量减1来记录出售了一件该产品。
public class Product {
    protected final String id;
    protected final String name;
    protected int stocks;
    public Product(String id_, String name_, int stocks_){
        id = id_;
        name = name_;
        stocks = stocks_;
    }
    public boolean increaseQuantity(int increase){
        stocks += increase;
        return true;
    }
    public boolean sellOne(){
        stocks--;
        return true;
    }
    public String toString(){
        return "id: " + id + "\tname: " + name + "\tstocks: " + stocks;
    }
}
