package test02;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManager {
	private List<Employees> employees;

    public EmployeeManager(List<Employees> employees) {
        this.employees = employees;
    }

    public void showAvgDepart() {
        Map<String, Integer> totalSalaries = new HashMap<>();
        Map<String, Integer> employeeCounts = new HashMap<>();

        for (Employees e : employees) {
            String dept = e.getDept();
            totalSalaries.put(dept, totalSalaries.getOrDefault(dept, 0) + e.getSalry());
            employeeCounts.put(dept, employeeCounts.getOrDefault(dept, 0) + 1);
        }

        List<Map.Entry<String, Double>> avgSalaries = new ArrayList<>();
        for (String dept : totalSalaries.keySet()) {
            double avgSalary = (double) totalSalaries.get(dept) / employeeCounts.get(dept);
            avgSalaries.add(new AbstractMap.SimpleEntry<>(dept, avgSalary));
        }

        avgSalaries.sort((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()));

        for (Map.Entry<String, Double> entry : avgSalaries) {
            System.out.println(entry.getKey() + " dept avg : " + entry.getValue());
        }
    }

    public void showAgeSalary() {
        List<Employees> sortedEmployees = new ArrayList<>(employees);

        sortedEmployees.sort(new Comparator<Employees>() {
            @Override
            public int compare(Employees e1, Employees e2) {
                if (e1.getAge() != e2.getAge()) {
                    return Integer.compare(e1.getAge(), e2.getAge());
                } else {
                    return Integer.compare(e1.getSalry(), e2.getSalry());
                }
            }
        });

        for (Employees e : sortedEmployees) {
            System.out.println(e);
        }
    }

    public void showDept() {
        Map<String, Integer> totalSalaries = new HashMap<>();
        Map<String, Integer> employeeCounts = new HashMap<>();

        for (Employees e : employees) {
            String dept = e.getDept();
            totalSalaries.put(dept, totalSalaries.getOrDefault(dept, 0) + e.getSalry());
            employeeCounts.put(dept, employeeCounts.getOrDefault(dept, 0) + 1);
        }

        for (String dept : totalSalaries.keySet()) {
            System.out.println(dept + " count : " + employeeCounts.get(dept) + " total salary: " + totalSalaries.get(dept));
        }
    }
}
