package com.bancaya.soap.services;

import com.bancaya.soap.dao.RequestDAO;
import com.bancaya.soap.models.db.Request;
import com.bancaya.soap.utils.APIRest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

import static com.bancaya.soap.utils.Constants.APIREST_URI_ABILITY;

public class AbilitiesService implements AbilitiesServiceI {

    @Autowired
    RequestDAO requestDao = new RequestDAO();

    @Override
    public String getAbilities(String pokemon, String ipAddress){

        String result = "";
        final String uri = APIREST_URI_ABILITY;
        Request request = new Request(ipAddress, "abilities");

        try {
            Map<String, String> params = new HashMap<String, String>();
            params.put("pokemon", pokemon);

            requestDao.insertRequest(request);

            result = APIRest.getForObject(uri, String.class, params);
            final ObjectNode node = new ObjectMapper().readValue(result, ObjectNode.class);
            result = node.get("abilities").toString();


        } catch (Exception e){
            e.printStackTrace();
        }

    return result;
    }


}
