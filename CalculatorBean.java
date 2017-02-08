/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaee_assign1a;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Leezle
 */

/*
These calculations are done assuming a 1080p bitrate of 17mb/s
and a 720p bitrate of 8mb/s
*/


public class CalculatorBean implements Serializable {
    public static final int FULLHD_BITRATE = 17;
    public static final int STANDARDHD_BITRATE = 8;
    private int reqStorageMB;
    private int reqStorageGB;
    private String videoRes;
    private int videoLength;
    
    // No Arg Constructor
    public CalculatorBean() {
    }
    
    public int getReqStorageMB(){
     return this.reqStorageMB;
    }
    
    public void setReqStorageMB(int mb) {
        this.reqStorageMB = mb;
    }
    
    public int getReqStorageGB(){
        return this.reqStorageGB;
    }
    
    public void setReqStorageGB(int gb) {
        this.reqStorageGB = gb;
    }
    
    public String getVidRes(){
       return this.videoRes; 
    }
    
    public void setVidRes(String res){
        this.videoRes = res;
    }
    
    public int getVidLength(){
        return this.videoLength;
    }
    
    public void setVidLength(int sec){
        this.videoLength = sec;
    }
    
    public void UpdateMemReqs(String res, int sec){
        this.videoRes = res;
        this.videoLength = sec;
        
        if(res.equalsIgnoreCase("1080p")){
            this.reqStorageMB = videoLength * FULLHD_BITRATE;
            this.reqStorageGB = (videoLength * FULLHD_BITRATE)/ 1024;
        } else if(res.equalsIgnoreCase("720p")){
            this.reqStorageMB = videoLength * STANDARDHD_BITRATE;
            this.reqStorageGB = (videoLength * STANDARDHD_BITRATE)/ 1024;
        } else {
            System.out.println("Incorrect Video Resolution Was Entered");
        }
    }
    
}
