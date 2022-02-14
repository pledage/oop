package api;

public class StringBufferExam {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer().append("\n select ")
				.append("\n * ")
				.append("\n from member ");//이런식으로 쿼리를 만들어준다.
//		StringBuffer sql = new StringBuffer();
//		sql.append(" select ");
//		sql.append(" * ");
//		sql.append(" from member ");
		//StringBuffer -> String 클래스 만들기
		String sqlStr = sql.toString();
		System.out.println(sqlStr);

	}

}
