public class Employee{
    private int EmployeeId;
    private String EmployeeName;
    private String Department;
    private String Role;
    private String DateOfJoining;
    private Double Salary;
    private String EmployeeStatus;

    Employee(int EmployeeId,String EmployeeName,String Department,double Salary){
        this.EmployeeId=EmployeeId;
        this.EmployeeName=EmployeeName;
        this.Department=Department;
        this.Salary=Salary;
    }
    public int getEmployeeId() {
        return EmployeeId;
    }
    public String getEmployeeName() {
        return EmployeeName;
    }
    public String getDepartment() {
        return Department;
    }
    public double getSalary() {
        return Salary;
    }
    public void setDepartment( String Department) {
        this.Department = Department;
    }
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    public void setRole( String Role) {
        this.Role = Role;
    }
    public void setEmployeeStatus( String EmployeeStatus) {
        this.EmployeeStatus = EmployeeStatus;
    }
    @Override
    public String toString(){
        return "Employee ID "+EmployeeId+
                ",Employee Name "+EmployeeName+
                ",Department "+Department+
                ",Role "+Role+
                ",Date of Joining "+DateOfJoining+
                ",Salary "+Salary+
                ",Employee Status "+EmployeeStatus;
    }
}