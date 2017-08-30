public class DemoSalesperson {

    public static void main (String[] args) {
        int i;
        Salesperson[] salespeople = new Salesperson[11];
        for (i = 1; i < salespeople.length; i++) {
            salespeople[i] = new Salesperson(9999, 0);
            System.out.println("Salesperson " + i + " has ID number: " + salespeople[i].getID() + " and has annual sales of $" + salespeople[i].getAnnualSales());
        }
    }
}
