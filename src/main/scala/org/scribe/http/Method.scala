package org.scribe.http

/**
 * @author: pfernand
 */
case class Method(name : String)
{
  def url (_url : String)(block : HttpRequest => Unit)
  {
    block(new HttpRequest(this, _url))
  }
}

object Method
{
  val GET = Method("GET")
  val POST = Method("POST")
}
