package lberkholtz.advancedjava.assignmentfive.model;

import org.junit.Test;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for StockQuery Class
 */
public class StockQueryTest {

    @Test
    public void testBasicConstruction() throws Exception {
        String symbol = "APPL";
        StockQuery stockQuery = new StockQuery(symbol, "2010/10/10", "2011/11/11", "DAILY");
        assertEquals("Verify construction", symbol, stockQuery.getSymbol());

    }
}
