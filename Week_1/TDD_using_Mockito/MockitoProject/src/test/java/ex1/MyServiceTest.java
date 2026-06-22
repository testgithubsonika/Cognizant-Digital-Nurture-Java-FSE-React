package ex1;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

// import ex1.ExternalApi;
// import ex1.MyService;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Create Mock Object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Inject Mock into Service
        MyService service = new MyService(mockApi);

        // Call Method
       String result = service.fetchData();

        // Debug print
        System.out.println("Result = " + result);
        // Verify Interaction
        verify(mockApi).getData();
    }
}