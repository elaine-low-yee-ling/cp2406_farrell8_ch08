public class DemoSalesperson2 {

    public static void main (String[] args) {
        int i;
        int startID = 111;
        int startSales = 25000;
        int salesIncrease = 5000;
        Salesperson[] salespeople = new Salesperson[11];
        for (i = 1; i < salespeople.length; i++) {
            salespeople[i] = new Salesperson(startID, startSales);
            System.out.println("Salesperson " + i + " has ID number: " + salespeople[i].getID() + " and has annual sales of $" + salespeople[i].getAnnualSales());
            startID++;
            startSales += salesIncrease;
        }
    }
}
