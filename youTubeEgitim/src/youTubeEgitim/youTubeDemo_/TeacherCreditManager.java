package youTubeEgitim.youTubeDemo_;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("öðretmen kredisi hesaplandý");

	}

	@Override
	public void save() {
		System.out.println("öðretmen kredisi verildi");

	}

}
