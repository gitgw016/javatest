package generic02_multi;
// 필드에서 두개를 쓰겠다라고 명시적으로 알림
public class Twin<T,M> {
	
	private T type;
	private M model;
	
	public T getType() {
		return type;
	}
	public void setType(T type) {
		this.type = type;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
