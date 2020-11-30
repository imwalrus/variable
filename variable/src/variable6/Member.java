package variable6;

public class Member {
	private int mNo;
	private String mPnum;
	private String mName;
	private String mClass;

	public Member() {

	}

	public Member(int mNo, String mPnum, String mName, String mClass) {
		super();
		this.mNo = mNo;
		this.mPnum = mPnum;
		this.mName = mName;
		this.mClass = mClass;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public String getmPnum() {
		return mPnum;
	}

	public void setmPnum(String mPnum) {
		this.mPnum = mPnum;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmClass() {
		return mClass;
	}

	public void setmClass(String mClass) {
		this.mClass = mClass;
	}

	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", mPnum=" + mPnum + ", mName=" + mName + ", mClass=" + mClass + "]";
	}
}
