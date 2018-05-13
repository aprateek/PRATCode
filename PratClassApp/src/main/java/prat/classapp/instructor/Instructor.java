package prat.classapp.instructor;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import prat.classapp.classes.Classes;

@Entity
public class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int instID;
	@Column(name = "Inst_First_Name")
	private String instFirstName;
	@Column(name = "inst_Last_Name")
	private String instLastName;
	@Column(name = "DoB")
	private Date instDOB;
	@Column(name = "sex")
	private char instSex;
	@Column(name = "Inst_Primary_Addr")
	private String instPrimaryAddr;
	@Column(name = "Inst_Secondry_Addr")
	private String instSecondryAddr;
	@Column(name = "Qualification")
	private String instQualification;
	@Column(name = "Phone_Number")
	private String instPhoneNumber;
	private boolean isActive;
	private Date createDate;
	private Date updateDate;
	private String updateBy;
	
	//==============================

	@ManyToMany(mappedBy = "instructors")
	private Set<Classes> classes;
	
	public Instructor(){

    }

    public Instructor(String name){
        this.instFirstName = name;
    }

    public Instructor(String name, Set<Classes> classes){
        this.instFirstName = name;
        this.classes = classes;
    }
	
	
	public Set<Classes> getClasses() {
        return classes;
    }

    public void setClasses (Set<Classes> classes) {
        this.classes = classes;
    }
    //==============================

	public String getFirstName() {
		return instFirstName;
	}

	 

	public void setFirstName(String firstName) {
		this.instFirstName = firstName;
	}

	public String getLastName() {
		return instLastName;
	}

	public void setLastName(String lastName) {
		this.instLastName = lastName;
	}

	public int getInstID() {
		return instID;
	}

	public void setInstID(int instID) {
		this.instID = instID;
	}

	public String getInstFirstName() {
		return instFirstName;
	}

	public void setInstFirstName(String instFirstName) {
		this.instFirstName = instFirstName;
	}

	public String getInstLastName() {
		return instLastName;
	}

	public void setInstLastName(String instLastName) {
		this.instLastName = instLastName;
	}

	public Date getInstDOB() {
		return instDOB;
	}

	public void setInstDOB(Date instDOB) {
		this.instDOB = instDOB;
	}

	public char getInstSex() {
		return instSex;
	}

	public void setInstSex(char instSex) {
		this.instSex = instSex;
	}

	public String getInstPrimaryAddr() {
		return instPrimaryAddr;
	}

	public void setInstPrimaryAddr(String instPrimaryAddr) {
		this.instPrimaryAddr = instPrimaryAddr;
	}

	public String getInstSecondryAddr() {
		return instSecondryAddr;
	}

	public void setInstSecondryAddr(String instSecondryAddr) {
		this.instSecondryAddr = instSecondryAddr;
	}

	public String getInstQualification() {
		return instQualification;
	}

	public void setInstQualification(String instQualification) {
		this.instQualification = instQualification;
	}

	public String getInstPhoneNumber() {
		return instPhoneNumber;
	}

	public void setInstPhoneNumber(String instPhoneNumber) {
		this.instPhoneNumber = instPhoneNumber;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

}
