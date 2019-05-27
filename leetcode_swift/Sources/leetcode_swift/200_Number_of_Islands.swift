//
// Created by 張喬彥 on 2019-05-21.
//

import Foundation

class Solution200 {
    func numIslands(_ grid: [[Character]]) -> Int {
        if grid.count == 0 {
            return 0
        }
        var copiedGrid = grid
        var total = 0

        func markIsland(x: Int, y: Int) {
            copiedGrid[x][y] = "0"
            if x > 0 && copiedGrid[x - 1][y] == "1" {
                markIsland(x: x - 1, y: y)
            }
            if y > 0 && copiedGrid[x][y - 1] == "1" {
                markIsland(x: x, y: y - 1)
            }
            if x < copiedGrid.count - 1 && copiedGrid[x + 1][y] == "1" {
                markIsland(x: x + 1, y: y)
            }
            if y < copiedGrid[x].count - 1 && copiedGrid[x][y + 1] == "1" {
                markIsland(x: x, y: y + 1)
            }
        }

        for x in 0..<copiedGrid.count {
            for y in 0..<copiedGrid[x].count {
                let current = copiedGrid[x][y]
                if current == "1" {
                    total += 1
                    markIsland(x: x, y: y)
                }
            }
        }
        return total
    }
}