package accessors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccessorTest {
    @Test
    void gettingDemoPresentation_expectNoException(){
        assertDoesNotThrow(()->{
            Accessor.getDemoAccessor();
        });
    }
}