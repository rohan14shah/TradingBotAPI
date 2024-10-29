import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import java.io.IOException;
import java.math.BigDecimal;

public class TradingBotAPI {

    public static void main(String[] args) {
        TradingBotAPI tradingBotAPI = new TradingBotAPI();
    }

    public TradingBotAPI() {
        try {
            Stock stock = YahooFinance.get("AAPL");
            BigDecimal price = stock.getQuote().getPrice();
            System.out.println("AAPL Price: " + price);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}