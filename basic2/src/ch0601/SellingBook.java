package ch0601;

public class SellingBook {
	String bookName;
	   int price;
	   int discount;
	   int quantity;
	   int sales;
	   String place;
	   String method;
	   public String getBookName() {
	      return bookName;
	   }
	   public void setBookName(String bookName) {
	      this.bookName = bookName;
	   }
	   public int getPrice() {
	      return price;
	   }
	   public void setPrice(int price) {
	      this.price = price;
	   }
	   public int getDiscount() {
	      return discount;
	   }
	   public void setDiscount(int discount) {
	      if(this.place == "서점")
	         discount += 10;
	      else if(this.place == "인터넷")
	         discount += 15;
	      if(this.method == "현금")
	         discount += 10;
	      else if(this.method == "카드")
	         discount += 5;
	      this.discount = discount;
	   }
	   public int getQuantity() {
	      return quantity;
	   }
	   public void setQuantity(int quantity) {
	      this.quantity = quantity;
	   }
	   public int getSales() {
	      return sales;
	   }
	   public void setSales() {
	      this.sales = this.price * (100- this.discount)/100;
	   }
	   public String getPlace() {
	      return place;
	   }
	   public void setPlace(String place) {
	      this.place = place;
	   }
	   public String getMethod() {
	      return method;
	   }
	   public void setMethod(String method) {
	      this.method = method;
	   }
	   public void printData() {
	      System.out.print(this.getBookName() + " \t");
	      System.out.print(this.getPrice() + "원 \t");
	      System.out.print(this.getDiscount() + "% \t");
	      System.out.print(this.getQuantity() + "권 \t");
	      System.out.print(this.getSales() + "원 \t");
	      System.out.print(this.getPlace() + " \t");
	      System.out.print(this.getMethod() + " \t");
	      System.out.println();
	   }
	}
