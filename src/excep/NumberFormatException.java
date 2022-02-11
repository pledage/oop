package excep;

/**
 * try{예외발생 코드} catch(Exception){예외처리 코드} finally{예외발생하더라도 무조건 수행}
 * 
 * @author smart12
 *
 */
public class NumberFormatException {

	public static void main(String[] args) {
		try {
		String data1 = "100";
		String data2 = "a100";
		int value1 = Integer.parseInt(data1);
		System.out.println(value1);
		
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			System.out.println("무조건 실행됩니다.");
		}
		

	}

}
