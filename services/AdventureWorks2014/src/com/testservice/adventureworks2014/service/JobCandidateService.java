/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testservice.adventureworks2014.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testservice.adventureworks2014.JobCandidate;

/**
 * Service object for domain model class {@link JobCandidate}.
 */
public interface JobCandidateService {

    /**
     * Creates a new JobCandidate. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on JobCandidate if any.
     *
     * @param jobCandidate Details of the JobCandidate to be created; value cannot be null.
     * @return The newly created JobCandidate.
     */
	JobCandidate create(JobCandidate jobCandidate);


	/**
	 * Returns JobCandidate by given id if exists.
	 *
	 * @param jobcandidateId The id of the JobCandidate to get; value cannot be null.
	 * @return JobCandidate associated with the given jobcandidateId.
     * @throws EntityNotFoundException If no JobCandidate is found.
	 */
	JobCandidate getById(Integer jobcandidateId) throws EntityNotFoundException;

    /**
	 * Find and return the JobCandidate by given id if exists, returns null otherwise.
	 *
	 * @param jobcandidateId The id of the JobCandidate to get; value cannot be null.
	 * @return JobCandidate associated with the given jobcandidateId.
	 */
	JobCandidate findById(Integer jobcandidateId);


	/**
	 * Updates the details of an existing JobCandidate. It replaces all fields of the existing JobCandidate with the given jobCandidate.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on JobCandidate if any.
     *
	 * @param jobCandidate The details of the JobCandidate to be updated; value cannot be null.
	 * @return The updated JobCandidate.
	 * @throws EntityNotFoundException if no JobCandidate is found with given input.
	 */
	JobCandidate update(JobCandidate jobCandidate) throws EntityNotFoundException;

    /**
	 * Deletes an existing JobCandidate with the given id.
	 *
	 * @param jobcandidateId The id of the JobCandidate to be deleted; value cannot be null.
	 * @return The deleted JobCandidate.
	 * @throws EntityNotFoundException if no JobCandidate found with the given id.
	 */
	JobCandidate delete(Integer jobcandidateId) throws EntityNotFoundException;

	/**
	 * Find all JobCandidates matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching JobCandidates.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<JobCandidate> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all JobCandidates matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching JobCandidates.
     *
     * @see Pageable
     * @see Page
	 */
    Page<JobCandidate> findAll(String query, Pageable pageable);

    /**
	 * Exports all JobCandidates matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
	 */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the JobCandidates in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the JobCandidate.
	 */
	long count(String query);


}

