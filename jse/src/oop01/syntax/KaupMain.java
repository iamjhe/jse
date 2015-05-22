package oop01.syntax;

public class KaupMain {
	public static void main(String[] args) {
		
		double height=0;
		double weight=0;
		KaupVO vo = new KaupVO(height, weight);
		
		
		System.out.println(vo.toString());
		System.out.println("완료");
	}
	
}
