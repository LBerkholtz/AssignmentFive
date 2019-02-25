package lberkholtz.advancedjava.assignmentfive.services;

import lberkholtz.advancedjava.assignmentfive.model.StockData;
import lberkholtz.advancedjava.assignmentfive.model.StockQuote;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the DatabaseStockService
 */
public class DatabaseStockServiceTest extends StockData {

    @Test
    public void testGetQuote() throws Exception {
        DatabaseStockService databaseStockService = new DatabaseStockService();
        String symbol = "APPL";
        StockQuote stockQuote = databaseStockService.getQuote(symbol);
        assertNotNull("Verify we can get a stock quote from the db", stockQuote);
        assertEquals("Make sure the symbols match", symbol, stockQuote.getSymbol());
    }

    @Test
    public void testGetQuoteList() throws Exception {
        DatabaseStockService databaseStockService = new DatabaseStockService();
        List<StockQuote> stockQuotes = null;
        String symbol = "GOOG";
        String dteFrom = "2015/01/01";
        String dteUntil = "2015/05/01";
        Calendar from = Calendar.getInstance();
        Calendar until = Calendar.getInstance();
        from.setTime(simpleDateFormat.parse(dteFrom));
        until.setTime(simpleDateFormat.parse(dteUntil));
        StockService.Interval interval = StockService.Interval.MONTHLY;
        stockQuotes  = databaseStockService.getQuote(symbol, from, until, StockService.Interval.MONTHLY);
        assertEquals("verify number of quotes",2, stockQuotes.size());
    }
}
