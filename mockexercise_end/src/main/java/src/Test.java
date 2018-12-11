package src;

public class Test {

    //public static int countCustomer=0;
    // public static Customer [] tablica = new Customer [2];

    public static void main(String[] args) {

        Date start = new Date(2022, 12, 25);
        Date end = new Date(2025, 12, 25);
        TravelOffice kama = new TravelOffice();


        Address ad = new Address("lodz ", "9885", "Warszawska");
        Trip tr = new Trip(start, end, "London", 2000.2);
        Customer cs = new Customer("Dave");
        Customer qw = new Customer("Harold");
        Customer qq = new Customer("Matthew");
        Customer ww = new Customer("Mariano");

        Trip brasil = new DomesticTrip(start, end, "Brasil", 562.22);
        Trip inCountry = new AboardTrip(start, end, "Wroclaw", 999.2);

        ww.setAddres(ad);
        ww.assignTrip(brasil);

        qw.assignTrip(inCountry);
        qw.setAddres(ad);

        cs.assignTrip(tr);
        cs.setAddres(ad);
        qq.assignTrip(tr);
        qq.setAddres(ad);

        kama.addCustomer(cs);
        kama.addCustomer(qw);
        kama.addCustomer(qq);
        kama.addCustomer(ww);

        kama.addTrip("Porottico",inCountry);

//        Date da = Date.getDAte();
//        System.out.println(da.toString());
//        kama.showTable();

        kama.addTrip("Bahamy",brasil);
        //kama.removeTrip("Bahamy");
        System.out.println(kama.findCustomerByName("Dave").toString());
        kama.removeCustomer(kama.findCustomerByName("Dave"));

        kama.showTrips();
        kama.showCustomers();



    }

}