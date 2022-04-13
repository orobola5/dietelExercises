package tddClass;

import java.util.Scanner;

public class Atm {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank accessBank = new Bank("accessBank", 20);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        String prompt = """
                welcome to GtBank,
                press softly
                1 -> To create account.
                2 -> To put money.
                3 -> To commot money.
                4 -> To send urgent 2k.
                5 -> To check balance.
                6 -> To exit.
                """;
        System.out.println(prompt);
        int userResponse = scanner.nextInt();
        switch (userResponse) {
            case 1 -> createAccount();
            case 2 -> putMoney();
            case 3 -> commotMoney();
            case 4 -> sendUrgent2K();
            case 5 -> checkBalance();
            case 6 -> exit();
            default -> runApp();
        }
    }

    private static void exit() {
        System.out.println("Thank you for banking with us");
        System.exit(0);
    }

    private static void checkBalance() {
        System.out.println("what's your account number");
        String accountNumber = scanner.nextLine();
        System.out.println("Your pin");
        String pin = scanner.nextLine();
        MyAccount loveAccount = accessBank.findAccount(Integer.parseInt(accountNumber));
        System.out.println("Your balance is" + loveAccount.getAmount());

    }

    private static void sendUrgent2K() {
        System.out.println("wetin be ur account number biko: ");
        String senderAccountNumber = scanner.nextLine();
        System.out.println("Enter the account number of the receiver: ");
        String receiverAccountNumber = scanner.nextLine();
        System.out.println("how much do u want to send: ");
        int howMuch = scanner.nextInt();

        accessBank.transfer(howMuch, senderAccountNumber,receiverAccountNumber,"pin");
        MyAccount fromAccount = accessBank.findAccount(Integer.parseInt(senderAccountNumber));

        System.out.println("New balance is "+ fromAccount.getAmount());

    }

    private static void createAccount () {
            System.out.println("Enter your real name");
            String firstName = scanner.next();
            System.out.println("Enter your papa name");
            String papaName = scanner.next();
            System.out.println("Enter your pin");
            String pin = scanner.next();
            MyAccount savedAccount = accessBank.createAccountFor("firstName", "papaName", "pin");
            System.out.println(savedAccount);
            System.out.println();
            System.out.println();
            runApp();
        }

        private static void putMoney () {
            System.out.println("which Account");
            String accountNumber = scanner.next();
            MyAccount loveAccount = accessBank.findAccount(Integer.parseInt(accountNumber));
            System.out.println("The Account name is " + loveAccount.getName());
            System.out.println("How much");
            int howMuch = scanner.nextInt();
            accessBank.deposit(howMuch, accountNumber);
            System.out.println();
            System.out.println(loveAccount);
            System.out.println();
            scanner.next();
            runApp();


            System.out.println();
            runApp();
        }
        private static void commotMoney() {
            System.out.println("which Account");
            String accountNumber = scanner.next();
            MyAccount loveAccount = accessBank.findAccount(Integer.parseInt(accountNumber));
            System.out.println("How much");
            int howMuch = scanner.nextInt();
            accessBank.withDraw(howMuch,accountNumber);
            System.out.println("New balance is"+ loveAccount.getAmount());
            System.out.println();
            scanner.next();
            runApp();


            System.out.println();
            System.out.println();
            runApp();

        }
    }



