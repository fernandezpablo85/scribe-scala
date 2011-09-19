package org.scribe.http

import org.scalatest._

/**
 * @author: pfernand
 */
class MethodSpec extends Spec
{

  describe ("An http get method instance")
  {
    val get = Method.GET

    it ("should execute a simple get request")
    {
      get.url("http://www.google.com") {
        request => {
          println("status is: "+request.statusCode)
          println("response body is: "+request.body)
        }
      }
    }
  }
}