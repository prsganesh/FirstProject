import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpMain {
	public static void main(String args[]) {
		EmpMaxSal emp1=new EmpMaxSal(1,"TEST",3000);
		EmpMaxSal emp2=new EmpMaxSal(2,"high",5000);
		EmpMaxSal emp3=new EmpMaxSal(2,"med",4000);
		//System.out.println(emp2.name);
		Map<EmpMaxSal,Integer> hashmap=new HashMap<EmpMaxSal,Integer>();
		hashmap.put(emp2, 1);
		hashmap.put(emp1, 1);
		System.out.println(hashmap);
		List<EmpMaxSal > list= new ArrayList<EmpMaxSal>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		List<String> empIdList=list.stream().map(p->p.name).
				collect(Collectors.toList());
		Optional<EmpMaxSal> empsal=list.stream()
				.max(Comparator.comparing((p1,p2)->p1.sal-p2.sal))
				;
		
		Optional<EmpMaxSal> empsal1=list.stream()
				.min((p1,p2)->p1.sal-p2.sal)
				;
		
		EmpMaxSal maxsalEmp=empsal.get();
		System.out.println("MAx Name Emp:"+maxsalEmp.sal);
		
		
		for (String i : empIdList) {
			System.out.println("From Collector:"+i);
		}
		
		
	}

}
