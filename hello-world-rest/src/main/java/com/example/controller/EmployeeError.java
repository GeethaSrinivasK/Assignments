package com.example.controller;

public class EmployeeError {

	private int status;
	private String messge;
	private long timeOccured;
	public EmployeeError() {
		super();
	}
	public EmployeeError(int status, String messge, long timeOccured) {
		super();
		this.status = status;
		this.messge = messge;
		this.timeOccured = timeOccured;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessge() {
		return messge;
	}
	public void setMessge(String messge) {
		this.messge = messge;
	}
	public long getTimeOccured() {
		return timeOccured;
	}
	public void setTimeOccured(long timeOccured) {
		this.timeOccured = timeOccured;
	}
}
