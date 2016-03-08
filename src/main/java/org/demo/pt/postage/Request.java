package org.demo.pt.postage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "r")
@RequestScoped
public class Request {
    private int weight;
    private String patronCode;
    
    @ManagedProperty(value = "#{ps}")
    private PostageService postageService;

    public PostageService getPostageService() {
		return postageService;
	}

	public void setPostageService(PostageService postageService) {
		this.postageService = postageService;
	}

	public Request() {
    }

    public Request(int weight, String patronCode) {
        this.weight = weight;
        this.patronCode = patronCode;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPatronCode() {
        return patronCode;
    }

    public void setPatronCode(String patronCode) {
        this.patronCode = patronCode;
    }

    public int getPostage() {
        return postageService.getPostage(this);
    }

    public boolean isValid() {
        if (patronCode.equals("p1") && weight > 50) {
            return false;
        }
        return true;
    }

}
