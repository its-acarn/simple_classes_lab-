import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 10);
    }

    @Test
    public void hasSheets() {
        assertEquals(100, printer.getSheets());
    }
    @Test
    public void hasToner() {
        assertEquals(10, printer.getToner());
    }

    @Test
    public void canPrint() {
        printer.print(3,3 );
        assertEquals(91, printer.getSheets());
    }

    @Test
    public  void cannotPrint() {
        printer.print(100,3 );
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void enoughToner() {
        printer.print(3, 3);
        assertEquals(1, printer.getToner());
    }

    @Test
    public void cannotPrintNotEnoughToner() {
        printer.print(5, 3);
        assertEquals(10, printer.getToner());
    }
}
