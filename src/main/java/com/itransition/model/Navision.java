package com.itransition.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * User: v.hudnitsky
 * Date: 17.09.12
 * Time: 18:27
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="navision")
public class Navision {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long EmployeeId;
    @Column
    private Date EvalFinish;
    @Column
    private String LoginName;
    @Column
    private String Qualification;
    @Column
    private String QualificationLevel;
    @Column
    private Date QualifWasAssigned;
    @Column
    private String RM;
    @Column
    private String Manager;
    @Column
    private String EmplStatus;
    @Column
    private String Mentor;
    @Column
    private Date DateOfficialEmpl;
    @Column
    private Date DissmisDate;
    @Column
    private Date StartDate;
    @Column
    private Date FinishDate;
    @Column
    private Date EvalStart;
    public Navision() {

    }

    public Navision(Date EvalFinish,String LoginName,String Qualification,
                    String QualificationLevel,Date QualifWasAssigned,String RM,
                    String Manager,String EmplStatus,String Mentor,Date DateOfficialEmpl,
                    Date DissmisDate,Date StartDate,Date FinishDate,Date EvalStart) {
        this.EvalFinish=EvalFinish;
        this.LoginName=LoginName;
        this.Qualification=Qualification;
        this.QualificationLevel=QualificationLevel;
        this.QualifWasAssigned=QualifWasAssigned;
        this.RM=RM;
        this.Manager=Manager;
        this.EmplStatus=EmplStatus;
        this.Mentor=Mentor;
        this.DateOfficialEmpl=DateOfficialEmpl;
        this.DissmisDate=DissmisDate;
        this.StartDate=StartDate;
        this.FinishDate=FinishDate;
        this.EvalStart=EvalStart;
    }

    public Long getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(Long employeeId) {
        EmployeeId = employeeId;
    }

    public Date getEvalFinish() {
        return EvalFinish;
    }

    public void setEvalFinish(Date evalFinish) {
        EvalFinish = evalFinish;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getQualificationLevel() {
        return QualificationLevel;
    }

    public void setQualificationLevel(String qualificationLevel) {
        QualificationLevel = qualificationLevel;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public Date getQualifWasAssigned() {
        return QualifWasAssigned;
    }

    public void setQualifWasAssigned(Date qualifWasAssigned) {
        QualifWasAssigned = qualifWasAssigned;
    }

    public String getRM() {
        return RM;
    }

    public void setRM(String RM) {
        this.RM = RM;
    }

    public String getManager() {
        return Manager;
    }

    public void setManager(String manager) {
        Manager = manager;
    }

    public String getEmplStatus() {
        return EmplStatus;
    }

    public void setEmplStatus(String emplStatus) {
        EmplStatus = emplStatus;
    }

    public String getMentor() {
        return Mentor;
    }

    public void setMentor(String mentor) {
        Mentor = mentor;
    }

    public Date getDateOfficialEmpl() {
        return DateOfficialEmpl;
    }

    public void setDateOfficialEmpl(Date dateOfficialEmpl) {
        DateOfficialEmpl = dateOfficialEmpl;
    }

    public Date getDissmisDate() {
        return DissmisDate;
    }

    public void setDissmisDate(Date dissmisDate) {
        DissmisDate = dissmisDate;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getFinishDate() {
        return FinishDate;
    }

    public void setFinishDate(Date finishDate) {
        FinishDate = finishDate;
    }

    public Date getEvalStart() {
        return EvalStart;
    }

    public void setEvalStart(Date evalStart) {
        EvalStart = evalStart;
    }
}
