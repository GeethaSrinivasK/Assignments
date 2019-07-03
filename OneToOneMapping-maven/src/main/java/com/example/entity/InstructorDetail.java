package com.example.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name=" instructor_detail")
public class InstructorDetail implements Serializable  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="youtube_channel")
	private String youtubeChannel;
	private String hobby;
	@OneToOne()
	@JoinColumn(name="instructorid")
	private Instructor inst;
	public InstructorDetail() {
		super();
	}
	public InstructorDetail(String youtubeChannel, String hobby) {
		super();
		
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
		//this.inst=inst;
	}
	public Instructor getInst() {
		return inst;
	}
	public void setInst(Instructor inst) {
		this.inst = inst;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYoutubeChannel() {
		return youtubeChannel;
	}
	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Instuctor_Detail [id=" + id + ", youtubeChannel=" + youtubeChannel + ", hobby=" + hobby + "]";
	}
}
