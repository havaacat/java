import java.util.Date;

public class Junior {
	// 1.���е���
		// 2.�ṩ���еĲ���������Ĭ�ϵĹ��췽��
		// 3.����˽��
		// 4.����setter/getter��װ

		private int sid; // ѧ��
		private String sname; // ����
		private String gender; // �Ա�
		private Date birthday;
		private Address address;

		public Junior() {

		}

		public Junior(int sid, String sname, String gender, Date birthday,
				String address) {
			// super();
			this.sid = sid;
			this.sname = sname;
			this.gender = gender;
			this.birthday = birthday;
		}

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Date getBirthday() {
			return birthday;
		}

		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Students [sid=" + sid + ", sname=" + sname + ", gender="
					+ gender + ", birthday=" + birthday + ", address=" + address
					+ "]";
		}
}
