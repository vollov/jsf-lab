package org.demo.pt.postage;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ApplicationScoped
@ManagedBean(name = "ps", eager = true)
public class PostageService {
    private Map<String, Integer> patronCodeToDiscount;

    public PostageService() {
        patronCodeToDiscount = new HashMap<String, Integer>();
        patronCodeToDiscount.put("p1", 90);
        patronCodeToDiscount.put("p2", 95);
    }

    public int getPostage(Request r) {
        Integer discount = (Integer) patronCodeToDiscount
                .get(r.getPatronCode());
        int postagePerKg = 10;
        int postage = r.getWeight() * postagePerKg;
        if (discount != null) {
            postage = postage * discount.intValue() / 100;
        }
        return postage;
    }

    public boolean patronExists(String patronCode) {
        return patronCodeToDiscount.containsKey(patronCode);
    }

}