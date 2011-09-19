package org.scribe.http

/**
 * @author: pfernand
 */
case class Method(name : String)

object Method
{
  val GET = Method("GET")
  val POST = Method("POST")
}
