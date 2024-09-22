package chapter20.reservation.model;

import java.util.Date;

public class Reservation {
	private String reservationId;
	private String userId; // 일부 값만 들고오려고
	private String reservationTime;
	private boolean isActive;
	
	public Reservation(String reservationId, String userId, String reservationTime) {
		this.reservationId = reservationId;
		this.userId = userId;
		this.reservationTime = reservationTime;
		this.isActive = true; // 기본값으로 예약은 활성 상태로 생성
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReservationTime() {
		return reservationTime;
	}

	public void setReservationTime(String reservationTime) {
		this.reservationTime = reservationTime;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public void cancel() {
		this.isActive = false;
	}
	
}
