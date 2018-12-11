package workshop.mock.testexercise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.FieldSetter;
import org.mockito.runners.MockitoJUnitRunner;
import workshop.mock.testexercise.service.GreetService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AppTest {

    @Mock
    private GreetService greetService;


    @InjectMocks
    private App app;


    @Test
    public void shouldReturnGreetingInLowerCase() {
        when(greetService.hello(null)).thenReturn("HellO wOrlD");
        assertEquals("hello world", app.greetLowerCase(null));

    }

    @Test
    public void shouldReturnDefaultGreetingInLowerCase() throws NoSuchFieldException {

        new FieldSetter(app, App.class.getDeclaredField("greetService")).set(new GreetService());
        assertEquals("hello mock!", app.greetLowerCase(null));
    }




}