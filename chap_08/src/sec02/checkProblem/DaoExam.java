package sec02.checkProblem;

public class DaoExam {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		System.out.println();
		dbWork(new MySqlDao());
	}

}

