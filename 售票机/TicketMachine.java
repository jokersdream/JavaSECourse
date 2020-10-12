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
        price = 1000;
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
        
}
