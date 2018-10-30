package com.pojo;

public class Position {
    private String positionId;

    private String positionName;

    private String positionLevel;

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId == null ? null : positionId.trim();
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public String getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel == null ? null : positionLevel.trim();
    }

	@Override
	public String toString() {
		return "Position [positionId=" + positionId + ", positionName=" + positionName + ", positionLevel="
				+ positionLevel + "]";
	}
    
}