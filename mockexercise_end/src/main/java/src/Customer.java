package src;

public class Customer {
    private String name;
    private Address addres;
    private Trip trip;

    public Customer(String name) {
        this.name = name;
    }

    public void setAddres(Address addres) {
        this.addres = addres;
    }


    public void assignTrip(Trip trip) {
        this.trip = trip;
    }
//    public String getInfo(){
//        String info = "name "+name+"\n"+"Addres info :"+addres.getInfo()+"\n"+" Trip info:"+"\n"+trip.getInfo();
//        return info;
//
//    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", addres=" + addres.toString() +
                ", trip=" + trip.toString() +
                '}';
    }

    public String getName() {
        return name;
    }
}
