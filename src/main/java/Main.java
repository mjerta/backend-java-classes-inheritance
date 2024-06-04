public class Main {

  public static void main(String[] args) {

    Customer customer = new Customer("Maarten", "Postma", new VisaCard(0));
    Customer customer2 = new Customer("Maarten2", "Postma", 1234567, new MasterCard(0));

    customer.printName();
    customer2.printName();

    customer.getCreditCard().pay(100); // with visa + discount
    customer2.getCreditCard().pay(100); // with mastercard
    System.out.println(customer.getCreditCard().getDebt()); // Here the use of inherentance is being used;
    System.out.println(customer2.getCreditCard().getDebt());

  }
}
