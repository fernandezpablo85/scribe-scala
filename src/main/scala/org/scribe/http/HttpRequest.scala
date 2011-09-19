package org.scribe.http

import io.Source
import java.net.{HttpURLConnection, URL}

/**
 * @author: pfernand
 */
class HttpRequest(method : Method, url : String)
{

  lazy val statusCode = response.statusCode
  lazy val bodyStream = response.stream
  lazy val body = Source.fromInputStream(bodyStream).getLines.mkString

  private val response =
  {
    val connection = new URL(url).openConnection().asInstanceOf[HttpURLConnection]
    connection.setRequestMethod(method.name)
    connection.connect()
    new HttpResponse(connection)
  }

  case class HttpResponse(connection : HttpURLConnection)
  {
    val statusCode = connection.getResponseCode
    val stream = if (successful) connection.getInputStream else connection.getErrorStream

    private def successful =
    {
      statusCode >= 200 && statusCode < 400
    }
  }
}