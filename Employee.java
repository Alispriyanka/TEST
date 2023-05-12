package TEST;

public class Employee {

	
		// TODO Auto-generated method stub
int id;
String name;
int age;
String gender;
String department;
int year;
double salary;
public Employee(int id, String name, int age, String gender, String department, int year, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.department = department;
	this.year = year;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
			+ department + ", year=" + year + ", salary=" + salary + "]";
}



}
