
public class StockDemo {
    public static void main(String args[]) {
        StockManager demo = new StockManager();
        Product banana = new Product("001", "banana", 20);
        demo.addProduct(banana);
        Product apple = new Product("002", "apple", 13);
        demo.addProduct(apple);
        Product mango = new Product("003", "mango", 14);
        demo.addProduct(mango);
        
        demo.printProductDetails();
        Product pro = demo.findProduct("001");
        System.out.println(pro.toString());
        System.out.println("002在库存中的数量：" + demo.numberInStock("002"));
        demo.delivery("002");
        System.out.println("002在库存中的数量：" + demo.numberInStock("002"));
        demo.printLowStockProducts(15);
        System.out.println("搜索\"apple\"：");
        pro = demo.findProductByName("apple");
        System.out.println(pro.toString() + "\n");
        
        Product error = new Product("001", "error", 13);
        demo.addProduct(error);
    }
}
