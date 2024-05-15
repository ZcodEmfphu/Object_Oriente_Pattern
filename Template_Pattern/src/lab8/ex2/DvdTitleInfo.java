package lab8.ex2;

class DvdTitleInfo extends TitleInfo {
	String star;
	char encodingRegion;

	public DvdTitleInfo(String titleName, String star, char encodingRegion) {
		this.setTitleName(titleName);
		this.setStar(star);
		this.setEncodingRegion(encodingRegion);
	}

	public char getEncodingRegion() {
		return encodingRegion;
	}

	public void setEncodingRegion(char encodingRegion) {
		this.encodingRegion = encodingRegion;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public String getTitleBlurb() {
		return ("DVD: " + this.getTitleName() + ", starring " + this.getStar());
	}

	public String getDvdEncodingRegionInfo() {
		return (", encoding region: " + this.getEncodingRegion());
	}
}