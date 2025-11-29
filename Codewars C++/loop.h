#ifndef loop_H
#define loop_H
struct Node {
    Node* Next{};
    public:
    Node* getNext() { return Next; }
    void setNext(Node* next) { Next = next; }
    Node() = default;
};

#endif