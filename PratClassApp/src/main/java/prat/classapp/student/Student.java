package prat.classapp.student;

 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity 
public class Student {	 
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY) 
	    private int studID ;
		
		private String studFname;
		private String studLName;
		private char sex;
		private Date dob;
		private String primaryAddress;
		private String secondaryAddress;
		private boolean isActive ;
		private Date createDate;
		private Date updateDate;
		private int phoneNumber;
		private String updateBy;
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
		public char isSex() {
			return sex;
		}
		public void setSex(char sex) {
			this.sex = sex;
		}
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public String getPrimaryAddress() {
			return primaryAddress;
		}
		public void setPrimaryAddress(String primaryAddr) {
			this.primaryAddress = primaryAddr;
		}
		public String getSecondaryAddress() {
			return secondaryAddress;
		}
		public void setSecondaryAddress(String secondaryAddr) {
			this.secondaryAddress = secondaryAddr;
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
			/* SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-DD");
		        String dateInString = "2013-03-03";

		         Date date= null;
				try {
					date = (Date) formatter.parse(dateInString);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			this.createDate = createDate;
		}
		public Date getUpdateDate() {
			return updateDate;
		}
		public void setUpdateDate(Date uodateDate) {
			this.updateDate = uodateDate;
		}
		public int getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getUpdateBy() {
			return updateBy;
		}
		public void setUpdateBy(String updatedBy) {
			this.updateBy = updatedBy;
		}
		
		
		
}
