package com.chf.design.pattern.struct.flyweight;

public class Location {

	private String dcID;

	private String zoneID;

	public Location(String dcID) {
		super();
		this.dcID = dcID;
	}

	public String getDcID() {
		return dcID;
	}

	public void setDcID(String dcID) {
		this.dcID = dcID;
	}

	public String getZoneID() {
		return zoneID;
	}

	public void setZoneID(String zoneID) {
		this.zoneID = zoneID;
	}

}
