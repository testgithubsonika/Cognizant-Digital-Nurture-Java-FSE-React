package ex2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // Create Mock Object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub Method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject Mock into Service
        MyService service = new MyService(mockApi);

        // Call Method
        String result = service.fetchData();
         System.out.println("Result = " + result);
        // Verify Result
        assertEquals("Mock Data", result);

        // Verify Method Invocation
        verify(mockApi).getData();
    }
}