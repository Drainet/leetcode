//
// Created by 張喬彥 on 2019-05-22.
//

import Foundation

class Solution66 {
    func plusOne(_ digits: [Int]) -> [Int] {
        var digits = digits
        var carry = false
        for index in (0..<digits.count).reversed() {
            let result = digits[index] + (carry ? 1: 0) + (index == digits.count - 1 ? 1 : 0)
            carry = false
            if result >= 10 {
                carry = true
                digits[index] = result - 10
            } else {
                digits[index] = result
            }
        }
        if carry {
            digits.insert(1, at: 0)
        }
        return digits
    }
}