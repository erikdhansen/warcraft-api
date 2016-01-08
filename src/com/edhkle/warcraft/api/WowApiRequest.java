/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.warcraft.api;

import java.util.Map;

/**
 *
 * @author ehansen
 */
interface WowApiRequest {
    
    final static String BASE_API = "http://us.api.battle.net/wow/";
    final static String API_KEY = "yew7h6j9sn53syx5jasezvkvck3ytsf3";
    
    public Map<String,String> execute(String fields);
    
}
