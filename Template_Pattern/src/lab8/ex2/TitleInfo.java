package lab8.ex2;

public abstract class TitleInfo {
	private String titleName;

	public final String processTitleInfo() {
		StringBuffer titleInfo = new StringBuffer();
		titleInfo.append(this.getTitleBlurb());
		titleInfo.append(this.getDvdEncodingRegionInfo());
		return titleInfo.toString();
	}

	public final void setTitleName(String titleNameIn) {
		this.titleName = titleNameIn;
	}

	public final String getTitleName() {
		return this.titleName;
	}

	public abstract String getTitleBlurb();

	public String getDvdEncodingRegionInfo() {
		return " ";
	}

}
