//
// Created by 張喬彥 on 2019-05-17.
//

import Foundation

class Solution3 {
    func lengthOfLongestSubstring(_ s: String) -> Int {
        var currentLength = 0
        var maxLength = 0
        var existCharIndexArray = [Int?](repeating: nil, count: 128)
        for (index, char) in s.enumerated() {
            guard let charAscii = char.asciiValue else {
                fatalError("char \"\(char)\" don't have an ascii value")
            }
            let asciiIndex = Int(charAscii)
            if let existIndex  = existCharIndexArray[asciiIndex] {
                let currentStartIndex = index - currentLength - 1
                let diff = existIndex - currentStartIndex
                if diff > 0 {
                    currentLength = currentLength - diff
                }
            }
            existCharIndexArray[asciiIndex] = index
            currentLength += 1
            maxLength = max(currentLength, maxLength)
        }
        return maxLength
    }
}