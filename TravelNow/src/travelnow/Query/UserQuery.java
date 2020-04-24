/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelnow.Query;

/**
 *
 * @author user
 */
public class UserQuery {
	public String insert = "INSERT INTO bookings (users_id, hotels_id, packets_id"
			+ ", airlines_id, estimation, amount"
			+ ", transactiondate) VALUES (?,?,?,?,?,?,?)";
	
	public String users = "SELECT id from users WHERE username = ? AND password = ?";
	public String pilihpaket = "SELECT price from packets WHERE name = ?";
	public String pilihhotel = "SELECT price from hotels WHERE name = ?";
	public String pilihmaskapai = "SELECT price from airlines WHERE name = ?";
}
