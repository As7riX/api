package com.api;

import java.io.IOException;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class RestApp extends ResourceConfig {
    Response toResponse(E exception);
    
    public RestApp() {
        packages("com.api");
    }

    public void filter(ContainerRequestContext requestContext)
        throws IOException;

    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
		throws IOException;
		
}