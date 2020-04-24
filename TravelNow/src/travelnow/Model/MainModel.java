/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelnow.Model;

import java.util.Date;

/**
 *
 * @author user
 */
public class MainModel {
	public String username;
	public String password;
	
	public String first;
	public String last;
	public String address;
	public String email;
	public String phone;
	
	public String passengers;
	public String users_id;
	public String estimation;
	public String price;
	public Date transactiondate;
	public Date deleted_at;
	public String hotels;
	public String packets;
	public String airlines;

	public void setFirst(String first) {
		this.first = first;
	}

	public String getFirst() {
		return first;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getLast() {
		return last;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice() {
		return price;
	}

	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}

	public Date getDeleted_at() {
		return deleted_at;
	}

	public void setEstimation(String estimation) {
		this.estimation = estimation;
	}

	public String getEstimation() {
		return estimation;
	}

	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}

	public String getPassengers() {
		return passengers;
	}

	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}

	public Date getTransactiondate() {
		return transactiondate;
	}

	public void setUsers_id(String users_id) {
		this.users_id = users_id;
	}

	public String getUsers_id() {
		return users_id;
	}
	
	public void setHotels(String hotels) {
		this.hotels = hotels;
	}

	public String getHotels() {
		return hotels;
	}

	public void setPackets(String packets) {
		this.packets = packets;
	}

	public String getPackets() {
		return packets;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
}
