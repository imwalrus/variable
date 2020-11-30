package variable4;

public class Member {
	private int mNo;
	private String mPnum;
	private String mName;
	private String mClass;

	public int getmNo() {
		return this.mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public String getmPnum() {
		return this.mPnum;
	}

	public void setmPnum(String mPnum) {
		this.mPnum = mPnum;
	}

	public String getmName() {
		return this.mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmClass() {
		return this.mClass;
	}

	public void setmClass(String mClass) {
		this.mClass = mClass;
	}

	@Override
	public String toString() {
		return "Member [회원번호: " + mNo + ", 연락처: " + mPnum + ", 회원이름: " + mName + ", 강좌명: " + mClass + "]";
	}
	
	
}