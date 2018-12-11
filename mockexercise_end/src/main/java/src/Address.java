package src;

public class Address {
    private String city;
    private String zip;
    private String street;

    public Address(String city, String zip, String street) {
        this.city = city;
        this.zip = zip;
        this.street = street;
    }
//    public String getInfo(){
//        String value = city+":"+zip+":"+street;
//        //System.out.println(city+":"+zip+":"+street);
//        return value;
//
//    }


    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
