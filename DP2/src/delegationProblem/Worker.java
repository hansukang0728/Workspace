package delegationProblem;

public abstract class Worker {
	
	EmployeeType eType;
	
	public abstract void doWork();

	public void seteType(EmployeeType eType) {
		this.eType = eType;
	}
	
	public void increaseSalary(double rate)
	{
		this.eType.increaseSalary(rate);		
	}
	
	public double getSalary()
	{
		return this.eType.getSalary();
	}
	
	public void setSalary(double Salary)
	{
		this.eType.setSalary(Salary);
	}
}
