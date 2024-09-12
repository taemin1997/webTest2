package test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Student {
	
	private HashMap<String, Integer> studentMap;
	
	public Student() {
		studentMap = new HashMap<String, Integer>();
	}

	public HashMap<String, Integer> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(HashMap<String, Integer> studentMap) {
		this.studentMap = studentMap;
	}
	
	@Override
	public String toString() {
		return "Student [studentMap=" + studentMap + "]";
	}

	public void addStudent(String name, int score) {
		
		
		
		if(score < 0) {
			throw new IllegalArgumentException("음수 안돼요");
		}
		if(name.length() < 1) {
			throw new IllegalArgumentException("이름 이상해");
		}
		studentMap.put(name, score);
	}
	
	public int getScore(String name) {
		if(!studentMap.containsKey(name)) {
			System.out.println("학생 없음");
		}
		int score = studentMap.get(name);
		
		return score;
	}
	
	public void showStudents(){
		for(Map.Entry<String, Integer> entry : studentMap.entrySet()) {
			System.out.println("name : " + entry.getKey() + "score : " + entry.getValue());
		}
	}
	
	public void showAvgStu() {
		int total = 0;
		for(int score : studentMap.values()) {
			total += score;
		}
		
		double avg = (double)total / studentMap.size();
		
		for(Map.Entry<String, Integer> entry : studentMap.entrySet()) {
			if(entry.getValue() >= avg) {
				System.out.println("name : " + entry.getKey() + " score : " + entry.getValue());
			}
		}
	}
	
	public void showSorted() {
        List<String> nameList = new ArrayList<String>(studentMap.keySet());
        
        Collections.sort(nameList);
        
        for(String name : nameList) {
        	System.out.println("student : " + name + " score : " + studentMap.get(name));
        }
    }

    public void showTop() {
        List<Map.Entry<String, Integer>> entry = new ArrayList<>(studentMap.entrySet());
        
        Collections.sort(entry, new Comparator<Map.Entry<String, Integer>>() {
        	@Override
        	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
        		return o2.getValue().compareTo(o1.getValue());
        	}
		});
        
        int top3 = Math.min(3, entry.size());
        for(int i = 0; i < top3; i++) {
        	Map.Entry<String, Integer> entries = entry.get(i);
        	System.out.println("student : " + entries.getKey() + " score : " + entries.getValue());
        }
    }
}














