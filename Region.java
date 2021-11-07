public class Region {
	
	private String regionName;
	private int regionSoldiers;
	private String regionColor;
	
	public Region(String regionName, int regionSoldiers, String regionColor) {
		this.regionName = regionName;
		this.regionSoldiers = regionSoldiers;
		this.regionColor = regionColor;
	}

	public String getRegionName() {
		return regionName;
	}
	
	public void setRegionName(String regionName ) {
		this.regionName = regionName;
	}
	
	public int getRegionSoldiers() {
		return regionSoldiers;
	}

	public void setRegionSoldiers(int regionSoldiers) {
		this.regionSoldiers = regionSoldiers;
	}

	public String getRegionColor() {
		return regionColor;
	}

	public void setRegionColor(String regionColor) {
		this.regionColor = regionColor;
	}	
}
