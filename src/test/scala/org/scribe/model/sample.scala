package org.scribe

import org.scalatest._
import org.scalatest.matchers.MustMatchers

class DemoSpec extends Spec 
{
  
  describe ("a sample element")
  {
    
    it ("should test arithmetic")
    {
      val result = 2 + 4
      assert(result === 6)
    }
    
    it ("should perform world domination") (pending)
    
  }
}