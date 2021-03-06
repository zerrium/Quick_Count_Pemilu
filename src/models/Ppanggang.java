package models;
import java.sql.*;
import interfaces.ModelInterface;

public class Ppanggang implements ModelInterface{
    private String TPS;
    private int capres1;
    private int capres2;
    
    public Ppanggang(String TPS, int capres1, int capres2){
        this.TPS = TPS;
        this.capres1 = capres1;
        this.capres2 = capres2;
    }
    
    public String getTPS(){
        return TPS;
    }
    
    public void setTPS(String TPS){
        this.TPS = TPS;
    }
    
    public int getCapres1(){
        return capres1;
    }
    
    public void setCapres1(int capres1){
        this.capres1 = capres1;
    }
    
    public int getCapres2(){
        return capres2;
    }
    
    public void setCapres2(int capres2){
        this.capres2 = capres2;
    }
    
    @Override
    public String toString() {
        return TPS;
    }
}
