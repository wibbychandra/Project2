/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companystockexchange.Controller;

import companystockexchange.Helper.Helper;
import companystockexchange.Model.MainModel;
import companystockexchange.Query.MainQuery;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Wibby Chandra
 */
public class MainController extends BaseController{
    Helper helper = new Helper();
    MainQuery query = new MainQuery();
    
    public ResultSet login(String username, String password){
        String sql = this.query.login;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, username);
        map.put(2, password);
        
        return this.getWithParameter(map, sql);
    }
    
    public boolean create(MainModel model) throws ParseException{
        String date = helper.parseDateToString(model.getTanggal());
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getTanggal());
        map.put(3, model.getLembar());
        map.put(4, model.getPersen());
        map.put(5, model.getHarga());
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
    
    public ResultSet getShareHolders(){
        String sql = this.query.getShareholder;
        return this.get(sql);
    }
    
    public ResultSet showById(String id){
        String sql = this.query.showById;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        return this.getWithParameter(map, sql);
    }
    
    public ResultSet showByName(String name){
        String sql = this.query.showByName;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(name));
        
        return this.getWithParameter(map, sql);
    }
    
    public Boolean update(String id, MainModel model) throws ParseException{
        String date = helper.parseDateToString(model.getTanggal());
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, date);
        map.put(3, model.getLembar());
        map.put(4, model.getPersen());
        map.put(5, model.getHarga());
        map.put(6, id);
        
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }
    
    public Boolean delete(String id) throws ParseException{
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        String sql = this.query.delete;
        
        return this.preparedStatement(map, sql);
    }
}