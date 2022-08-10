package delegationProblem;

public class Manager extends EmployeeType{

	@Override
	public void increaseSalary(double rate) {
		m_dSalary = (m_dSalary + 10) * (1 + rate);		
	}

}
