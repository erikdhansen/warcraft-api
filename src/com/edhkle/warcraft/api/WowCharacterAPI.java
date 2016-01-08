/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.warcraft.api;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ehansen
 */
public class WowCharacterAPI extends AbstractWowApiRequest {

    public static enum FIELDS {
        profile,
        acheivements,
        appearence,
        feed,
        guild,
        hunterPets,
        items,
        mounts,
        pets,
        petSlots,
        progression,
        pvp,
        quests,
        reputation
    }
    
    public WowCharacterAPI(String realm, String name) {
        this.realm = realm;
        this.name = name;
    }
    
    public Map<String,String> getCharacterProfile() {
        return execute(FIELDS.profile.name());
    }

}
