public class Main {
    public static void main(String[] args) {
        Employer employer = new Employer("Ivan", "Director", 60000);
        System.out.println(employer.name + ", " + employer.dolzhnost + ", Salary: " + employer.salary + ".");
        String info = employer.info(3);
        System.out.println(info);
    }
}
