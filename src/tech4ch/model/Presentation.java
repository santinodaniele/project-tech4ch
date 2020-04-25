package tech4ch.model;

public class Presentation {

	private String poiName;
	private String terminatedBy;
	private int totalGroupNumber;
	private int totalGroupSeconds;

	public Presentation(String poiName, String terminatedBy) {
		this.poiName = poiName;
		this.terminatedBy = terminatedBy;
	}
	
	public Presentation(String poiName) {
		this.poiName = poiName;
		this.totalGroupNumber = 0;
		this.totalGroupSeconds = 0;
	}

	public String getPoiName() {
		return poiName;
	}

	public void setPoiName(String poiName) {
		this.poiName = poiName;
	}

	public String getTerminatedBy() {
		return terminatedBy;
	}

	public void setTerminatedBy(String terminatedBy) {
		this.terminatedBy = terminatedBy;
	}

	public int getTotalGroupNumber() {
		return totalGroupNumber;
	}

	public void setTotalGroupNumber(int totalGroupNumber) {
		this.totalGroupNumber = totalGroupNumber;
	}

	public int getTotalGroupSeconds() {
		return totalGroupSeconds;
	}

	public void setTotalGroupSeconds(int totalGroupSeconds) {
		this.totalGroupSeconds = totalGroupSeconds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((poiName == null) ? 0 : poiName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Presentation other = (Presentation) obj;
		if (poiName == null) {
			if (other.poiName != null)
				return false;
		} else if (!poiName.equals(other.poiName))
			return false;
		return true;
	}

}
