public class Main {
    public static void main(String[] args) {
        logiNTester Ma = new logiNTester();
        boolean TrueLogin = Ma.isLoginValid("doffi");
        if (TrueLogin) System.out.println("!Логин подходит!");
        else System.out.println("Логин не подходит!!!");

    }
}

