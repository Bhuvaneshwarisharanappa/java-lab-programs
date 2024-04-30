class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double calculatePayroll() {
        return salary;
    }
}

class PayrollSystem {
    public double calculatePayroll(Employee employee) {
        return employee.calculatePayroll();
    }
}
