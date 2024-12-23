public class Employee {
    private String name;
    private int baseSalary;
    private int workedHours;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate, String name, int workedHours) {
        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;
        this.name = name;
        this.workedHours = workedHours;
    }

    public int calculateSalary(){
        int total = (workedHours*hourlyRate)+baseSalary;
        return total;
    }

    @Override
    public String toString() {
        return "Employee |" +
                "baseSalary:" + baseSalary +
                ", name:'" + name + '\'' +
                ", workedHours:" + workedHours +
                ", hourlyRate:" + hourlyRate +
                '|';
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public  void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
}
