


public class Address {

	private String postcode; // �ʱ�
	private String phone; // �绰
	private String address; // ��ַ
	
	public Address () {
		
	}
	
	public Address(String postcode, String phone, String address) {
		this.postcode = postcode;
		this.phone = phone;
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
