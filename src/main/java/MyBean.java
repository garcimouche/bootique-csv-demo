import java.math.BigDecimal;
import java.util.Date;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

import io.bootique.csv.CSVBean;

public class MyBean implements CSVBean{

    @CsvBindByPosition(position = 0)
    private String region;
    
    @CsvBindByPosition(position = 1)
    private String country;
    
    @CsvBindByPosition(position = 2)
    private String itemType;
    
    @CsvBindByPosition(position = 3)
    private String salesChannel;
    
    @CsvBindByPosition(position = 4)
    private String orderPriority;

    @CsvBindByPosition(position = 5)
    @CsvDate("MM/dd/yyyy")
    private Date orderDate;

    @CsvBindByPosition(position = 6)
    private Long orderId;

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
        return "\nMyBean [region=" + region + ", country=" + country + ", itemType=" + itemType + ", salesChannel=" + salesChannel
                + ", orderPriority=" + orderPriority + ", orderDate=" + orderDate + ", orderId=" + orderId + ", shipDate="
                + shipDate + ", unitsSold=" + unitsSold + ", unitPrice=" + unitPrice + ", unitCost=" + unitCost + ", totalRevenue="
                + totalRevenue + ", totalCost=" + totalCost + ", totalProfit=" + totalProfit + "]";
    }
    
    
    
}
