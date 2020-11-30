package variable5;

public class Member {
	private int mNo;
	private String mPnum;
	private String mName;
	private String mClass;

	public Member() { // 기본 생성자 : 매게변수X

	}

	public Member(int mNo, String mPnum, String mName, String mClass) {
		this.mNo = mNo;
		this.mPnum = mPnum;
		this.mName = mName;
		this.mClass = mClass;
	}

	public Member(int mNo, String mName) {
		super();
		this.mNo = mNo;
		this.mName = mName;
	}

	public int getMNo() {
		return mNo;
	}

	public String getMPnum() {
		return mPnum;
	}

	public String getMName() {
		return mName;
	}

	public String getMClass() {
		return mClass;
	}

}
