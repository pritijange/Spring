package com.example.demo.model;
import java.util.Date;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@Entity
@JsonIgnoreProperties
public class Nocdetails 
{
	
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nocId;
		
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd" )
	private Date CaseCloseDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd" )
	private Date NocIssueDate;
	
	private int closureId;
	private int vehicleId;
	private int sanctionId;
	private int custId;
	public int getNocId() {
		return nocId;
	}
	public void setNocId(int nocId) {
		this.nocId = nocId;
	}
	public Date getCaseCloseDate() {
		return CaseCloseDate;
	}
	public void setCaseCloseDate(Date caseCloseDate) {
		CaseCloseDate = caseCloseDate;
	}
	public Date getNocIssueDate() {
		return NocIssueDate;
	}
	public void setNocIssueDate(Date nocIssueDate) {
		NocIssueDate = nocIssueDate;
	}
	public int getClosureId() {
		return closureId;
	}
	public void setClosureId(int closureId) {
		this.closureId = closureId;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getSanctionId() {
		return sanctionId;
	}
	public void setSanctionId(int sanctionId) {
		this.sanctionId = sanctionId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	@Override
	public String toString() {
		return "Nocdetails [nocId=" + nocId + ", CaseCloseDate=" + CaseCloseDate + ", NocIssueDate=" + NocIssueDate
				+ ", closureId=" + closureId + ", vehicleId=" + vehicleId + ", sanctionId=" + sanctionId + ", custId="
				+ custId + "]";
	}

	
}
