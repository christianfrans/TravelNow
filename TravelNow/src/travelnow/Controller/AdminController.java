/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelnow.Controller;

import java.sql.ResultSet;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import travelnow.Helper.Helper;
import travelnow.Model.MainModel;
import travelnow.Query.AdminQuery;

/**
 *
 * @author user
 */
public class AdminController extends BaseController{
	AdminQuery query = new AdminQuery();
    Helper helper = new Helper();
	
    public boolean input_hotel(MainModel model) throws ParseException {
        Map<Integer, Object>map = new HashMap<>();
        map.put(1, model.getHotel_price());
        map.put(2, model.getHotel_description());
        map.put(3, model.getHotel_name());
        
        String sql = this.query.input_hotel;
        
        return this.preparedStatement(map, sql);
    }
    
    public boolean input_packet (MainModel model) throws ParseException {
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getPacket_price());
        map.put(2, model.getPacket_description());
        map.put(3, model.getPacket_name());
        
        String sql = this.query.input_packet;
        
        return this.preparedStatement(map, sql);
    }
    
    public boolean input_airline (MainModel model) throws ParseException {
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getAirline_price());
        map.put(2, model.getAirline_description());
        map.put(3, model.getAirline_name());
        
        String sql = this.query.input_airline;
        
        return this.preparedStatement(map, sql);
    }
        
        public Boolean update_hotel (String id, MainModel model) throws ParseException {
            Map<Integer, Object> map = new HashMap<>();
            map.put(1, model.getHotel_price());
            map.put(2, model.getHotel_description());
            map.put(3, model.getHotel_name());            
            map.put(4, id);
            
            String sql = this.query.update_hotel;
            
            return preparedStatement(map, sql);
        }
        
        public Boolean update_packet (String id, MainModel model) throws ParseException {
            Map<Integer, Object> map = new HashMap<>();
            map.put(1, model.getPacket_price());
            map.put(2, model.getPacket_description());
            map.put(3, model.getPacket_name());
            map.put(4, id);
            
            String sql = this.query.update_packet;
            
            return preparedStatement(map, sql);
        }
        
        public Boolean update_airline (String id, MainModel model) throws ParseException {
            Map<Integer, Object> map = new HashMap<>();
            map.put(1, model.getAirline_price());
            map.put(2, model.getAirline_description());
            map.put(3, model.getAirline_name());
            map.put(4, id);
            
            String sql = this.query.update_airline;
            
            return preparedStatement(map, sql);                    
        }
		
		public Boolean deleteHotels(LocalDateTime deleted_at, String hotelsID) throws ParseException {  //untuk delete
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, deleted_at);
		map.put(2, hotelsID);
		String sql = this.query.deleteHotels;

		return this.preparedStatement(map, sql);
		}
		
		public Boolean deleteAirlines(LocalDateTime deleted_at, String airlinesID) throws ParseException {  //untuk delete
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, deleted_at);
		map.put(2, airlinesID);
		String sql = this.query.deleteHotels;

		return this.preparedStatement(map, sql);
		}
		
		public Boolean deletePackets(LocalDateTime deleted_at, String packetsID) throws ParseException {  //untuk delete
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, deleted_at);
		map.put(2, packetsID);
		String sql = this.query.deleteHotels;

		return this.preparedStatement(map, sql);
		}
        
        public ResultSet get_hotel(){
            String sql = this.query.get_hotel;
            return this.get(sql);            
        }
        
        public ResultSet get_packet() {
            String sql = this.query.get_packet;
            return this.get(sql);
        }
        
        public ResultSet get_airline() {
            String sql = this.query.get_airline;
            return this.get(sql);
        }
        
        public ResultSet showByNameHotels(String name) { //pencarian bedasarkan nama
		String sql = this.query.showByHotel;

		Map<Integer, Object> map = new HashMap<>();
		map.put(1, helper.parseLikeQuery(name));

		return this.getWithParameter(map, sql);
		}
		
		public ResultSet showByPriceHotels(String price) { //pencarian bedasarkan nama
		String sql = this.query.showByPrice;

		Map<Integer, Object> map = new HashMap<>();
		map.put(1, helper.parseLikeQuery(price));

		return this.getWithParameter(map, sql);
		}
		
		
		
		public ResultSet showByNameAirlines(String name) { //pencarian bedasarkan nama
		String sql = this.query.showByAirline;

		Map<Integer, Object> map = new HashMap<>();
		map.put(1, helper.parseLikeQuery(name));

		return this.getWithParameter(map, sql);
		}
		
		public ResultSet showByNamePackets(String name) { //pencarian bedasarkan nama
		String sql = this.query.showByPacket;

		Map<Integer, Object> map = new HashMap<>();
		map.put(1, helper.parseLikeQuery(name));

		return this.getWithParameter(map, sql);
		}
}
