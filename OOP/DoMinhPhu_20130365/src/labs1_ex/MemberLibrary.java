package labs1_ex;

import java.util.ArrayList;
import java.util.List;

public class MemberLibrary {

	private String name;
	private String memberId;
	private String contactInformation;
	private List<Register> memberRegister = new ArrayList<Register>();

	public MemberLibrary(String name, String memberId, String contactInformation) {
		super();
		this.name = name;
		this.memberId = memberId;
		this.contactInformation = contactInformation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public List<Register> getMemberRegister() {
		return memberRegister;
	}

	public void setMemberRegister(List<Register> memberRegister) {
		this.memberRegister = memberRegister;
	}

	public void register(Book book) {
		memberRegister.add(new Register(book));
	}

	public void updateStatusBook(Book b) {
		for (Register r : memberRegister) {
			if (r.getBook().getTitle().equals(b.getTitle())) {
				r.getBook().setStatus("Unavaluable");
				break;
			}

		}
	}

	@Override
	public String toString() {
		return "MemberLibrary [name:" + name + ", memberId:" + memberId + ", contactInformation:" + contactInformation
				+ "\nMemberRegister" + memberRegister + "]";
	}

}
