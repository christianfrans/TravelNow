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
public class PreQuery {
	public String register = "";
	public String login = "SELECT * FROM users WHERE username = ? AND password = ?";
	public String loginadmin = "SELECT * FROM admin WHERE username = ? AND password = ?";
}
