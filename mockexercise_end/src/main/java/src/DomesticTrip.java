package src;

public class DomesticTrip extends Trip {
    private static double ownArrivalDiscount=50;

    public DomesticTrip(Date start, Date end, String destination,double price) {
        super(start, end, destination,price);
    }

    public void setOwnArrivalDiscount(double ownArrivalDiscount) {
        this.ownArrivalDiscount = 50;
    }


    @Override
    public double getPrice() {
        System.out.println("In Child With price Rabat");
        return (super.getPrice()-ownArrivalDiscount);
    }


}
