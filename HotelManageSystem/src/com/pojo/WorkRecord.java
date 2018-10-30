package com.pojo;

public class WorkRecord {
    private String workRecordId;

    private String workRecordCurrentstaff;

    private String workRecordNextstaff;

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

    public String getWorkRecordNextstaff() {
        return workRecordNextstaff;
    }

    public void setWorkRecordNextstaff(String workRecordNextstaff) {
        this.workRecordNextstaff = workRecordNextstaff == null ? null : workRecordNextstaff.trim();
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
				+ ", workRecordNextstaff=" + workRecordNextstaff + ", workRecordTime=" + workRecordTime + "]";
	}
    
}