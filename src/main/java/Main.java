public class Main {

  public static void main(String[] args) {

    Customer customer = new Customer("Maarten", "Postma", new VisaCard(100));
    Customer customer2 = new Customer("Maarten2", "Postma", 1234567, new MasterCard(102));

    customer.printName();
    customer2.printName();

    customer.getCreditCard().pay(10);
    System.out.println(customer.getCreditCard().getDebt()); // Here the use of inherentance is being used

  }
}
