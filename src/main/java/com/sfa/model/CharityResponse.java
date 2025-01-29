package com.sfa.model;

import java.util.List;

import com.sfa.saayam_volunteerorg_service.Controller.CharityResult;

public class CharityResponse {

	  private Data data;
	  
	 public static class Data {
	        private PublicSearchFaceted publicSearchFaceted;
	        
	        public Data() {
	        	super();
	        }

			public PublicSearchFaceted getPublicSearchFaceted() {
				return publicSearchFaceted;
			}

			public void setPublicSearchFaceted(PublicSearchFaceted publicSearchFaceted) {
				this.publicSearchFaceted = publicSearchFaceted;
			}
	    }

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
	public static class PublicSearchFaceted {
      private int size;
      private int from;
      private String term;
      private int result_count;
      private List<CharityResult> results;
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public int getFrom() {
			return from;
		}
		public void setFrom(int from) {
			this.from = from;
		}
		public String getTerm() {
			return term;
		}
		public void setTerm(String term) {
			this.term = term;
		}
		public int getResult_count() {
			return result_count;
		}
		public void setResult_count(int result_count) {
			this.result_count = result_count;
		}
		public List<CharityResult> getResults() {
			return results;
		}
		public void setResults(List<CharityResult> results) {
			this.results = results;
		}

      
  }

  
	 
}