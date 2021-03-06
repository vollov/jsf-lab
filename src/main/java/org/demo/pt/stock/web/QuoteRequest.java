package org.demo.pt.stock.web;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "b1")
@RequestScoped
public class QuoteRequest {
    private String sym = "MSFT";
    private Date quoteDate = new Date();

    @ManagedProperty(value = "#{b2}")
    private StockService stkSrv; 

    public StockService getStkSrv() {
		return stkSrv;
	}

	public void setStkSrv(StockService stkSrv) {
		this.stkSrv = stkSrv;
	}

	public QuoteRequest() {
        System.out.println("Creating b1");
    }
    
    public String getSym() {
        System.out.println("getting sym");
        return sym;
    }

    public void setSym(String sym) {
        System.out.println("setting sym to: " + sym);
        this.sym = sym;
    }

    public Date getQuoteDate() {
        return quoteDate;
    }

    public void setQuoteDate(Date quoteDate) {
        this.quoteDate = quoteDate;
    }

    public int getStockValue() {
    	return Math.abs(sym.hashCode());
        //return stkSrv.getStockValue(this);
    }
}
