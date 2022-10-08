package interfaces;

public class MySqlCustomerDao implements CustomerDao, Repository{

	@Override
	public void add() {
		System.out.println("my sql eklendi");
		
	}

}
