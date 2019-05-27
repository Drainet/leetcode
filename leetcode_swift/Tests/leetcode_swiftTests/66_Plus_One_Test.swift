//
// Created by 張喬彥 on 2019-05-22.
//

import XCTest
import class Foundation.Bundle

final class Solution66_swiftTests: XCTestCase {

    func testNormal() {
        let result = Solution66().plusOne([1, 2, 3, 4])
        XCTAssertEqual(result, [1, 2, 3, 5])
    }

    func testCarry() {
        let result = Solution66().plusOne([1, 2, 3, 9])
        XCTAssertEqual(result, [1, 2, 4, 0])
    }

    func testCarryAddOneBit() {
        let result = Solution66().plusOne([9, 9, 9, 9])
        XCTAssertEqual(result, [1, 0, 0, 0, 0])
    }
}

