#include "loop.h"


int getLoopSize(Node* startNode) {
    Node* slow = startNode;
    Node* fast = startNode;

    while(fast != nullptr && fast->getNext() != nullptr) {
        slow = slow->getNext();
        fast = fast->getNext()->getNext();
        if(slow == fast) {
            Node* current = slow->getNext();
            int loopLength = 1;
            while(current != slow) {
                current = current->getNext();
                loopLength++;
            }
          return loopLength;
        }
    }
}