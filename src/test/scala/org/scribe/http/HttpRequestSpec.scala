package org.scribe.http

import org.scalatest._
import org.scalatest.matchers._
import java.io.InputStream


/**
 * @author: pfernand
 */
class HttpRequestSpec extends Spec
{

  describe ("A valid http get request")
  {
    val request = new HttpRequest(Method.GET, "http://www.google.com")

    it ("should return an 200 status code")
    {
      assert(request.statusCode == 200)
    }

    it ("should return the response contents as an InputStream")
    {
      assert(request.bodyStream.available > 0)
      assert(request.bodyStream.isInstanceOf[InputStream])
    }

    it ("should return the response contents as String")
    {
      assert(request.body.length > 0)
      assert(request.body.isInstanceOf[String])
    }
  }

  describe ("A valid http post request")
  {
    
  }

  describe ("An invalid (not found) http request")
  {
    
  }
}