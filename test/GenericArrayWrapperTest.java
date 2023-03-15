import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GenericArrayWrapperTest {

    GenericArrayWrapper<String> arrTest = new GenericArrayWrapper<>(2);

    @BeforeEach
    public void beforeTest() {
        arrTest = new GenericArrayWrapper<>(2);
    }

    @Test
    public void addToArrayTest() {
        arrTest.addToArray("Anna");
        arrTest.addToArray("Berta");
        arrTest.addToArray("Carlo");

        String expectedFirstElement = "Anna";
        String expectedSecondElement = "Berta";

        String firstElement = arrTest.getElement(0);
        String secondElement = arrTest.getElement(1);

        assertEquals(expectedFirstElement, firstElement);
        assertEquals(expectedSecondElement, secondElement);
    }

    @Test
    public void getElementTest() {
        arrTest.addToArray("Julia");

        String expectedFirstElement = "Julia";

        String firstElement = arrTest.getElement(0);

        assertEquals(expectedFirstElement, firstElement);
    }

    @Test
    public void getArraySizeTest() {
        arrTest.addToArray("Anna");
        arrTest.addToArray("Berta");
        arrTest.addToArray("Carlo");

        Integer expectedArraySize = 4;   // initial size of arrTest is 2. As 3 Elements were added, the size doubled (2*2=4)

        Integer arraySize = arrTest.getArraySize();

        assertEquals(expectedArraySize, arraySize);
    }

    @Test
    public void getElementCountTest() {
        arrTest.addToArray("Anna");
        arrTest.addToArray("Berta");
        arrTest.addToArray("Carlo");

        Integer expectedElementCount = 3;

        Integer elementCount = arrTest.getElementCount();

        assertEquals(expectedElementCount, elementCount);
    }
}