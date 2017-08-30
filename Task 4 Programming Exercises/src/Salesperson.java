public class Salesperson {
    private int ID;
    private double annualSales;

    Salesperson(int idNum, double amt) {
        ID = idNum;
        annualSales = amt;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(double annualSales) {
        this.annualSales = annualSales;
    }


}
