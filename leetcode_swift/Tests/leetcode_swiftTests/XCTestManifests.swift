import XCTest

#if !canImport(ObjectiveC)
public func allTests() -> [XCTestCaseEntry] {
    return [
        testCase(leetcode_swiftTests.allTests),
    ]
}
#endif
