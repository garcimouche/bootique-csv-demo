import java.math.BigDecimal;
import java.util.Date;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

import io.bootique.csv.CSVBean;

public class MyBean2 implements CSVBean{

    @CsvBindByPosition(position = 7)
    @CsvDate("MM/dd/yyyy")
    private Date shipDate;
    
    @CsvBindByPosition(position = 8)
    private int unitsSold;

    @CsvBindByPosition(position = 9)
    private BigDecimal unitPrice;

    @CsvBindByPosition(position = 10)
    private BigDecimal unitCost;

    @CsvBindByPosition(position = 11)
    private BigDecimal totalRevenue;
    
    @CsvBindByPosition(position = 12)
    private BigDecimal totalCost;

    @CsvBindByPosition(position = 13)
    private BigDecimal totalProfit;

    @Override
    public String toString() {
        return "\nMyBean2 [shipDate=" + shipDate + ", unitsSold=" + unitsSold + ", unitPrice=" + unitPrice + ", unitCost=" + unitCost
                + ", totalRevenue=" + totalRevenue + ", totalCost=" + totalCost + ", totalProfit=" + totalProfit + "]";
    }
}
