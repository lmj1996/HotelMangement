package com.pojo;

public class Room {
    private String roomId;

    private String roomNum;

    private String roomType;

    private String roomLevel;

    private String roomFloor;

    private String roomPrice;

    private String roomState;

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

    public String getRoomLevel() {
        return roomLevel;
    }

    public void setRoomLevel(String roomLevel) {
        this.roomLevel = roomLevel == null ? null : roomLevel.trim();
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

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState == null ? null : roomState.trim();
    }

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomNum=" + roomNum + ", roomType=" + roomType + ", roomLevel=" + roomLevel
				+ ", roomFloor=" + roomFloor + ", roomPrice=" + roomPrice + ", roomState=" + roomState + "]";
	}
    
}