//
// Created by 張喬彥 on 2019-05-17.
//

import XCTest
import class Foundation.Bundle

final class Solution3_swiftTests: XCTestCase {

    func testCountLessThan1() {
        let zeroResult = Solution3().lengthOfLongestSubstring("")
        XCTAssertEqual(zeroResult, 0)
        let oneResult = Solution3().lengthOfLongestSubstring("a")
        XCTAssertEqual(oneResult, 1)
    }

    func testNormalCases() {
        let result1 = Solution3().lengthOfLongestSubstring("abcabcbb")
        XCTAssertEqual(result1, 3)
        let result2 = Solution3().lengthOfLongestSubstring("bbbbb")
        XCTAssertEqual(result2, 1)
        let result3 = Solution3().lengthOfLongestSubstring("pwwkew")
        XCTAssertEqual(result3, 3)
    }

}