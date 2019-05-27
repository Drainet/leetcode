//
// Created by 張喬彥 on 2019-05-17.
//

import XCTest
import class Foundation.Bundle

final class Solution22_swiftTests: XCTestCase {
    func test1() {
        let result = Solution22().generateParenthesis(1)
        XCTAssert(result == ["()"])
    }

    func test2() {
        let result = Solution22().generateParenthesis(2)
        XCTAssert(result == ["(())", "()()"])
    }

    func test3() {
        let result = Solution22().generateParenthesis(3)
        XCTAssert(result == ["((()))", "(()())", "(())()", "()(())", "()()()"])
    }

    func test3Performance() {
        measure { _ = Solution22().generateParenthesis(3) }
    }
}
