package src;

import java.util.*;

public class TravelOffice {

 public static Map<String ,Trip> plan = new HashMap<>();
 public static Set<Customer> CustSet = new HashSet<>();

    public static void addCustomer (Customer cust) {
        CustSet.add(cust);
    }
    public void addTrip(String name,Trip trip){
         System.out.println(name+" dodano do tripa");
        plan.put(name,trip);
     }
    public static void showTable() {
        for (Customer cs : CustSet) {
            System.out.println(cs.toString());
        }
    }
    public void removeTrip(String name){

       if(plan.containsKey(name)){
         System.out.println(name+" usunieto z tripa");
        plan.remove(name);}
       else{
           System.out.println("notihng found");
       }
     }
     public Customer findCustomerByName(String name){
        for(Customer cs : CustSet){
            if(cs.getName().equals(name)) {
                System.out.println("Found");
                return cs;
            }
            else{
               // System.out.println("nothing found");
            }
        }
        return null;
     }
     public boolean removeCustomer(Customer cust){
        if(findCustomerByName(cust.getName())!=null){
            CustSet.remove(findCustomerByName(cust.getName()));
            System.out.println("usunieto");
            return true;}
        else{
            System.out.println("Nie udało sie usunac customera");
            return false;
        }
     }
     public void showTrips(){
         Iterator<Map.Entry<String,Trip>> it = plan.entrySet().iterator();
         while (it.hasNext()){
             System.out.println(it.next().getKey());
         }
     }
     public  Set<Customer> showCustomers(){
        return CustSet;
//        for(Customer cs : CustSet){
//            System.out.println(cs.toString());
//        }
     }
     public int getCustomerCount(){
        return CustSet.size();
     }

}
