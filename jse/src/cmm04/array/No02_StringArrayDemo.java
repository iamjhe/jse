package cmm04.array;

public class No02_StringArrayDemo {
	public static void main(String[] args) {
		String[] juso1 = {"서울","종로","광화문"};
		/* 
		String[] juso = new String[3]; 
		juso[0] = "서울"; 
		juso[1] = "종로"; 
		juso[2] = "광화문"; 
		 */ 
		for( int i = 0; i < juso1.length; i ++ ){ 
			System.out.println(" 주소 : " + juso1[i]); 

		}
	}
}
