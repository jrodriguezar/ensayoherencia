package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jrodriguezar
 */
public class Company {
    
    private String name;
    private ArrayList<Asset> assets;
    private HashMap<Integer, Cliente> clients;
    
    public Company(String name, ArrayList<Asset> assets, HashMap<Integer, Cliente> clients){
        this.name = name;
        this.assets = new ArrayList<>();
        this.clients = new HashMap<>();
    }
    
    public boolean addClient(int id, String name, String email, String lastname){
        //implementar asignacion
        this.clients.put(id, new Cliente(id, email, name, lastname));
        return false;
    }
    
    public boolean addCash(double amount){
        //implementar asignacion
        return false;
    }
    
    public boolean addStock(int totalShares, String symbol, double totalCost, double currentPrice){
        //implementar asginacion
        return false;
    }
    
    public double getAllMarketValue(){
        double marketValue = 0;
        for (Cliente client : clients.values()) {
            for (Asset asset : client.getAssets()) {
                marketValue+=asset.getMarcket();
            }
        }
        return marketValue;
    }
    
    public double getAllProfit(){
        double profit = 0;
        for (Cliente client : clients.values()) {
            for (Asset asset : client.getAssets()) {
                profit+=asset.getProfit();
            }
        }
        return profit;
    }
    
    public HashMap<String, Double> getMarketValueByRange(){
        
    }
}   