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
	public String get = "SELECT * FROM bookings";
    public String showByID = "SELECT * FROM bookings WHERE id = ?";
    public String update = "UPDATE bookings SET users_id = ?, hotels_id = ?, "
            +"packets_id = ?, airlines_id = ?, estimation = ?, price = ?, "
			+ "departuredate = ? WHERE id = ?";
    public String delete = "UPDATE bookings SET deleted_at = ? WHERE id = ?";
}
