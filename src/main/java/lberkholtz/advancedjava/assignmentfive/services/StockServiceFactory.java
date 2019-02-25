package lberkholtz.advancedjava.assignmentfive.services;

import jdk.nashorn.internal.ir.annotations.Immutable;
import lberkholtz.advancedjava.assignmentfive.model.StockQuote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * A factory that returns a <CODE>StockService</CODE> instance.
 */
@Immutable
public class StockServiceFactory {

    /**
     * Prevent instantiations
     */
    private StockServiceFactory() {}

    /**
     * returns a DatabaseStockService instance
     * @return get a <CODE>StockService</CODE> instance
     */
    public static StockService getInstance() {
        return new DatabaseStockService();
    }

}
