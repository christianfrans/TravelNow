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
	//FOR LOGIN
	public String username;
	public String password;
	
	//FOR REGISTER AND PASSENGERS FORM
	public String first;
	public String last;
	public String address;
	public String email;
	public String phone;
	
	//FOR BOOKINGS
	public String passengers;
	public String users_id;
	public String bookingsID;
	public String estimation;
	public String price;
	public Date transactiondate;
	public Date deleted_at;
	public String hotels;
	public String packets;
	public String airlines;
	
	//FOR HOTEL FRAME
	public String hotel_price;
	public String hotel_name;
	public String hotel_description;

	//FOR PACKET FRAME
	public String packet_price;
	public String packet_name;
	public String packet_description;

	//FOR AIRLINE FRAME
	public String airline_price;
	public String airline_name;
	public String airline_description;

	public void setHotel_price(String hotel_price) {
		this.hotel_price = hotel_price;
	}

	public String getHotel_price() {
		return hotel_price;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_description(String hotel_description) {
		this.hotel_description = hotel_description;
	}

	public String getHotel_description() {
		return hotel_description;
	}

	public void setAirline_description(String airline_description) {
		this.airline_description = airline_description;
	}

	public String getAirline_description() {
		return airline_description;
	}

	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}

	public String getAirline_name() {
		return airline_name;
	}

	public void setAirline_price(String airline_price) {
		this.airline_price = airline_price;
	}

	public String getAirline_price() {
		return airline_price;
	}

	public void setPacket_description(String packet_description) {
		this.packet_description = packet_description;
	}

	public String getPacket_description() {
		return packet_description;
	}

	public void setPacket_name(String packet_name) {
		this.packet_name = packet_name;
	}

	public String getPacket_name() {
		return packet_name;
	}

	public void setPacket_price(String packet_price) {
		this.packet_price = packet_price;
	}

	public String getPacket_price() {
		return packet_price;
	}

	public void setBookingsID(String bookingsID) {
		this.bookingsID = bookingsID;
	}

	public String getBookingsID() {
		return bookingsID;
	}
	
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
	
	public int calculate(int a, int b, int c, int d, int e){
		return ((a * b) + (2 * c) + (a * d)) * e;
	}
}
