import java.util.Scanner;
public class TicketCmd {
    
    public static void main(String args[]) {
        TicketMachine tic = new TicketMachine();
        
        while(true){
            tic.Menu();
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice > 0 && choice < 4){
                switch(choice){
                    case 1: tic.touBi();    break;
                    case 2: tic.daYinChePiao(); break;
                    case 3: tic.zhaoLing(); break;
                }
            } else {
                System.out.println("请输入菜单项！");
            }
        }
    }
}
