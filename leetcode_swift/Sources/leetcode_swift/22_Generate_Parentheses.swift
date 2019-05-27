//
// Created by 張喬彥 on 2019-05-16.
//

import Foundation

class Solution22 {
    func generateParenthesis(_ n: Int) -> [String] {
        return generateParenthesis(n * 2, n, 0)
    }

    func generateParenthesis(_ charCount: Int, _ remainLeft: Int, _ availableRight: Int) -> [String] {
        if remainLeft == 0 {
            return [String(repeating: ")", count: availableRight)]
        } else {
            var startWithLeft = generateParenthesis(charCount - 1, remainLeft - 1, availableRight + 1)
                    .map { "(" + $0 }
            if availableRight > 0 {
                let startWithRight = generateParenthesis(charCount - 1, remainLeft, availableRight - 1)
                        .map { ")" + $0 }
                startWithLeft.append(contentsOf: startWithRight)
            }
            return startWithLeft
        }
    }
}