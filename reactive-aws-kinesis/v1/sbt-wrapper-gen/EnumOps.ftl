// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ${simpleTypeName} => Scala${simpleTypeName}, _ }
import com.amazonaws.services.kinesis.model.{ ${simpleTypeName} => Java${simpleTypeName} }

object ${simpleTypeName}Ops {

  implicit class Scala${simpleTypeName}Ops(val self: Scala${simpleTypeName}) extends AnyVal {

    def toJava: Java${simpleTypeName} = {
        Java${simpleTypeName}.valueOf(self.entryName)
    }

  }

  implicit class Java${simpleTypeName}Ops(val self: String) extends AnyVal {

     def toScala: Scala${simpleTypeName} = {
        Scala${simpleTypeName}.withName(self)
     }

   }

}