package com.application.DMS.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@author S569628-Rushika Reddy Pingili

@Entity
public class Trainer {
	@Id
	private int trainerId;
	private String trainerName;
	private String trainerAddress;
	/**
	 * @return the trainerId
	 */
	public int getTrainerId() {
		return trainerId;
	}
	/**
	 * @param trainerId the trainerId to set
	 */
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	/**
	 * @return the trainerName
	 */
	public String getTrainerName() {
		return trainerName;
	}
	/**
	 * @param trainerName the trainerName to set
	 */
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	/**
	 * @return the trainerAddress
	 */
	public String getTrainerAddress() {
		return trainerAddress;
	}
	/**
	 * @param trainerAddress the trainerAddress to set
	 */
	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerAddress=" + trainerAddress
				+ "]";
	}
	
}
