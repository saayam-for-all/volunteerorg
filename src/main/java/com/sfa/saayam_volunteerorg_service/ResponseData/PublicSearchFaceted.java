package com.sfa.saayam_volunteerorg_service.ResponseData;

import java.util.List;

public class PublicSearchFaceted {
    private Long size;
    private Long from;
    private String term;
    private Long result_count;
    private List<Result> results;
	public PublicSearchFaceted(Long size, Long from, String term, Long result_count, List<Result> results) {
		super();
		this.size = size;
		this.from = from;
		this.term = term;
		this.result_count = result_count;
		this.results = results;
	}
	public PublicSearchFaceted() {
		super();
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public Long getFrom() {
		return from;
	}
	public void setFrom(Long from) {
		this.from = from;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public Long getResult_count() {
		return result_count;
	}
	public void setResult_count(Long result_count) {
		this.result_count = result_count;
	}
	public List<Result> getResults() {
		return results;
	}
	public void setResults(List<Result> results) {
		this.results = results;
	}
    
    
    
}
