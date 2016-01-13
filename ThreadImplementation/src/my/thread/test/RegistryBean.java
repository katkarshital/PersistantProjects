package my.thread.test;

public class RegistryBean {
	private int RegNo;
	private boolean Status;
	public int getRegNo() {
		return RegNo;
	}
	public void setRegNo(int regNo) {
		RegNo = regNo;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	public boolean isStatus() {
		
		return Status;
	}
	public RegistryBean(int RegNo,boolean Status){
		this.RegNo = RegNo;
		this.Status = Status;
	}
}
