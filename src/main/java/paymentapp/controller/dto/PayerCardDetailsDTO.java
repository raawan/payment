package paymentapp.controller.dto;

public class PayerCardDetailsDTO {
	
	private String nameoncard;
	private Integer cardnumber;
	private String expirydate;
	private String cvv;
	private String emailaddress;
	private Integer totalcost;
	
	public String getNameoncard() {
		return nameoncard;
	}
	public void setNameoncard(String nameoncard) {
		this.nameoncard = nameoncard;
	}
	public Integer getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(Integer cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public Integer getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(Integer totalcost) {
		this.totalcost = totalcost;
	}
	
}