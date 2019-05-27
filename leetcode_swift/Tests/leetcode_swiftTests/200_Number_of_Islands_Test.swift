//
// Created by 張喬彥 on 2019-05-21.
//

import XCTest
import class Foundation.Bundle

final class Solution200_swiftTests: XCTestCase {

    func testEmptyData() {
        let result = Solution200().numIslands([[Character]]())
        XCTAssertEqual(result, 0)
    }

    func test1() {
        let result = Solution200().numIslands([
            ["1", "1", "1", "1", "0"],
            ["1", "1", "0", "1", "0"],
            ["1", "1", "0", "0", "0"],
            ["0", "0", "0", "0", "0"]
        ])
        XCTAssertEqual(result, 1)
    }

    func test2() {
        let result = Solution200().numIslands([
            ["1", "1", "0", "0", "0"],
            ["1", "1", "0", "0", "0"],
            ["0", "0", "1", "0", "0"],
            ["0", "0", "0", "1", "1"]
        ])
        XCTAssertEqual(result, 3)
    }

    func test3() {
        let result = Solution200().numIslands([
            ["1", "1", "1"],
            ["0", "1", "0"],
            ["1", "1", "1"]
        ])
        XCTAssertEqual(result, 1)
    }

    func test6() {
        let result = Solution200().numIslands(
                [["1", "0", "1", "1", "1"], 
                 ["1", "0", "1", "0", "1"], 
                 ["1", "1", "1", "0", "1"]]
        )
        XCTAssertEqual(result, 1)
    }

}
