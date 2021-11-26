package octlast;

public class Member {
	
	private String id;
	private String password;
	private String name;
	
	public Member() {}
	
	public Member(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
		
		
	}

	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member n = (Member)obj;
			if(n.getId().equals(this.id) && n.getPassword().equals(this.password)) {
				return true;	
			}
		}
		return false;
	}
	
	
	
}
