package generic06_generic_extends;

public class Child<T,M,C> extends Parent<T,M> {
	
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return super.toString()+"Child [company=" + company + "]";
	}
	
	
	
}
