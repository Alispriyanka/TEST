package TEST;
import java.util.*;
class Employeelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Employee> list=new LinkedList<>();
Set<String> hh=new LinkedHashSet<>();
Map<String,Integer> kk=new HashMap<>();
list.add(new Employee(111,"Jiga Brein",32,"female","HR",2011,25000.0));
list.add(new Employee(122,"Paul Niksui",25,"male","Sales and marketing",2015,13500.0));
list.add(new Employee(133,"Martin",29,"male","Infrastructure",2012,18000.0));
list.add(new Employee(144,"Murali",28,"male","product development",2014,32500.0));
list.add(new Employee(155,"Nina Roy",27,"female","HR",2013,22700.0));
list.add(new Employee(166,"Alice",29,"female","Tester",2017,42300.0));
list.add(new Employee(177,"Priya",35,"female","Architecture",2010,95350.0));
list.add(new Employee(188,"Rajesh",28,"male","Senior Developer",2016,55000.0));
list.add(new Employee(199,"Habib",26,"male","Architecture",2018,48000.0));
list.add(new Employee(209,"Ram",34,"male","Manager",2015,80000.0));
for(Employee j:list) {
	
		hh.add(j.department);
	}
	
for(Employee i:list) {
	if(kk.containsKey(i.gender)) {
		kk.put(i.gender,kk.get(i.gender)+1);
	}
	else {
		kk.put(i.gender,1);
	}
}

System.out.println(kk);	
System.out.println(hh);
	}

}
