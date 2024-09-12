package test02;

import java.util.Arrays;
import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
		List<Employees> employees = Arrays.asList(
	            new Employees("짱구", 40, "영업부", 4000),
	            new Employees("철수", 33, "영업부", 3400),
	            new Employees("훈이", 25, "개발부", 5000),
	            new Employees("맹구", 45, "개발부", 7000),
	            new Employees("유리", 22, "운영부", 3000),
	            new Employees("짱아", 27, "운영부", 4000)
	        );

	        EmployeeManager manager = new EmployeeManager(employees);

	        manager.showAvgDepart();

	        manager.showAgeSalary();

	        manager.showDept();
	}
}
