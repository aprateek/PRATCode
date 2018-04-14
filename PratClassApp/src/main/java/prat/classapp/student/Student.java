package prat.classapp.student;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity 
public class Student {	 
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private int studID ;
		private String studFname;
		private String studLName;
		private boolean sex;
		private Date dob;
		private String primaryAddr;
		private String secondaryAddr;
		private boolean isActive ;
		private Date createDate;
		private Date uodateDate;
		private int phoneNumber;
		public int getStudID() {
			return studID;
		}
		public void setStudID(int studID) {
			this.studID = studID;
		}
		public String getStudFname() {
			return studFname;
		}
		public void setStudFname(String studFname) {
			this.studFname = studFname;
		}
		public String getStudLName() {
			return studLName;
		}
		public void setStudLName(String studLName) {
			this.studLName = studLName;
		}
		public boolean isSex() {
			return sex;
		}
		public void setSex(boolean sex) {
			this.sex = sex;
		}
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public String getPrimaryAddr() {
			return primaryAddr;
		}
		public void setPrimaryAddr(String primaryAddr) {
			this.primaryAddr = primaryAddr;
		}
		public String getSecondaryAddr() {
			return secondaryAddr;
		}
		public void setSecondaryAddr(String secondaryAddr) {
			this.secondaryAddr = secondaryAddr;
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
		public Date getUodateDate() {
			return uodateDate;
		}
		public void setUodateDate(Date uodateDate) {
			this.uodateDate = uodateDate;
		}
		public int getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		
		
}
