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

import com.testservice.adventureworks2014.VjobCandidateEmployment;
import com.testservice.adventureworks2014.VjobCandidateEmploymentId;

/**
 * Service object for domain model class {@link VjobCandidateEmployment}.
 */
public interface VjobCandidateEmploymentService {


	/**
	 * Returns VjobCandidateEmployment by given id if exists.
	 *
	 * @param vjobcandidateemploymentId The id of the VjobCandidateEmployment to get; value cannot be null.
	 * @return VjobCandidateEmployment associated with the given vjobcandidateemploymentId.
     * @throws EntityNotFoundException If no VjobCandidateEmployment is found.
	 */
	VjobCandidateEmployment getById(VjobCandidateEmploymentId vjobcandidateemploymentId) throws EntityNotFoundException;

    /**
	 * Find and return the VjobCandidateEmployment by given id if exists, returns null otherwise.
	 *
	 * @param vjobcandidateemploymentId The id of the VjobCandidateEmployment to get; value cannot be null.
	 * @return VjobCandidateEmployment associated with the given vjobcandidateemploymentId.
	 */
	VjobCandidateEmployment findById(VjobCandidateEmploymentId vjobcandidateemploymentId);


	/**
	 * Find all VjobCandidateEmployments matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching VjobCandidateEmployments.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<VjobCandidateEmployment> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all VjobCandidateEmployments matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching VjobCandidateEmployments.
     *
     * @see Pageable
     * @see Page
	 */
    Page<VjobCandidateEmployment> findAll(String query, Pageable pageable);

    /**
	 * Exports all VjobCandidateEmployments matching the given input query to the given exportType format.
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
	 * Retrieve the count of the VjobCandidateEmployments in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the VjobCandidateEmployment.
	 */
	long count(String query);


}

