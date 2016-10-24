/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testservice.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JobCandidate generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`JobCandidate`")
public class JobCandidate implements Serializable {

    private Integer jobCandidateId;
    private Integer businessEntityId;
    private String resume;
    private Date modifiedDate;
    private Employee employee;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`JobCandidateID`", nullable = false, scale = 0, precision = 10)
    public Integer getJobCandidateId() {
        return this.jobCandidateId;
    }

    public void setJobCandidateId(Integer jobCandidateId) {
        this.jobCandidateId = jobCandidateId;
    }

    @Column(name = "`BusinessEntityID`", nullable = true, scale = 0, precision = 10)
    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }

    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }

    @Column(name = "`Resume`", nullable = true, length = 255)
    public String getResume() {
        return this.resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "`ModifiedDate`", nullable = false)
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`BusinessEntityID`", referencedColumnName = "`BusinessEntityID`", insertable = false, updatable = false)
    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        if(employee != null) {
            this.businessEntityId = employee.getBusinessEntityId();
        }

        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobCandidate)) return false;
        final JobCandidate jobCandidate = (JobCandidate) o;
        return Objects.equals(getJobCandidateId(), jobCandidate.getJobCandidateId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJobCandidateId());
    }
}

