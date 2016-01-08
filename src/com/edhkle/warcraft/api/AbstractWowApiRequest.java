/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.warcraft.api;

import static com.edhkle.warcraft.api.WowApiRequest.API_KEY;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ehansen
 */
public abstract class AbstractWowApiRequest implements WowApiRequest {
    String realm = "";
    String name = "";
    Map<String,String> retVal = new HashMap<>();
    
    @Override
    public Map<String,String> execute(String fields) {
        Map<String,String> retVal = new HashMap<>();
        String REQ_URL = BASE_API + "realm/" + name + "/" + "/?fields=" + fields + "&apikey=" + API_KEY;
        /**
         * Make Web Service Request
         */
        return retVal;
    }

    public void setCharacter(String name) {
        this.name = name;
    }
    
    public void setRealm(String realm) {
        this.realm = realm;
    }
    
}
