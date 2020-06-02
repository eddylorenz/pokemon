package com.bancaya.soap.services;

import com.bancaya.soap.utils.APIRest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.HashMap;
import java.util.Map;

import static com.bancaya.soap.utils.Constants.APIREST_URI_ABILITY;

public class ExperienceService implements ExperienceServiceI {

    @Override
    public String getExperience(String pokemon){

        String result = "";
        final String uri = APIREST_URI_ABILITY;
        ObjectMapper objectMapper = new ObjectMapper();


        try {
            Map<String, String> params = new HashMap<String, String>();
            params.put("pokemon", pokemon);

            result = APIRest.getForObject(uri, String.class, params);
            final ObjectNode node = new ObjectMapper().readValue(result, ObjectNode.class);
            result = node.get("base_experience").toString();


        } catch (Exception e){
            e.printStackTrace();
        }

    return result;
    }
}
