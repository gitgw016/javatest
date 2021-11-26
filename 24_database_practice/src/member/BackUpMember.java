package member;

import java.util.Date;

public class BackUpMember extends Member{
	// 회원 탈퇴일 
	private Date deleteDate;
	
	

	public BackUpMember(int mNum, String mName, String mId, String mPw, long reg, Date deleteDate) {
		super(mNum, mName, mId, mPw, reg);
		this.deleteDate = deleteDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	@Override
	public String toString() {
		return super.toString() + " [deleteDate=" + deleteDate + "]";
	}
	
	
	
}
