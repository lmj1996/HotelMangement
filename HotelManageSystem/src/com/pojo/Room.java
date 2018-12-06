package com.pojo;

public class Room {
    private String roomId;

    private String roomNum;

    private String roomType;

    private String roomFloor;

    private String roomPrice;

    private String roomRemarks;

    private String roomState;

    private String roomCreatetime;

    private String roomModifytime;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum == null ? null : roomNum.trim();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public String getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(String roomFloor) {
        this.roomFloor = roomFloor == null ? null : roomFloor.trim();
    }

    public String getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice == null ? null : roomPrice.trim();
    }

    public String getRoomRemarks() {
        return roomRemarks;
    }

    public void setRoomRemarks(String roomRemarks) {
        this.roomRemarks = roomRemarks == null ? null : roomRemarks.trim();
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState == null ? null : roomState.trim();
    }

    public String getRoomCreatetime() {
        return roomCreatetime;
    }

    public void setRoomCreatetime(String roomCreatetime) {
        this.roomCreatetime = roomCreatetime == null ? null : roomCreatetime.trim();
    }

    public String getRoomModifytime() {
        return roomModifytime;
    }

    public void setRoomModifytime(String roomModifytime) {
        this.roomModifytime = roomModifytime == null ? null : roomModifytime.trim();
    }

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomNum=" + roomNum + ", roomType=" + roomType + ", roomFloor=" + roomFloor
				+ ", roomPrice=" + roomPrice + ", roomRemarks=" + roomRemarks + ", roomState=" + roomState
				+ ", roomCreatetime=" + roomCreatetime + ", roomModifytime=" + roomModifytime + "]";
	}
    
}