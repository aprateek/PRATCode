package prat.classapp.classes;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Class")
public class Classes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int classID ;
	@Column(name ="Class_Discription")
	private String classDiscription;
	@Column(name ="Clas_Start_date")
	private Date classStartDate ;
	@Column(name ="Class_End_Date")
	private Date classEndDate ;
	@Column(name ="LocID")
	private int locID;
	@Column(name ="Class_Start_Time")
	private Time classStartTime;
	@Column(name ="Class_End_Time")
	private Time classEndTime;
	@Column(name ="ActivityID")
	private int activityID;
	@Column(name ="Number_Class")
	private int numberClass;
	@Column(name ="Class_Fee")
	private long classFee;
	private boolean isActive ;
	private Date createDate;
	private Date updateDate;
	private String updateBy;
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public String getClassDiscription() {
		return classDiscription;
	}
	public void setClassDiscription(String classDiscription) {
		this.classDiscription = classDiscription;
	}
	public Date getClassStartDate() {
		return classStartDate;
	}
	public void setClassStartDate(Date classStartDate) {
		this.classStartDate = classStartDate;
	}
	public Date getClassEndDate() {
		return classEndDate;
	}
	public void setClassEndDate(Date classEndDate) {
		this.classEndDate = classEndDate;
	}
	public int getLocID() {
		return locID;
	}
	public void setLocID(int locID) {
		this.locID = locID;
	}
	public Time getClassStartTime() {
		return classStartTime;
	}
	public void setClassStartTime(Time classStartTime) {
		this.classStartTime = classStartTime;
	}
	public Time getClassEndTime() {
		return classEndTime;
	}
	public void setClassEndTime(Time classEndTime) {
		this.classEndTime = classEndTime;
	}
	public int getActivityID() {
		return activityID;
	}
	public void setActivityID(int activityID) {
		this.activityID = activityID;
	}
	public int getNumberClass() {
		return numberClass;
	}
	public void setNumberClass(int numberClass) {
		this.numberClass = numberClass;
	}
	public long getClassFee() {
		return classFee;
	}
	public void setClassFee(long classFee) {
		this.classFee = classFee;
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
