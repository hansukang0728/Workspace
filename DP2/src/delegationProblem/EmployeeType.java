package delegationProblem;

abstract public class EmployeeType {
	public double m_dSalary;

	public double getSalary() {
		return m_dSalary;
	}

	public void setSalary(double salary) {
		this.m_dSalary = salary;
	}
	
	public abstract void increaseSalary(double rate);
}
