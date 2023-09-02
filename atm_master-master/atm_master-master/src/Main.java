import atm.service.impl.AccountServiceImpl;

public class Main {
    public static void main(String[] args) {
        AccountServiceImpl accountService=new AccountServiceImpl();
        accountService.singUp("Nurjigit","Umarov");
        accountService.singUp("Pysbek","Sharapov");
        System.out.println("hello");

       while (true){
           accountService.singIn("Nurjigit","Umarov");
       }



    }
}