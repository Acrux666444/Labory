package src;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class TravelOfficeTest {
    Customer cs = new Customer("Ira");

    @Mock
    Map<String ,Trip> plans = new HashMap<>();
    Set<Customer> custSet = new HashSet<>();
    @InjectMocks
    TravelOffice to;


//    @BeforeClass
//    public void inicializate(){
//        to = new TravelOffice();
//    }

    @Test
    public void addCustomer() {
       //Customer cus=new Customer("Igor");
        int actual = custSet.size();
        custSet.add(cs);
        int expexted = custSet.size();
        assertEquals(expexted-1,actual);
    }

    @Test
    public void addTrip() {

        String name = "Kamodza";
        Date d = new Date(1222,11,11);
        Date e = new Date(1223,12,12);

        Trip tr = new Trip(d,e,"Kama",200.2);
        int  actual = plans.size();
        plans.put(name,tr);
        int expected = plans.size();
        assertEquals(expected-1,actual);

    }

    @Test
    public void removeTrip() {
        addTrip();
        String name = "Kamodza";
        int actual = plans.size();
        plans.remove(name);
        int expected = plans.size();
        assertEquals(expected,actual-1);

    }

    @Test
    public void findCustomerByName() {
       String name = "Igor";

        Customer cust = new Customer(name);
        //addCustomer();
        custSet.add(cust);
       // String x = cs.getName();
        boolean actual  = custSet.contains(cust);
        boolean expected = true;
        assertEquals(expected,actual);

    }

    @Test
    public void removeCustomer() {
        Customer cust = new Customer("Henia");
        custSet.add(cust);
        int actual = custSet.size();
        custSet.remove(cust);
        int expected = custSet.size();
        assertEquals(expected,actual-1);
    }

    @Test
    public void showCustomers() {

        fail();

    }
    @Test
    public void getCustomerCount() {

        fail();
    }
}