//
// Created by 張喬彥 on 2019-05-19.
//

import XCTest
import class Foundation.Bundle

final class Solution4_swiftTests: XCTestCase {

    func test1() {
        let result = Solution18().fourSum([5,5,3,5,1,-5,1,-2], 4)

        XCTAssertEqual(result, [
            [-1, 0, 0, 1],
            [-2, -1, 1, 2],
            [-2, 0, 0, 2]
        ])
    }

}