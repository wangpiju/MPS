package com.boya.mps.webapi.resources;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.boya.mps.webapi.model.Message;
import com.boya.mps.webapi.service.MessageService;

/**
 * The first CRUD restful resource
 * @author Jason 
 * @createdate 20160922
 */
@Path("/message")
public class MessageResource {
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessage(){
		
    	return messageService.getAllMessage();
    }
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
    public Message addMessage(Message message){
		
    	return message;
    }
	
	@PUT  
    @Produces(MediaType.APPLICATION_JSON)  
	public Message updateCountry(Message message)  
	{  
	  return message;  
	}  
   
    @DELETE  
    @Path("/{id}")  
    @Produces(MediaType.APPLICATION_JSON)  
	public boolean deleteCountry(@PathParam("id") int id)  
	{  
	   return true; 
	    
	}  

	
}