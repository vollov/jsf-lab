package org.demo.pt.stock.web;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

@ManagedBean(name = "b2", eager = true)
@ApplicationScoped
public class StockService {
    private List<SelectItem> symbols;

    public StockService() {
        symbols = new ArrayList<SelectItem>();
        symbols.add(new SelectItem("MSFT", "Microsoft"));
        symbols.add(new SelectItem("IBM", "IBM"));
        symbols.add(new SelectItem("RHAT", "Red Hat"));
    }

    public List<SelectItem> getSymbols() {
        return symbols;
    }

    public int getStockValue(QuoteRequest r) {
    	//return 1;
        return Math.abs((r.getSym() + r.getQuoteDate().toString()).hashCode());
    }
}
