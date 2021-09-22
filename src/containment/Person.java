package containment;

public class Person {
private int perId;
private String perName;
Address objAdd;
	
	public Person(int perId, String perName) {
	this.perId = perId;
	this.perName = perName;
}
    public int getPerId() {
		return perId;
	}


	public void setPerId(int perId) {
		this.perId = perId;
	}


	public String getPerName() {
		return perName;
	}


	public void setPerName(String perName) {
		this.perName = perName;
	}


	public Address getObjAdd() {
		return objAdd;
	}


	public void setObjAdd(Address objAdd) {
		this.objAdd = objAdd;
	}


	public static void main(String[] args) {
		

	}

}
