package delegationProblem;

public class Regular extends EmployeeType{

	@Override
	public void increaseSalary(double rate) {
		m_dSalary = (m_dSalary) * (1 + rate);		
	}

}