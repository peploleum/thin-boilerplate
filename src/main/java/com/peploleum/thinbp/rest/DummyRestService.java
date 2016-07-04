package com.peploleum.thinbp.rest;

import com.peploleum.thinbp.service.DataProvider;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/dummy")
public class DummyRestService {

	@Inject
	private DataProvider dummyService;

	private HttpServletRequest request;

	@Context
	public void setHttpServletRequest(final HttpServletRequest request) {
		this.request = request;
	}

	@GET
	@Path("/content")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSomething() {
		return dummyService.produce();
	}
}
