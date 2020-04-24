package tech4ch.model;

public class Presentation {

	private String poiName;
	private String terminatedBy;

	public Presentation(String poiName, String terminatedBy) {
		this.poiName = poiName;
		this.terminatedBy = terminatedBy;
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

	@Override
	public boolean equals(Object obj) {
		Presentation presentation = (Presentation) obj;
		return this.getPoiName().equals(presentation.getPoiName());
	}


}
