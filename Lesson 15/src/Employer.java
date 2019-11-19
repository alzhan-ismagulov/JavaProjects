public class Employer {
    String name;
    String dolzhnost;
    int salary;

    public Employer(String name, String dolzhnost, int salary) {
        this.name = name;
        this.dolzhnost = dolzhnost;
        this.salary = salary;
    }
    String info(int i){
        return "Name: " + name + ", Salary: " + salary * i;
    }
}
