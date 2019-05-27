//
// Created by 張喬彥 on 2019-05-19.
//

import Foundation

class Solution18 {
    func fourSum(_ nums: [Int], _ target: Int) -> [[Int]] {
        var results = [[Int]]()
        if nums.count < 4 {
            return results
        }
        let nums = nums.sorted()

        var firstIndex = 0
        while (firstIndex < nums.count - 3) {
            let firstNumber = nums[firstIndex]

            var secondIndex = firstIndex + 1
            while secondIndex < nums.count - 2 {
                let secondNumber = nums[secondIndex]
                let twoSumTarget = target - (firstNumber + secondNumber)
                let result: [[Int]] = twoSum(nums, twoSumTarget, secondIndex + 1, (nums.count - 1)).map {
                    var firstTwo = [firstNumber, secondNumber]
                    firstTwo.append(contentsOf: $0)
                    return firstTwo
                }
                results.append(contentsOf: result)

                while (secondIndex < nums.count - 2 && nums[secondIndex] == nums[secondIndex + 1]) {
                    secondIndex += 1
                }
                secondIndex += 1
            }

            while (firstIndex < nums.count - 3 && nums[firstIndex] == nums[firstIndex + 1]) {
                firstIndex += 1
            }
            firstIndex += 1
        }
        return results
    }

    func twoSum(_ nums: [Int], _ target: Int, _ startIndex: Int, _ endIndex: Int) -> [[Int]] {
        var low = startIndex
        var high = endIndex
        var results = [[Int]]()
        while (low < high) {
            let lowNum = nums[low]
            let highNum = nums[high]
            let sum = lowNum + highNum
            switch sum {
            case _ where sum == target:
                results.append([lowNum, highNum])
                while (low < high && nums[low] == nums[low + 1]) {
                    low += 1
                }
                while (low < high && nums[high] == nums[high - 1]) {
                    high -= 1
                }
                low += 1; high -= 1
            case _ where sum < target:
                low += 1
            case _ where sum > target:
                high -= 1
            default: break
            }
        }
        return results
    }
}