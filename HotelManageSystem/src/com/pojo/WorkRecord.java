package com.pojo;

public class WorkRecord {
    private String workRecordId;

    private String workRecordCurrentstaff;

    private String workRecordType;

    private String workRecordTime;

    public String getWorkRecordId() {
        return workRecordId;
    }

    public void setWorkRecordId(String workRecordId) {
        this.workRecordId = workRecordId == null ? null : workRecordId.trim();
    }

    public String getWorkRecordCurrentstaff() {
        return workRecordCurrentstaff;
    }

    public void setWorkRecordCurrentstaff(String workRecordCurrentstaff) {
        this.workRecordCurrentstaff = workRecordCurrentstaff == null ? null : workRecordCurrentstaff.trim();
    }

    public String getWorkRecordType() {
        return workRecordType;
    }

    public void setWorkRecordType(String workRecordType) {
        this.workRecordType = workRecordType == null ? null : workRecordType.trim();
    }

    public String getWorkRecordTime() {
        return workRecordTime;
    }

    public void setWorkRecordTime(String workRecordTime) {
        this.workRecordTime = workRecordTime == null ? null : workRecordTime.trim();
    }

	@Override
	public String toString() {
		return "WorkRecord [workRecordId=" + workRecordId + ", workRecordCurrentstaff=" + workRecordCurrentstaff
				+ ", workRecordType=" + workRecordType + ", workRecordTime=" + workRecordTime + "]";
	}
    
}