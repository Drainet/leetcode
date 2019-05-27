//
// Created by 張喬彥 on 2019-05-15.
//

import Foundation


public class ListNode {
    public var val: Int
    public var next: ListNode?

    public init(_ val: Int) {
        self.val = val
        self.next = nil
    }
}

class Solution21 {
    func mergeTwoLists(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
        var head: ListNode?
        var end: ListNode?
        var node1: ListNode? = l1
        var node2: ListNode? = l2
        while node1 != nil || node2 != nil {
            if let firstNode = node1 {
                if let secondNode = node2 {
                    if firstNode.val < secondNode.val {
                        update(head: &head, end: &end, nextNode: &node1)
                    } else {
                        update(head: &head, end: &end, nextNode: &node2)
                    }
                } else {
                    update(head: &head, end: &end, nextNode: &node1, otherNodeEmpty: true)
                }
            } else {
                update(head: &head, end: &end, nextNode: &node2, otherNodeEmpty: true)
            }
        }
        return head
    }

    func update(head: inout ListNode?, end: inout ListNode?, nextNode currentNode: inout ListNode?, otherNodeEmpty: Bool = false) {
        if otherNodeEmpty {
            if end == nil {
                head = currentNode
            } else {
                end?.next = currentNode
            }
            currentNode = nil
        } else {
            if head == nil {
                head = currentNode
                end = currentNode
                currentNode = currentNode?.next
                end?.next = nil
            } else {
                end?.next = currentNode
                currentNode = currentNode?.next
                end = end?.next
                end?.next = nil
            }
        }
    }
}