
public class EmpMaxSal {
	Integer emp_id;
	String name;
	Integer sal;
	EmpMaxSal(Integer emp_id,String name,Integer sal){
		this.emp_id=emp_id;
		this.name=name;
		this.sal=sal;
	}
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	@Override
	public boolean equals(Object c) {
		//System.out.println(((EmpMaxSal)c).emp_id);
		/*
		 * return this.emp_id==((EmpMaxSal)c).emp_id //&&
		 * this.name.equals(((EmpMaxSal)c))).name; && this.sal==((EmpMaxSal)c).sal;
		 */
		return true;
	}
	
	 @Override
	    public int hashCode()
	    {
	          
	        // We are returning the Geek_id 
	        // as a hashcode value.
	        // we can also return some 
	        // other calculated value or may
	        // be memory address of the 
	        // Object on which it is invoked. 
	        // it depends on how you implement 
	        // hashCode() method.
	        return this.emp_id;
	    }

}
