package com.bancaya.soap.dao;

import com.bancaya.soap.models.db.Request;


public interface RequestDAOI {
    void insertRequest(Request request) throws Exception;
}
