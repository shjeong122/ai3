package ch06;

public class SellingProductsEx {

	public static void main(String[] args) {
		// 제품판매관리
		SellingProducts sp = new SellingProducts();
		sp.setProducts("화장품");
		sp.setName("립스틱");
		sp.setCost(20000);
		sp.setPrice(30000);
		sp.setRate(50);
		sp.setSales(1500000);
		
		System.out.println(sp.getProducts());
		System.out.println(sp.getCost());
		System.out.println(sp.getSales());
		System.out.println(sp.getPrice());
		System.out.println(sp.getRate());

		SellingProducts sp2 = new SellingProducts("사무용품");
		SellingProducts sp3 = new SellingProducts(2000, 10);
		SellingProducts sp4 = new SellingProducts(3000, "화장품");
		SellingProducts sp5 = new SellingProducts("가전제품", 2500);
		
	}

	
}
