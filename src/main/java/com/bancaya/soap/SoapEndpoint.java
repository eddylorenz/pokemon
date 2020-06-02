package com.bancaya.soap;

import com.bancaya.soap.models.abilities.AbilitiesRequest;
import com.bancaya.soap.models.abilities.AbilitiesResponse;
import com.bancaya.soap.models.experience.ExperienceRequest;
import com.bancaya.soap.models.experience.ExperienceResponse;
import com.bancaya.soap.models.held.HeldRequest;
import com.bancaya.soap.models.held.HeldResponse;
import com.bancaya.soap.models.id.IdRequest;
import com.bancaya.soap.models.id.IdResponse;
import com.bancaya.soap.models.location.LocationRequest;
import com.bancaya.soap.models.location.LocationResponse;
import com.bancaya.soap.models.name.NameRequest;
import com.bancaya.soap.models.name.NameResponse;
import com.bancaya.soap.services.*;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.context.ApplicationContext;


import javax.servlet.http.HttpServletRequest;

@Endpoint
public class SoapEndpoint {

    @Autowired
    public SoapEndpoint() {}

    @Autowired
    private HttpServletRequest requestHttp;

    @PayloadRoot(namespace = "com/bancaya/soap/models/abilities", localPart = "AbilitiesRequest")
    @ResponsePayload
    public AbilitiesResponse getAbilities(@RequestPayload AbilitiesRequest request) {

        AbilitiesService abilitiesService = new AbilitiesService();
        AbilitiesResponse abilitiesResponse = new AbilitiesResponse();

        try {
            String ipAddress = requestHttp.getHeader("X-FORWARDED-FOR");
            if (ipAddress == null) {
                ipAddress = requestHttp.getRemoteAddr();
            }
            abilitiesResponse.setJsonResponse(abilitiesService.getAbilities(request.getPokemon(), ipAddress));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return abilitiesResponse;
    }

    @PayloadRoot(namespace = "com/bancaya/soap/models/experience", localPart = "ExperienceRequest")
    @ResponsePayload
    public ExperienceResponse getExperience(@RequestPayload ExperienceRequest request) {
        ExperienceService experienceService = new ExperienceService();
        ExperienceResponse experienceResponse = new ExperienceResponse();
        try {
            String ipAddress = requestHttp.getHeader("X-FORWARDED-FOR");
            if (ipAddress == null) {
                ipAddress = requestHttp.getRemoteAddr();
            }
            experienceResponse.setJsonResponse(experienceService.getExperience(request.getPokemon(), ipAddress));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return experienceResponse;
    }

    @PayloadRoot(namespace = "com/bancaya/soap/models/held", localPart = "HeldRequest")
    @ResponsePayload
    public HeldResponse getHeld(@RequestPayload HeldRequest request) {
        HeldService heldService = new HeldService();
        HeldResponse heldResponse = new HeldResponse();
        try {
            String ipAddress = requestHttp.getHeader("X-FORWARDED-FOR");
            if (ipAddress == null) {
                ipAddress = requestHttp.getRemoteAddr();
            }
            heldResponse.setJsonResponse(heldService.getHeld(request.getPokemon(), ipAddress));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return heldResponse;
    }

    @PayloadRoot(namespace = "com/bancaya/soap/models/id", localPart = "IdRequest")
    @ResponsePayload
    public IdResponse getId(@RequestPayload IdRequest request) {
        IdService idService = new IdService();
        IdResponse idResponse = new IdResponse();
        try {
            String ipAddress = requestHttp.getHeader("X-FORWARDED-FOR");
            if (ipAddress == null) {
                ipAddress = requestHttp.getRemoteAddr();
            }
            idResponse.setJsonResponse(idService.getId(request.getPokemon(), ipAddress));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return idResponse;
    }

    @PayloadRoot(namespace = "com/bancaya/soap/models/name", localPart = "NameRequest")
    @ResponsePayload
    public NameResponse getName(@RequestPayload NameRequest request) {
        NameService nameService = new NameService();
        NameResponse nameResponse = new NameResponse();
        try {
            String ipAddress = requestHttp.getHeader("X-FORWARDED-FOR");
            if (ipAddress == null) {
                ipAddress = requestHttp.getRemoteAddr();
            }
            nameResponse.setJsonResponse(nameService.getName(request.getPokemon(), ipAddress));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return nameResponse;
    }



    @PayloadRoot(namespace = "com/bancaya/soap/models/location", localPart = "LocationRequest")
    @ResponsePayload
    public LocationResponse getLocation(@RequestPayload LocationRequest request) {
        LocationService locationService = new LocationService();
        LocationResponse locationResponse = new LocationResponse();
        try {
            String ipAddress = requestHttp.getHeader("X-FORWARDED-FOR");
            if (ipAddress == null) {
                ipAddress = requestHttp.getRemoteAddr();
            }
            locationResponse.setJsonResponse(locationService.getLocation(request.getPokemon(), ipAddress));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return locationResponse;
    }

}