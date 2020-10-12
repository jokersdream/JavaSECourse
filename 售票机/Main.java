public class Main
{
    public static void main(String[] args){
        TicketMachine machine = new TicketMachine(100);
        System.out.println("Balance = " + machine.getBalance());
        
        machine.insertMoney(100);
        System.out.println("Balance = " + machine.getBalance());
        
        TicketMachine a = new TicketMachine(100);
        TicketMachine b = new TicketMachine(200);
        //调用showPrice得到不同的两个结果。price不同。
        
        
    }
}