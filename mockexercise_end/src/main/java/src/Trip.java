package src;

public class Trip {

    private Date start;
    private Date end;
    private String destination;
    private double price;

    public Trip(Date start, Date end, String destination,double price) {
        this.start = start;
        this.end = end;
        this.destination = destination;
        this.price = price;
    }

//    public String getInfo() {
//        String info = "Start trip" + start.getInfo() + "\n" + " End Date " + end.getInfo() + "Dest " + destination;
//        //System.out.println(start.getInfo()+end.getInfo() +"Dest "+destination);
//        return info;
//    }


    @Override
    public String toString() {
        return "Trip{" +
                "start=" + start +
                ", end=" + end +
                ", destination='" + destination + '\'' +
                ", price=" + getPrice() +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
