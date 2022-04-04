package tutorial;

public class StaticCall {
    public static void main(String[] args) {
        Chapter6 six = new Chapter6();
        Chapter6.letsPlay("go");
        six.setAge(2);
        Account account = new Account();
        account.setName("zne");
        System.out.println(account.getName());
        LetsGo goWhere;

        goWhere = LetsGo.MONDAY;
        System.out.println(goWhere);
        System.out.println(  LetsGo.valueOf(String.valueOf(goWhere)));
    }
}
