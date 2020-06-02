package com.bancaya.soap;

import com.bancaya.soap.models.abilities.AbilitiesRequest;
import com.bancaya.soap.models.abilities.AbilitiesResponse;
import com.bancaya.soap.models.experience.ExperienceRequest;
import com.bancaya.soap.models.experience.ExperienceResponse;
import com.bancaya.soap.models.held.HeldRequest;
import com.bancaya.soap.models.held.HeldResponse;
import com.bancaya.soap.services.AbilitiesService;
import com.bancaya.soap.services.ExperienceService;
import com.bancaya.soap.services.HeldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SoapEndpoint
{

    @Autowired
    public SoapEndpoint() {}

    @PayloadRoot(namespace = "com/bancaya/soap/models/abilities", localPart = "AbilitiesRequest")
    @ResponsePayload
    public AbilitiesResponse getAbilities(@RequestPayload AbilitiesRequest request) {
        AbilitiesService abilitiesService = new AbilitiesService();
        AbilitiesResponse abilitiesResponse = new AbilitiesResponse();
        try {
            abilitiesResponse.setJsonResponse(abilitiesService.getAbilities(request.getPokemon()));
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
            experienceResponse.setJsonResponse(experienceService.getExperience(request.getPokemon()));
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
            heldResponse.setJsonResponse(heldService.getHeld(request.getPokemon()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return heldResponse;
    }
}