package com.github.j5ik2o.reactive.aws.dynamodb.model
import java.time.Instant

final case class RestoreSummary(sourceBackupArn: Option[String] = None,
                                sourceTableArn: Option[String] = None,
                                restoreDateTime: Option[Instant] = None,
                                restoreInProgress: Option[Boolean] = Some(false)) {
  def withSourceBackupArn(value: Option[String]): RestoreSummary    = copy(sourceBackupArn = value)
  def withSourceTableArn(value: Option[String]): RestoreSummary     = copy(sourceTableArn = value)
  def withRestoreDateTime(value: Option[Instant]): RestoreSummary   = copy(restoreDateTime = value)
  def withRestoreInProgress(value: Option[Boolean]): RestoreSummary = copy(restoreInProgress = value)
}