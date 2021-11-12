package ch.telsearch;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.io.IOUtils;

import io.swagger.v3.oas.annotations.Hidden;

@Path("telMock")
@PermitAll
@Hidden
public class DirectoryMock
{
  @GET
  @Produces(MediaType.APPLICATION_ATOM_XML)
  public String was()
  {
    return load("directory.xml");
  }


  private static String load(String path)
  {
    try(InputStream is = DirectoryMock.class.getResourceAsStream(path))
    {
      return IOUtils.toString(is, StandardCharsets.UTF_8);
    }
    catch (IOException ex)
    {
      throw new RuntimeException("Failed to read resource: "+path);
    }
  }
}