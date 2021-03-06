package geotrellis.analysis.results

case class RunResult(
  testName: String,
  gmResult: Option[TestResult],
  gwResult: Option[TestResult]
)

// object Result {
//   implicit object ResultJsonWriter extends RootJsonWriter[Result] {
//     def write(result: Result) =
//       JsObject(
//         "testName" -> JsString(result.testName),
//         "gmResult" -> result.gmResult.toJson,
//         "gwResult" -> result.gwResult.toJson
//       )
//   }
// }

case class TestResult(
  clusterId: String,
  startTime: Long,
  endTime: Long,
  duration: Int,
  result: String
)

object TestResult {
  def apply(
    clusterId: String,
    startTime: Long,
    endTime: Long,
    result: String
  ): TestResult = TestResult(clusterId, startTime, endTime, (endTime - startTime).toInt, result)
}

object Results {

}
