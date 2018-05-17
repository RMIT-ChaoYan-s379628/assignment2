package Main;

import java.util.LinkedList;

/**
 * @author Chao Yan
 * @date 1/5/17 12:00
 * @description Person define a class of all the person in the Net,
 * including Adult and Child.
 * for all Person. 
 */

public class Person {
	protected int m_nAge;
	protected String m_strName, m_strImage, m_strStatus, m_strSex, m_strState;
	private LinkedList<Person> m_lstParent = null;

	public Person(String strName, int nAge, String strImage, String strStatus, String strSex, String strState) {
		m_strName = strName;
		m_nAge = nAge;
		m_strImage = strImage;
		m_strStatus = strStatus;
		m_strSex = strSex;
		m_strState = strState;
		m_lstParent = new LinkedList<>();
	}

	public void setImage(String strImage) {
		m_strImage = strImage;
	}

	public void setStatus(String strStatus) {
		m_strStatus = strStatus;
	}

	public void setSex(String strSex) {
		m_strSex = strSex;
	}

	public void setState(String strState) {
		m_strState = strState;
	}

	public int getAge() {
		return m_nAge;
	}

	public String getName() {
		return m_strName;
	}

	public String getImage() {
		return m_strImage;
	}

	public String getStatus() {
		return m_strStatus;
	}

	public String getSex() {
		return m_strSex;
	}

	public String getState() {
		return m_strState;
	}

	public LinkedList<Person> getParents() {
		return m_lstParent;
	}

	public boolean addParent(Person person) {
		if (null == person || 2 == m_lstParent.size())
			return false;
		// can't have two fathers or two mothers
		for (int nIndex = 0; nIndex < m_lstParent.size(); nIndex++) {
			if (m_lstParent.get(nIndex).getSex().equals(person.getSex()))
				return false;
		}
		m_lstParent.add(person);
		return true;
	}
}
