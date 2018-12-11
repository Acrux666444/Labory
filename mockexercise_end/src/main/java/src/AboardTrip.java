package src;

public class AboardTrip extends Trip {
    private double insurance= 150;

    public AboardTrip(Date start, Date end, String destination,double price) {
        super(start, end, destination,price);
    }



    @Override
    public void setPrice(double price) {
        super.setPrice(price+insurance);
    }

    @Override
    public double getPrice() {
        System.out.println("In Child With price Insurance");
        return super.getPrice()+insurance;
    }
}
