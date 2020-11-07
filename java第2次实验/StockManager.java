//StockManager类用来管理公司所有产品的库存，其中用一个ArrayList容器来保存Product类的对象，即公司出售的每一种产品都对应一个Product类的对象。
//它已经有一个addProduct方法，用来把一个Product类的对象加入容器。
import java.util.ArrayList;
public class StockManager {
    static ArrayList<Product> manager = new ArrayList();
//实现printProductDetails方法，该方法可以遍历产品的容器，并通过调用每个Product对象的toString方法来打印出所有产品的详细信息。
    public StockManager() {
    }
    
    public void printProductDetails() {
        for (Product temp : manager){
            System.out.println(temp.toString());
        }
        System.out.println();
    }
//实现findProduct方法，这个方法应该在容器中搜索与其参数ID相匹配的ID的产品。
//  如果能找到匹配的产品，就返回这个产品；如果找不到匹配的产品，就返回null。
    public Product findProduct(String id_) {
        for (Product temp : manager) {
            if (temp.id.equals(id_)) {
                return temp;
            }
        }
        return null;
    }
//实现numberInStock方法，这个方法在容器中找到ID匹配的产品，然后返回该产品当前的数量。如果找不到ID匹配的产品，则返回0。
    public int numberInStock(String id_) {
        for (Product temp : manager) {
            if (temp.id.equals(id_)) {
                return temp.stocks;
            }
        }
        return 0;
    }
//实现delivery方法，它根据给定的ID找到产品，然后调用产品的increaseQuantity方法，为该产品增加指定的库存数量。
    public void delivery(String id_) {
        for (Product temp : manager) {
            if (temp.id.equals(id_)) {
                temp.increaseQuantity(100);
            }
        }
    }
//实现printLowStockProducts方法，该方法能够打印出所有库存水平低于给定值（作为参数传递给方法）的产品的详情。
    public void printLowStockProducts(int edge) {
        boolean check = true;
        System.out.println("以下为所有库存水平低于" + edge + "的产品的详情：");
        for (Product temp : manager) {
            if (temp.stocks < edge) {
                check = false;
                System.out.println("id: " + temp.id + "\tname: " + temp.name + "\tstocks: " + temp.stocks);
            }
        }
        if (check) {
            System.out.println("\tnull");
        } else {
            System.out.println();
        }
    }
//修改addProduct方法，使得新产品的ID如果与已有产品列表的ID相同就无法加入。
    public void addProduct(Product adder) {
        boolean check = true;
        for (Product temp : manager){
            if (temp.id.equals(adder.id)) {
                System.out.println("error: ID重复！");
                check = false;
                break;
            }
        }
        if (check) {
            manager.add(adder);
        }
    }
//实现findProductByName方法，这个方法能够根据产品的名称（而不是ID）在容器中搜索相匹配的产品。
//    如果能找到匹配的产品，就返回这个产品；如果找不到匹配的产品，就返回null。
    public Product findProductByName(String name_){
        for (Product temp : manager) {
            if (temp.name.equals(name_)) {
                return temp;
            }
        }
        return null;
    }
}
