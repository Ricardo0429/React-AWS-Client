// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class PersonMatchBuilderOps(val self: PersonMatch.Builder) extends AnyVal {

  final def timestampAsScala(value: Option[Long]): PersonMatch.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  final def personAsScala(value: Option[PersonDetail]): PersonMatch.Builder = {
    value.fold(self) { v =>
      self.person(v)
    }
  }

  final def faceMatchesAsScala(value: Option[Seq[FaceMatch]]): PersonMatch.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.faceMatches(v.asJava)
    }
  }

}

final class PersonMatchOps(val self: PersonMatch) extends AnyVal {

  final def timestampAsScala: Option[Long] = Option(self.timestamp)

  final def personAsScala: Option[PersonDetail] = Option(self.person)

  final def faceMatchesAsScala: Option[Seq[FaceMatch]] = Option(self.faceMatches).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPersonMatchOps {

  implicit def toPersonMatchBuilderOps(v: PersonMatch.Builder): PersonMatchBuilderOps = new PersonMatchBuilderOps(v)

  implicit def toPersonMatchOps(v: PersonMatch): PersonMatchOps = new PersonMatchOps(v)

}
