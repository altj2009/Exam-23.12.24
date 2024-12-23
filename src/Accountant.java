import java.util.Scanner;

public class Accountant {
    public Employee[] employees;
    private int counter;

    public Accountant() {
        this.employees = new Employee[0]; 
        this.counter = 0;
    }

    Scanner scan = new Scanner(System.in);

    public void addEmployee(Employee employee) {
        Employee[] newEmployees = new Employee[counter + 1];
        for (int i = 0; i < counter; i++) {
            newEmployees[i] = employees[i];
        }
        newEmployees[counter] = employee;
        employees = newEmployees;
        counter++;
    }

    public void performAction(){
        Accountant buhgalter = new Accountant();
        while (true){
            buhgalter.getMenu();
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the name of the employee: ");
                    String name = scan.next();
                    System.out.println("Enter the base salary: ");
                    int baseSalary = scan.nextInt();
                    System.out.println("Enter the hourly rate: ");
                    int hourlyRate = scan.nextInt();
                    if(hourlyRate<0){
                        System.out.println("Error! hourly rate can't be minus!");
                    }
                    System.out.println("Enter the worked hours: ");
                    int workedHours = scan.nextInt();
                    if(workedHours<0){
                        System.out.println("Error! hours can't be minus!");
                    }
                    scan.nextLine();

                    Employee employee1 = new Employee(baseSalary, hourlyRate, name, workedHours);
                    buhgalter.addEmployee(employee1);
                    break;
                case 2:
                    buhgalter.calculatePayroll();
                    break;
                case 3:
                    for(int i = 0; i < buhgalter.employees.length ; i++){
                        System.out.println(buhgalter.employees[i].toString());
                    }
                    break;
                case 4:
                    System.out.println("choose the operation: 1(+) | 2(-) | 3(*) | 4(/) ");
                    int choose = scan.nextInt();
                    if(choose<0 || choose>4){
                        System.out.println("ur choice of operation is uncorrect!");
                        break;
                    }
                    System.out.println("enter the first number: ");
                    int number1 = scan.nextInt();
                    System.out.println("enter the second number: ");
                    int number2 = scan.nextInt();
                    switch (choose){
                        case 1:
                            System.out.println("result : "+ (number1+number2));
                            break;
                        case 2:
                            System.out.println("result : " + (number1-number2));
                            break;
                        case 3:
                            System.out.println("result : "+ number1*number2);
                            break;
                        case 4:
                            System.out.println("result : "+ number1/number2);
                            break;
                    }
                    break;
                case 0:
                    System.out.println("u succesly exit the sistem!");
                    return;
            }

        }

    }

    public void calculatePayroll(){
        for(int i = 0; i < employees.length ; i++) {
            System.out.println((employees[i].getHourlyRate() + " * " + employees[i].getWorkedHours()) + " + " + employees[i].getBaseSalary());
            System.out.println("Total salary of  ~"+ employees[i].getName() + "~  equals : " + employees[i].calculateSalary());
        }
    }

    public Employee[] getEmployes() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void getMenu(){
        System.out.println("""
                Выберите действие:
                1. Добавить нового сотрудника
                2. Рассчитать зарплату для всех сотрудников
                3. Показать информацию о сотрудниках
                4. Калькулятор (для дополнительных расчетов)
                0. Выход
                """);
    }
}
