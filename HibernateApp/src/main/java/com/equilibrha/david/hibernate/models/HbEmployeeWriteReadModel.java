package com.equilibrha.david.hibernate.models;
import java.util.Date;
import javax.persistence.*;
//Modelo para grabar y leer los datos de la tabla


@Entity
@Table(name = "EQ_HIBERNATE_WRITEREAD")
public class HbEmployeeWriteReadModel {


	private int employeeID;
	private String employeeName;
	private String employeeSurname;
	private Date birthDate;
	
	public HbEmployeeWriteReadModel() {}
	
	public HbEmployeeWriteReadModel(int employeeID, String employeeName, String employeeSurname,Date birthDate) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.birthDate = birthDate;
    }
	
    @Id
    @Column(name = "employeeID")
    
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSurname() {
		return employeeSurname;
	}

	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
