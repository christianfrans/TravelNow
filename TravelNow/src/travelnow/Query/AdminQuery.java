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
public class AdminQuery {
    public String get_hotel = "SELECT * FROM hotels WHERE deleted_at IS NULL"; //DISPLAY TABLE
    public String get_packet = "SELECT * FROM packets WHERE deleted_at IS NULL";
    public String get_airline = "SELECT * FROM airlines WHERE deleted_at IS NULL";
    
    public String showByHotel = "SELECT * FROM hotels WHERE name LIKE ?"; //SEARCHING
    public String showByPacket = "SELECT * FROM packets WHERE name LIKE ?";
    public String showByAirline = "SELECT * FROM airlines WHERE name LIKE ?";
	
	public String showByPrice = "SELECT * FROM hotels WHERE price LIKE ? AND deleted_at IS NULL";
    
    public String update_hotel = "UPDATE hotels SET price = ?, description = ?, "
            +"name = ? WHERE id = ?"; //UPDATING
    public String update_packet = "UPDATE packets SET price = ?, description = ?,"
            + "name = ? WHERE id = ?";
    public String update_airline = "UPDATE airlines SET price = ?, description = ?,"
            + "name = ? WHERE id = ?";
	
	public String deleteHotels = "UPDATE hotels SET deleted_at = ? WHERE id = ?"; //DELETE BY CLICKING IN THE TABLE ROW
	public String deleteAirlines = "UPDATE airlines SET deleted_at = ? WHERE id = ?";
	public String deletePackets = "UPDATE packets SET deleted_at = ? WHERE id = ?";

    public String input_hotel = "INSERT INTO hotels (price, description, name)"
            + "VALUES (?,?,?)"; //INPUT NEW VARIANT
    public String input_packet = "INSERT INTO packets (price, description, name)"
            + "VALUES (?,?,?)";
    public String input_airline = "INSERT INTO airline (price, description, name)"
            + "VALUES (?,?,?)";
}
