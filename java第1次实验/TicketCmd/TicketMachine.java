import java.util.Scanner;
public class TicketMachine
{
    private int price;
    private int balance;
    private int total;

    
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }
    
    public TicketMachine()
    {
        price = 2;
        balance = 0;
        total = 0;
    }

    public int getPrice()
    {
        return price;
    }

    public int getBalance()
    {
        return balance;
    }
    
    public void setPrice(int ticketCost)
    {
        price = ticketCost;
    }
/*    
    public void discount(int amount)
    {
        if (amount < 0){
            System.out.println("Use a positive amount rather than: " +
                               amount);
        } else if (amount <= price){
            price -= amount;
        } else {
            System.out.println("Use a smaller amount rather than: " +
                               amount);
        }
        
    }

    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    public void printTicket()
    {
        int amountLeftToPay = balance - price;
        if(amountLeftToPay >= 0) {

            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            total = total + price;

            balance = balance - price;
        } else {
            System.out.println("You must insert at least: " +
                               (-amountLeftToPay) + " more cents.");           
        }
    }
    
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    public void prompt()
    {
        System.out.println("Please insert the correct amount of money.");
    }
    
    public void showPrice()
    {
        System.out.println("The price of a ticket is" + price + "cents.");
    }
    
    public void empty()
    {
        total = 0;
    }
    
    public int emptyMachine()
    {
        int a = total;
        total = 0;
        return a;
    }
    */
    //投币
    public void touBi(){
        Scanner in = new Scanner(System.in);
        balance += in.nextInt();
        System.out.println("当前余额："+balance+" 元");
    }
    //打印车票
    public void daYinChePiao(){
        if(balance >= 2){
            System.out.println("========================\n" +
"This is a ticket\n" +
"price : "+price+" Yuan\n" +
"========================");
            balance -= 2;
            System.out.println("当前余额："+balance+" 元");
        } else {
            System.out.println("余额不足，请先投币！");
        }
    }
    //找零
    public void zhaoLing(){
        System.out.println("请收好找零 "+balance+" 元");
        balance = 0;
    }
    //菜单项
    public void Menu(){
        System.out.println("===============欢迎使用自动售票机===============\n" +
"本机销售固定票价 "+price+" 元的车票\n" +
"请选择服务...\n" +
"1、投币\n" +
"2、打印车票\n" +
"3、找零");
    }
    
}
